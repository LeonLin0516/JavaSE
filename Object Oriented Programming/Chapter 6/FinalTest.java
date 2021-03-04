// 1. final descriptor
//    - class, method, variable
// 2. final class
//    - cannot have subclass
//    - ex: String, System, StringBuffer
// 3. final method
//    - cannot be overwritten/override
//    - ex: getClass()
// 4. final variable
//    - connot be changed (constant)
//    - explicit declaration
//    - declare in block
//    - declare in constructor

public class FinalTest {
  public static void main(String[] args) {
    final int num = 5;
    // num += 5;
  }
}

final class FinalA {
  final int a = 0;
  final int b;
  final int c;
  {
    b = 3;
  }
  public FinalA() {
    c = 3;
  }
}

class FinalB {
  public final void show() {

  }
}

class FinalC extends FinalB {
  // cannot be overriden
  // public void show() {

  // }
}
