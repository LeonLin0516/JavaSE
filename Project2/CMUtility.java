import java.util.*;

public class CMUtility {
  private static Scanner scanner = new Scanner(System.in);

  private static String readKeyBoard(int limit, boolean blankReturn) {
    String line = "";

    while (scanner.hasNextLine()) {
      line = scanner.nextLine();

      if (line.length() == 0) {
        if (blankReturn) {
          return line;
        } else {
          continue;
        }
      }
      if (line.length() < 1 || line.length() >= limit) {
        System.out.print("Invalid input length (No greater than " + limit + ") Enter again: ");
        continue;
      }
      break;
    }

    return line;
  }

  public static char readMenuSelection() {
    char c;

    while (true) {
      String line = readKeyBoard(1, false);
      c = line.charAt(0);
      if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
        System.out.print("Invalid selection. Enter again: ");
      } else {
        break;
      }
    }

    return c;
  }

  public static char readChar() {
    char c = readKeyBoard(1, false).charAt(0);
    return c;
  }

  public static int readInt() {
    int n;

    while (true) {
      String line = readKeyBoard(2, false);
      try {
        n = Integer.parseInt(line);
        break;
      } catch (NumberFormatException e) {
        System.out.print("Not a number. Enter again: ");
      }
    }

    return n;
  }
}