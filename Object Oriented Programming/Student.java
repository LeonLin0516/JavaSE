/* 
  keyword: super
  1. use attributes from superclass
  2. use methods from superclass
  3. use constructor from superclass
     - must be in the first line
     - implicit this() or super()
     - in multiple construtor classes, there's at least one that called super()
*/
public class Student extends Person {
  String name;
  String major;
  int id;

  public void eat() {
    System.out.println("I eat");
    talk("English");
    super.sleep();
  }

  @Override
  public void sleep() {
    System.out.println("I sleep longer");
  }
}
