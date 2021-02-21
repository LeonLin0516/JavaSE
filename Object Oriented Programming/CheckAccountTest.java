public class CheckAccountTest {
  public static void main(String[] args) {
    CheckAccount acct = new CheckAccount(1122, 20000, 0.045, 5000);
    acct.withdraw(5000);
    System.out.println("Your balance: " + acct.getBalance());
    System.out.println("Your overdraft balance: " + acct.getOverdraft());
  }
}
