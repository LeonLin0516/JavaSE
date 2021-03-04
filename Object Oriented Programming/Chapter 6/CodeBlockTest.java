// code block or instantiation block
// 1. functions: use to make instantiation
// 2. only descriptor: static
// 3. static block
//    - run when class is executed
//    - only run ONE time
//    - instantiate static attributes
//    - prioritized compared to non-static
//    - can only use static attributes and methods
// 4. non-static block
//    - run when instance is executed
//    - run MULTIPLE times
//    - instantiate attributes
//    - can use both static and non-static attributes and methods
// 5. priority
//    1. default
//    2. declaration (depends on line)
//    3. block (depends on line)
//    4. constructor
//    5. methods

public class CodeBlockTest {
  public static void main(String[] args) {
    String desc = Person.desc;
    Person p1 = new Person();
    Person p2 = new Person();
    Person.info();
    System.out.println("***************");
    new Leaf();
    // root static block -> mid static block -> leaf static block -> 
    // root regular block -> root con -> mid regular block -> mid con -> 
    // mid con msg -> leaf regular block -> leaf con
    System.out.println("***************");
    new Leaf();
  }
}

class Person {
  String name;
  int age;
  static String desc = "I am a person";

  public Person() {

  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  static {
    System.out.println("Hello, I am a static block-1");
    desc = "I am a happy person";
    // eat();
    info();
  }

  static {
    System.out.println("Hello, I am a static block-2");
  }

  {
    System.out.println("Hello, I am a non-static block");
    age = 1;
    eat();
    info();
  }

  public void eat() {

  }

  public static void info() {

  }

  public String toString() {
    return "Person[name= " + name + " age = " + age + "]";
  }
}

class Root {
  static {
    System.out.println("root static block");
  }
  {
    System.out.println("root regular block");
  }
  public Root() {
    System.out.println("root constructor with no parameter");
  }
}

class Mid extends Root {
  static {
    System.out.println("mid static block");
  }
  {
    System.out.println("mid regular block");
  }
  public Mid() {
    System.out.println("mid constructor with no parameter");
  }
  public Mid(String msg) {
    this();
    System.out.println("mid constructor with message " + msg);
  }
}

class Leaf extends Mid {
  static {
    System.out.println("leaf static block");
  }
  {
    System.out.println("leaf regular block");
  }
  public Leaf() {
    super("Leon");
    System.out.println("leaf constructor with no parameter");
  }
}