public class FamilyAccount {
  
  public static void main(String[] args) {
    boolean isFlag = true;
    String details = "Income/Expense\tAccount\tAmount\tDescription\n";
    int balance = 0;
    int amount;
    String info;
    while (isFlag) {

      System.out.print("---------------Family Account---------------\n");
      System.out.println("              1. Details");
      System.out.println("              2. Enter Income");
      System.out.println("              3. Enter Expenditure");
      System.out.println("              4. Sign Out\n");
      System.out.print("                Selection(1-4): ");
      char selection = Utility.readMenuSelection();
      switch (selection) {

      case '1':
        System.out.println();
        System.out.println("----Current Income & Expenditure Details----");
        System.out.println(details);
        System.out.println("--------------------------------------------");
        break;

      case '2':
        System.out.print("Income Amount: ");
        amount = Utility.readNumber();
        System.out.print("Description: ");
        info = Utility.readString();
        System.out.println("-------------------Completed----------------\n");
        balance += amount;
        details += "Income\t\t" + balance + "\t" + amount + "\t" + info + "\n";
        break;

      case '3':
        System.out.print("Expense Amount: ");
        amount = Utility.readNumber();
        System.out.print("Description: ");
        info = Utility.readString();
        if (balance >= amount) {
          balance -= amount;
          details += "Expense\t\t" + balance + "\t" + amount + "\t" + info + "\n";
        } else {
          System.out.println("Not enough money in the account!\n");
        }
        System.out.println("-------------------Completed----------------\n");
        break;

      case '4':
        System.out.print("Comfirmation:(Y/N): ");
        char isExit = Utility.readConfirmSelection();
        if (isExit == 'Y') {
          isFlag = false;
        }
        break;

      }
    }
  }
}
