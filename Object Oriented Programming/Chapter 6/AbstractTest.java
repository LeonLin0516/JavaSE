// 1. descriptor
//    - class, method, 
// 2. abstrct class
//    - cannot instantiate
//    - must have constructor for subclass
// 3. abstrct method
//    - only method name, not method body
//    - only abstract class can have abstract methods
//    - subclass has to override all abstract methods in superclass
//    - cannot abstricize private, static, final methods

public class AbstractTest {
  public static void main(String[] args) {
    // Person p1 = new Person();
    // p1.eat();
  }
}

abstract class Person {
  String name;
  int age;
  public Person() {

  }
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  // public void eat() {
  //   System.out.println("Person eats");
  // }
  public abstract void eat();
  public void walk() {
    System.out.println("Person walks");
  }
}

class Student extends Person {
  public Student(String name, int age) {
    super(name, age);
  }
  public void eat() {
    System.out.println("Student eats");
  }
}

abstract class Employee {
  String name;
  int id;
  double salary;
  public Employee() {

  }
  public Employee(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }
  public abstract void work();
}

class Manager extends Employee {
  double bonus;
  public Manager(String name, int id, double salary, double bonus) {
    super(name, id, bonus);
  }
  public void work() {
    System.out.println("Manager works");
  }
}