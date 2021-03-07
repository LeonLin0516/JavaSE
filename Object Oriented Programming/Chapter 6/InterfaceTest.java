// 1. Interface and class has equal structure
// 2. Define interface
//    - JDK7: only constant global variables and abstract methods
//    - JDK8: in addition, static and default methods
//    - cannot have constructors
// 3. Class implements Interface

public class InterfaceTest {
  public static void main(String[] args) {
    Plane p = new Plane();
    p.fly();
    p.stop();
  }
}

interface Flyable {

  // public static final int MAX_SPEED = 7900;
  // public static final int MIN_SPEED = 1;
  int MAX_SPEED = 7900;
  int MIN_SPEED = 1;

  // public abstract void fly();
  // public abstract void stop();
  void fly();
  void stop();
}


class Plane implements Flyable {

  @Override
  public void fly() {
    System.out.println("plane flies");
  }

  @Override
  public void stop() {
    System.out.println("plane stops");   
  }
  
}

abstract class Kite implements Flyable {

  @Override
  public void fly() {
    System.out.println("kite flies");
  }
}