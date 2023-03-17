import java.util.List;

/**
 * @author marathnamalala
 */
public class Bank {

  private final List<Customer> customerList;
  private final List<BankAccount> bankAccountList;

  public Bank(List<Customer> customerList, List<BankAccount> bankAccountList) {
    this.customerList = customerList;
    this.bankAccountList = bankAccountList;
  }

  /**
   * Add customer to customer list.
   *
   * @param customer the customer
   */
  public void addCustomer(Customer customer) {
    customerList.add(customer);
  }

  /**
   * Remove customers from customer list.
   *
   * @param customer the customer
   */
  public void removeCustomer(Customer customer) {
    customerList.remove(customer);
  }

  /**
   * Add Bank Accounts to Bank Account list.
   *
   * @param bankAccount the bank account
   */
  public void addBankAccount(BankAccount bankAccount) {
    bankAccountList.add(bankAccount);
  }

  /**
   * Remove bank accounts from Bank Account list.
   *
   * @param bankAccount the bank account
   */
  public void removeBankAccount(BankAccount bankAccount) {
    bankAccountList.remove(bankAccount);
  }

  /**
   * Display Bank Accounts
   */
  public void displayBankAccounts() {

    for (BankAccount bankAccount : bankAccountList) {

      System.out.println("---------");
      System.out.println("Account Holder Name : " + bankAccount.getAccountHolderName());
      System.out.println("Account Number : " + bankAccount.getAccountNumber());
      System.out.println("Account Type : " + bankAccount.getAccountType());
      System.out.println("Account Balance : " + bankAccount.getAccountBalance());
      System.out.println("---------");
    }
  }

  /**
   * Display  Customers
   */
  public void displayCustomers() {

    for (Customer customer : customerList) {

      System.out.println("---------");
      System.out.println("Customer Name : " + customer.getCustomerName());
      System.out.println("Customer Id : " + customer.getCustomerId());
      System.out.println("Customer Email : " + customer.getEmailAddress());
      System.out.println("Customer Mobile : " + customer.getPhoneNumber());
      System.out.println("---------");
    }
  }
}

