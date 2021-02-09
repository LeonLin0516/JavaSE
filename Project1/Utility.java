import java.util.Scanner;

public class Utility {
  private static Scanner scanner = new Scanner(System.in);

  public static char readMenuSelection() {
    char c; 
    while (true) {
      String select = readKeyBoard(1);
      c = select.charAt(0);
      if (c != '1' && c != '2' && c != '3' && c != 4) {
        System.out.print("Invalid selection. Please enter again: ");
      } else {
        break;
      }
    }
    return c;
  }
  
  public static int readNumber() {
    int n;
    while (true) {
      String select = readKeyBoard(4);
      try {
        n = Integer.parseInt(select);
        break;
      } catch (NumberFormatException e) {
        System.out.print("Invalid number. Please enter again: ");
      }
    }
    return n;
  }

  public static String readString() {
    String description = readKeyBoard(8);
    return description;
  }

  public static char readConfirmSelection() {
    char c;
    while (true) {
      String selection = readKeyBoard(1).toUpperCase();
      c = selection.charAt(0);
      if (c != 'Y' || c != 'N') {
        System.out.print("Invalid selection. Please enter again: ");
      } else {
        break;
      }
    }
    return c;
  }

  public static String readKeyBoard(int limit) {
    String line = "";
    while (scanner.hasNext()) {
      line = scanner.nextLine();
      if (line.length() < 1 || line.length() > limit) {
        System.out.print("Invalid input. Please enter again: ");
        continue;
      }
      break;
    }
    return line;
  }
}
