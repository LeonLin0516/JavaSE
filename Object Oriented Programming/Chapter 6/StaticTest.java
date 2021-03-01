// 1. static variables
//     - loads as class loads
// 2. static methods
//     - only static methods can be use within static methods
//     - can't use this, super (different life cycle)
// 3. stored inside method area - static fields
//     - stack: local variables
//     - heap: instances
//     - method area: class information, static fields, constant variables
// 4. when to use static
//     - shared variables
//     - shared methods
//         - control static variables are usually static
//         - tool methods are static
//     - constant number

public class StaticTest {
  public static void main(String[] args) {
    Chinese c1 = new Chinese();
    c1.name = "姚明";
    c1.age = 40;

    Chinese c2 = new Chinese();
    c2.name = "马龙";
    c2.age = 30;

    c1.nation = "CHN";
    c2.nation = "CHINA";
    Chinese.nation = "中国";
    System.out.println(c1.nation);
    System.out.println("*****************");

    Circle cir1 = new Circle();
    Circle cir2 = new Circle(5.0);
    System.out.println(cir1.getId());
    System.out.println(cir2.getId());
    System.out.println(Circle.getTotal());
    System.out.println("*****************");


  }
}

class Chinese {
  static String nation;
  String name;
  int age;

  public void info() {
    show();
    System.out.println("name: " + name + " age: " + age);
  }

  public static void show() {
    // info();
    System.out.println("I am Chinese");
  }
}

class Circle {
  private double radius;
  private int id;

  private static int total = 0;
  private static int init = 1001;

  public Circle() {
    this.id = Circle.init++;
    Circle.total += 1;
  }

  public Circle(double radius) {
    // this();
    this.radius = radius;
    this.id = Circle.init++;
    Circle.total += 1;
  }

  public int getId() {
    return this.id;
  }

  public static int getTotal() {
    return Circle.total;
  }
  
  public double findArea() {
    return 3.14 * radius * radius;
  }
}