public class Account {
  private int id;
  private double balance;
  private double annualInterestRate;

  public Account(int id, double balance, double annualInterestRate) {
    super();
    this.id = id;
    this.balance = balance;
    this.annualInterestRate = annualInterestRate;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setAnnualInterestRate(double rate) {
    this.annualInterestRate = rate;
  }

  public double getAnnualInterestRate() {
    return this.annualInterestRate;
  }

  public double getMonthlyInterestRate() {
    return this.annualInterestRate / 12;
  }

  public void withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Not enough balance in your account!");
      return;
    }
    balance -= amount;
  }

  public void deposite(double amount) {
    balance += amount;
    return;
  }
}