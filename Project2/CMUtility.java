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
      if (line.length() < 1 || line.length() > limit) {
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

  public static char readChar(char defaultValue) {
    String c = readKeyBoard(1, true);
    if (c.length() == 0) {
      return defaultValue;
    }
    return c.charAt(0);
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

  public static int readInt(int defaultValue) {
    int n;
    while (true) {
      String line = readKeyBoard(2, true);
      if (line.equals("")) {
        return defaultValue;
      }
      try {
        n = Integer.parseInt(line);
        break;
      } catch (NumberFormatException e) {
        System.out.print("Not a number. Enter again: ");
      }
    }
    return n;
  }

  public static String readString(int limit) {
    return readKeyBoard(limit, false);
  }

  public static String readString(int limit, String defaultValue) {
    String str = readKeyBoard(limit, true);
    return str.equals("") ? defaultValue : str;
  }

  public static char readConfirmSelection() {
    char c;
    while (true) {
      String line = readKeyBoard(1, false).toUpperCase();
      c = line.charAt(0);
      if (c != 'Y' && c != 'N') {
        System.out.print("Invalid selection. Enter again: ");
      } else {
        break;
      }
    }
    return c;
  }
}