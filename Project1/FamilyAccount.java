public class FamilyAccount {
  
  public static void main(String[] args) {
    boolean isFlag = true;
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
        System.out.println("Income/Expense\tAccount\tAmount\tDescription\n");
        System.out.println("--------------------------------------------");
        break;

      case '2':
        System.out.println('2');
        break;

      case '3':
        System.out.println('3');
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
