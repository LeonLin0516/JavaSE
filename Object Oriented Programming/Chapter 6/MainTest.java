// 1. program entrance
// 2. main is also a static method
// 3. main has args that can interact with the terminal

public class MainTest {
  public static void main(String[] args) {
    Main.main(new String[100]);
    System.out.println("*****************");
    for (int i = 0; i < args.length; i += 1) {
      System.out.println("*****" + args[i]);
      System.out.println("#####" + Integer.parseInt(args[i]));
    }
  }
}

class Main {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i += 1) {
      args[i] = "args_" + i;
      System.out.println(args[i]);
    }
  }
}