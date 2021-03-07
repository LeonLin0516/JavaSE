// 1. Template method design model

public class TemplateMethodTest {
  
  public static void main(String[] args) {
    Template t = new SubTemplate();
    t.spendTime();
  }
}

abstract class Template {
  public void spendTime() {
    long start = System.currentTimeMillis();
    this.code();
    long end = System.currentTimeMillis();
    System.out.println("time spend: " + (end - start) + "ms");
  }
  public abstract void code();
}

class SubTemplate extends Template {

  @Override
  public void code() {
    for (int i = 2; i <= 1000; i += 1) {
      boolean isFlag = true;
      for (int j = 2; j <= Math.sqrt(i); j += 1) {
        if (i % j == 0) {
          isFlag = false;
          break;
        }
      }
      if (isFlag) {
        System.out.println("prime = " + i);
      }
    }
  }
}
