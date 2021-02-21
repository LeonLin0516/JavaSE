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
  }
}
