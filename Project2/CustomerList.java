public class CustomerList {
  private Customer[] customers;
  private int total = 0;

  public CustomerList(int total) {
    customers = new Customer[total];
  }

  public boolean addCustomer(Customer customer) {
    if (total >= customers.length) {
      return false;
    }
    customers[total] = customer;
    total += 1;
    return true;
  }

  public boolean replaceCustomer(int index, Customer cust) {
    if (index < 0 || index >= total) {
      return false;
    }
    customers[index] = cust;
    return true;
  }

  public boolean deleteCustomer(int index) {
    if (index < 0 || index >= total) {
      return false;
    }
    for (int i = index; i < total - 1; i += 1) {
      customers[i] = customers[i + 1];
    }
    customers[total - 1] = null;
    total -= 1;
    return true;
  }

  public Customer[] getAllCustomers() {
    Customer[] cust = new Customer[total];
    for (int i = 0; i < total; i += 1) {
      cust[i] = customers[i];
    }
    return cust;
  }

  public Customer getCustomer(int index) {
    if (index < 0 || index >= total) {
      return null;
    }
    return customers[index];
  }

  public int getTotal() {
    return total;
  }
}
