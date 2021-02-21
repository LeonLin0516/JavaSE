public class OrderTest {

  // under same file: private, default, protected, public
  // udner same package: default, protected, public
  // under different package but is a subclass: protected, public
  // under different package but not a subclass: public
  public static void main(String[] args) {
    Order o = new Order();
    o.orderDefault = 2;
    o.orderProtect = 3;
    o.orderPublic = 4;
    o.defaultMethod();
    o.protectedMethod();
    o.publicMethod();
  }
}
