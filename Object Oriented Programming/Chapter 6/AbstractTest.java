import java.util.Calendar;

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
// 4. Anonymous Inner Class
//    - Abstract class = new abstract class() { override abstract methods }
// 

public class AbstractTest {
  public static void main(String[] args) {
    // Person p1 = new Person();
    // p1.eat();
    Person p = new Person() {
      @Override
      public void eat() {
        System.out.println("eat");
      }
    };
    System.out.println("****************");
    Calendar cal = Calendar.getInstance();
    int month = cal.get(Calendar.MONTH) + 1;

    Employee[] emps = new Employee[2];
    emps[0] = new MonthlyEmployee("Leon", 1002, new MyDate(1992, 2, 28), 8000.0);
    emps[1] = new HourlyEmployee("James", 1003, new MyDate(1993, 7, 16), 45, 200);
    for (int i = 0; i < emps.length; i += 1) {
      System.out.println(emps[i]);
      System.out.println("earning: " + emps[i].earning());
      if (month == emps[i].getBirthday().getMonth()) {
        System.out.println("Happy Birthday!");
      }
    }
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

class MyDate {
  private int year;
  private int month;
  private int day;

  public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getMonth() {
    return this.month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDay() {
    return this.day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  @Override
  public String toString() {
    return month + "/" + day + "/" + year;
  }
}

abstract class Employee {
  private String name;
  private int id;
  private MyDate birthday;

  public Employee() {

  }
  public Employee(String name, int id, MyDate birthday) {
    this.name = name;
    this.id = id;
    this.birthday = birthday;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public MyDate getBirthday() {
    return this.birthday;
  }

  public void setBirthday(MyDate birthday) {
    this.birthday = birthday;
  }

  public abstract double earning();
  
  @Override
  public String toString() {
    return "name = "  + name + " id = " + id + " birthday = " + birthday; 
  }
}

class MonthlyEmployee extends Employee {
  private double monthlySalary;

  public MonthlyEmployee(String name, int id, MyDate birthday, double monthlySalary) {
    super(name, id, birthday);
    this.monthlySalary = monthlySalary;
  }

  public double getMonthlySalary() {
    return this.monthlySalary;
  }

  public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }

  @Override
  public double earning() {
    return monthlySalary;
  }

  @Override
  public String toString() {
    return "MonthlyEmployee[" + super.toString() + "]";
  }
}

class HourlyEmployee extends Employee{
  private double wage;
  private double hour;

  public HourlyEmployee(String name, int id, MyDate birthday, double wage, double hour) {
    super(name, id, birthday);
    this.wage = wage;
    this.hour = hour;
  }

  @Override
  public double earning() {
    return wage * hour;
  }

  @Override
  public String toString() {
    return "HourlyEmployee[" + super.toString() + "]";
  }
  
}