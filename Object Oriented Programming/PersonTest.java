// private, protected, default, public
// attributes:
//   1. has default value if not initialized
//   2. stored in heap
// local variables:
//   1. has to be defined
//   2. stored in stack

public class PersonTest {
  public static void main(String[] args) {

    Person p1 = new Person();
    p1.name = "Tom";
    p1.age = 10;
    System.out.println(p1.name + " " + p1.age + " " + p1.isMale);

    Person p2 = new Person();
    p2.name = "Jerry";
    System.out.println(p2.name + " " + p2.age + " " + p2.isMale);

    Person p3 = p1;
    p3.age = 1;
    System.out.println(p1.name + " " + p1.age + " " + p1.isMale);
  }
}