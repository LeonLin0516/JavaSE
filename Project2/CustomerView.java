public class CustomerView {
  private CustomerList customerList = new CustomerList(10);

  public void enterMainMenu() {
    boolean isFlag = true;

    while (isFlag) {
      System.out.println("\n-----------------Customer Information Service-----------------\n");
      System.out.println("                   1 Add    Customer");
      System.out.println("                   2 Modify Customer");
      System.out.println("                   3 Delete Customer");
      System.out.println("                   4 Customer List");
      System.out.println("                   5 Log Out\n");
      System.out.print("                   Enter(1-5): ");

      char menuSelection = CMUtility.readMenuSelection();
      switch (menuSelection) {
      case '1':
        addNewCustomer();
        break;
      case '2':
        modifyCustomer();
        break;
      case '3':
        deleteCustomer();
        break;
      case '4':
        listAllCustomers();
        break;
      case '5':
        System.out.print("Confirmation (Y/N): ");
        char confirm = CMUtility.readConfirmSelection();
        if (confirm == 'Y') {
          isFlag = false;
        }
      }
    }
  }

  private void addNewCustomer() {

  }

  private void modifyCustomer() {

  }

  private void deleteCustomer() {

  }

  private void listAllCustomers() {
    System.out.println("-----------------Customer Information Service-----------------");
    if (customerList.getTotal() == 0) {
      System.out.println("No Customer Record!");
    } else {
      System.out.println("ID\tName\tGender\tAge\tPhone\t\tEmail");
      Customer[] custs = customerList.getAllCustomers();
      for (int i = 0; i < custs.length; i += 1) {
        Customer cust = custs[i];
        System.out.println((i + 1) + "\t" 
                          + cust.getName() + "\t" 
                          + cust.getGender() + "\t" 
                          + cust.getPhone() + "\t" 
                          + cust.getEmail());
      }
    }
    System.out.println("-----------------Customer Information Service-----------------");
  }

  public static void main(String[] args) {
    CustomerView view = new CustomerView();
    view.enterMainMenu();
  }

}
