public class SavingAccount extends Account {
  private int savingMonth;

  public SavingAccount(int id, double balance, double annualInterestRate, int savingMonth) {
    super(id, balance, annualInterestRate);
    this.savingMonth = savingMonth;
  }

  public void setSavingMonth(int savingMonth) {
    this.savingMonth = savingMonth;
  }

  public int getSavingMonth() {
    return savingMonth;
  }
}