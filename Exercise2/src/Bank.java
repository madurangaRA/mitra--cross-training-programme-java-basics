import java.util.HashMap;

/**
 * @author marathnamalala
 */
public class Bank {

  private final HashMap<Integer, Customer> customerMap;
  private final HashMap<Integer, BankAccount> bankAccountMap;

  public Bank(HashMap<Integer, Customer> customerMap,
      HashMap<Integer, BankAccount> bankAccountMap) {
    this.customerMap = customerMap;
    this.bankAccountMap = bankAccountMap;
  }

  /**
   * Add customer to customer list.
   *
   * @param customer the customer
   */
  public void addCustomer(Customer customer) {
    customerMap.put(customer.getCustomerId(), customer);
  }

  /**
   * Remove customers from customer list.
   *
   * @param customer the customer
   */
  public void removeCustomer(Customer customer) {
    customerMap.remove(customer.getCustomerId());
  }

  /**
   * Add Bank Accounts to Bank Account list.
   *
   * @param bankAccount the bank account
   */
  public void addBankAccount(BankAccount bankAccount) {
    bankAccountMap.put(bankAccount.getAccountNumber(), bankAccount);
  }

  /**
   * Remove bank accounts from Bank Account list.
   *
   * @param bankAccountNumber the bank account number
   */
  public void removeBankAccount(int bankAccountNumber) {
    bankAccountMap.remove(bankAccountNumber);
  }

  /**
   * Display Bank Accounts
   */
  public void displayBankAccountsDetails() {

    for (BankAccount bankAccount : bankAccountMap.values()) {

      System.out.println("---------");
      System.out.println("Account Holder Name : " + bankAccount.getAccountHolderName());
      System.out.println("Account Number : " + bankAccount.getAccountNumber());
      System.out.println("Account Type : " + bankAccount.getAccountType());
      System.out.println("Account Balance : " + bankAccount.getAccountBalance());
      System.out.println("---------");
    }
  }

  /**
   * Display Bank Account to the given account number
   *
   * @param bankAccountNumber the bank account number
   */
  public void displayBankAccountDetails(int bankAccountNumber) {

    BankAccount bankAccount = bankAccountMap.get(bankAccountNumber);

    System.out.println("---------");
    System.out.println("Account Holder Name : " + bankAccount.getAccountHolderName());
    System.out.println("Account Number : " + bankAccount.getAccountNumber());
    System.out.println("Account Type : " + bankAccount.getAccountType());
    System.out.println("Account Balance : " + bankAccount.getAccountBalance());
    System.out.println("---------");
  }

  /**
   * Display  Customers
   */
  public void displayCustomers() {

    for (Customer customer : customerMap.values()) {

      System.out.println("---------");
      System.out.println("Customer Name : " + customer.getCustomerName());
      System.out.println("Customer Id : " + customer.getCustomerId());
      System.out.println("Customer Email : " + customer.getEmailAddress());
      System.out.println("Customer Mobile : " + customer.getPhoneNumber());
      System.out.println("---------");
    }
  }

  /**
   * Display  Customer to the given account id
   *
   * @param customerId the customer id
   */
  public void displayCustomerDetails(int customerId) {

    Customer customer = customerMap.get(customerId);

    System.out.println("---------");
    System.out.println("Customer Name : " + customer.getCustomerName());
    System.out.println("Customer Id : " + customer.getCustomerId());
    System.out.println("Customer Email : " + customer.getEmailAddress());
    System.out.println("Customer Mobile : " + customer.getPhoneNumber());
    System.out.println("---------");
  }

  /**
   * Returns  Customer to the given account id
   *
   * @param customerId the customer id
   * @return the customer
   */
  public Customer getCustomer(int customerId) {

    return customerMap.get(customerId);
  }

  /**
   * Returns  Account to the given account id
   *
   * @param accountId the account id
   * @return the account
   */
  public BankAccount getAccount(int accountId) {

    return bankAccountMap.get(accountId);
  }
}

