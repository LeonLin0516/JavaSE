public class LinearSearch {
  public static void main(String[] args) {

    String[] source = {"AA", "BB", "CC", "DD", "EE"};
    String dest = "BB";
    boolean isFlag = true;
    for (int i = 0; i < source.length; i += 1) {
      if (dest.equals(source[i])) {
        System.out.println("The element is located at " + i);
        isFlag = false;
        break;
      }
    }
    if (isFlag == true) {
      System.out.println("The element does not exist");
    }

  }
}