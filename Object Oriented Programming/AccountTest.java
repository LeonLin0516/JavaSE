public class AccountTest {
  public static void main(String[] args) {
    Account acct = new Account(1122, 20000, 0.045);

    acct.withdraw(30000);
    System.out.println("Your balance: " + acct.getBalance());
    acct.withdraw(2500);
    System.out.println("Your balance: " + acct.getBalance());
    acct.deposite(3000);
    System.out.println("Your balance: " + acct.getBalance());
    System.out.println("Your monthly interest rate: " + acct.getMonthlyInterestRate() * 100 + "%");

    CheckAccount checkAcct = new CheckAccount(1122, 20000, 0.045, 5000);
    checkAcct.withdraw(5000);
    System.out.println("Your balance: " + checkAcct.getBalance());
    System.out.println("Your overdraft balance: " + checkAcct.getOverdraft());
    checkAcct.withdraw(18000);
    System.out.println("Your balance: " + checkAcct.getBalance());
    System.out.println("Your overdraft balance: " + checkAcct.getOverdraft());
    checkAcct.withdraw(3000);
    System.out.println("Your balance: " + checkAcct.getBalance());
    System.out.println("Your overdraft balance: " + checkAcct.getOverdraft());

    Account a = new SavingAccount(1122, 3000, 0.05, 12);
    System.out.println("****************\n");
    if (a instanceof CheckAccount) {
      CheckAccount b = (CheckAccount)a;
      b.getOverdraft();
    }
    if (a instanceof SavingAccount) {
      SavingAccount b = (SavingAccount)a;
      b.getSavingMonth();
    }
  }
}
