// 1. Singleton design pattern: only allows single instantiation
// 2. Eager vs Lazy
//    - Eager: long loading time (bad), secure thread (good)
//    - Lazy: delay instantiation (good), currently thread unsecure (bad) -> wait till multithread chapter

public class SingletonTest {
  public static void main(String[] args) {
    Bank bank1 = Bank.getBank();
    Bank bank2 = Bank.getBank();
    System.out.println(bank1 == bank2);
    System.out.println("*****************");

    House house1 = House.getHouse();
    House house2 = House.getHouse();
    System.out.println(house1 == house2);
    System.out.println("*****************");

  }
}

class Bank {

  // 1. private constructor
  private Bank() {

  }

  // 2. construct static instance of the class
  private static Bank b  = new Bank();

  // 3. provide static getter for the instance
  public static Bank getBank() {
    return b;
  }
}

class House {
  // 1. private constructor
  private House() {

  }

  // 2. initialize instance
  private static House h = null;

  // 3. provide static getter for the instance
  public static House getHouse() {
    if (h == null) {
      h = new House();
    }
    return h;
  }
}


