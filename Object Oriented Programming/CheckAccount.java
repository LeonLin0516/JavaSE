public class CheckAccount extends Account {
  
  private double overdraft;

  public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
    super(id, balance, annualInterestRate);
    this.overdraft = overdraft;
  }

  public double getOverdraft() {
    return this.overdraft;
  }

  @Override
  public void withdraw(double amount) {
    if (getBalance() >= amount) {
      super.withdraw(amount);
    } else if (this.overdraft >= amount - getBalance()) {
      overdraft -= (amount - getBalance());
      super.withdraw(getBalance());
    } else {
      System.out.println("Not enough overdrafe!");
    }
  }
}
