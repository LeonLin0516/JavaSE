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
    System.out.println("-------------------------Add Customer-------------------------");
    System.out.print("Name: ");
    String name = CMUtility.readString(12);
    System.out.print("Gender: ");
    char gender = CMUtility.readChar();
    System.out.print("Age: ");
    int age = CMUtility.readInt();
    System.out.print("Phone: ");
    String phone = CMUtility.readString(10);
    System.out.print("Email: ");
    String email = CMUtility.readString(30);
    Customer cust = new Customer(name, gender, age, phone, email);
    if (customerList.addCustomer(cust) == false) {
      System.out.println("----------------------Add Customer Failed---------------------");
    } else {
      System.out.println("--------------------Add Customer Completed--------------------");
    }
  }

  private void modifyCustomer() {
    System.out.println("-----------------------Modify Customer------------------------");
    System.out.print("Please Enter Customer ID (-1 Cancel): ");
    Customer cust;
    int id;
    while (true) {
      id = CMUtility.readInt();
      if (id == -1) {
        return;
      }
      cust = customerList.getCustomer(id - 1);
      if (cust == null) {
        System.out.print("Unable to find respective customer! Enter again: ");
      } else {
        break;
      }
    }

    System.out.print("Name(" + cust.getName() + "): ");
    String name = CMUtility.readString(12, cust.getName());
    System.out.print("Gender(" + cust.getGender() + "): ");
    char gender = CMUtility.readChar(cust.getGender());
    System.out.print("Age(" + cust.getAge() + "): ");
    int age = CMUtility.readInt(cust.getAge());
    System.out.print("Phone(" + cust.getPhone() + "): ");
    String phone = CMUtility.readString(10, cust.getPhone());
    System.out.print("Email(" + cust.getEmail() + "): ");
    String email = CMUtility.readString(30, cust.getEmail());

    Customer modifiedCust = new Customer(name, gender, age, phone, email);
    customerList.replaceCustomer(id - 1, modifiedCust);

    System.out.println("------------------Modify Customer Completed-------------------");
  }

  private void deleteCustomer() {
    System.out.println("-----------------------Delete Customer------------------------");
    System.out.print("Please Enter Customer ID (-1 Cancel): ");
    int id;
    while (true) {
      id = CMUtility.readInt();
      if (id == -1) {
        return;
      }
      Customer cust = customerList.getCustomer(id - 1);
      if (cust == null) {
        System.out.println("Unable to find respective customer!");
      } else {
        break;
      }
    }
    System.out.print("Confirmation (Y/N): ");
    char confirm = CMUtility.readChar();
    if (confirm == 'Y') {
      customerList.deleteCustomer(id - 1);
      System.out.println("------------------Delete Customer Completed-------------------");
    } else {
      return;
    }
  }

  private void listAllCustomers() {
    System.out.println("------------------------Customer List-------------------------");
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
                          + cust.getAge() + "\t"
                          + cust.getPhone() + "\t" 
                          + cust.getEmail());
      }
    }
    System.out.println("-------------------Customer List Completed--------------------");
  }

  public static void main(String[] args) {
    CustomerView view = new CustomerView();
    view.enterMainMenu();
  }

}
