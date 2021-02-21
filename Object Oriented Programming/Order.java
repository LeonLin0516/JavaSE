public class Order {
  private int orderPrivate;
  int orderDefault;
  protected int orderProtect;
  public int orderPublic;

  private void privateMethod() {
    orderPrivate = 1;
    orderDefault = 2;
    orderProtect = 3;
    orderPublic = 4;
  }

  void defaultMethod() {
    orderPrivate = 1;
    orderDefault = 2;
    orderProtect = 3;
    orderPublic = 4;
  }

  protected void protectedMethod() {
    orderPrivate = 1;
    orderDefault = 2;
    orderProtect = 3;
    orderPublic = 4;
  }

  public void publicMethod() {
    orderPrivate = 1;
    orderDefault = 2;
    orderProtect = 3;
    orderPublic = 4;
  }
}
