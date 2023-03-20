import java.util.HashMap;
import java.util.Scanner;

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
   */
  public void addCustomer() {

    Customer customer = new Customer();
    customer.setCustomerId(new Util().randomNumber());

    Scanner scanner = new Scanner(System.in);
    System.out.println("Customer Name:");
    customer.setCustomerName(scanner.nextLine());

    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Customer Email:");
    customer.setEmailAddress(scanner2.nextLine());

    Scanner scanner3 = new Scanner(System.in);
    System.out.println(
        "Customer Mobile Number (Should be a 10 digit number with no space and without country code ex: 0705007777):");
    customer.setPhoneNumber(scanner3.nextLine());

    System.out.println(
        "Customer created successfully! The customer id is " + customer.getCustomerId());

    customerMap.put(customer.getCustomerId(), customer);

    System.out.println(customer.toString());
  }

  /**
   * Remove customers from customer list.
   */
  public void removeCustomer() {

    System.out.println("Enter customer id you need to remove");
    Scanner scanner4 = new Scanner(System.in);
    customerMap.remove(scanner4.nextInt());
  }

  /**
   * Add Bank Accounts to Bank Account list.
   */
  public void addBankAccount() {

    Scanner scanner5 = new Scanner(System.in);
    System.out.println("Account Holder Name:");
    String holderName = scanner5.nextLine();

    System.out.println("Account Type:");
    System.out.println("[1] Saving");
    System.out.println("[2] Current");
    Scanner scanner6 = new Scanner(System.in);
    int accountTypeId = scanner6.nextInt();

    String accountType;

    if (accountTypeId == 1) {
      accountType = "Saving";
    } else if (accountTypeId == 2) {
      accountType = "Current";
    } else {
      System.out.println("Wrong Input Please try again");
      return;
    }
    System.out.println("Enter Initial Balance :");
    Scanner scanner7 = new Scanner(System.in);
    double initialAmount = scanner7.nextDouble();
    if (initialAmount < 0) {
      System.out.println("Invalid initial balance.");
      return;
    }
    BankAccount bankAccount = new BankAccount(new Util().randomNumber(), holderName,
        initialAmount,
        accountType);

    bankAccountMap.put(bankAccount.getAccountNumber(), bankAccount);

    System.out.println("Bank account created successfully! The Bank account number is "
        + bankAccount.getAccountNumber());

    System.out.println(bankAccount.toString());

  }

  /**
   * Remove bank accounts from Bank Account list.
   */
  public void removeBankAccount() {
    System.out.println("Please Enter the Bank Account Number");
    Scanner scanner8 = new Scanner(System.in);
    bankAccountMap.remove(scanner8.nextInt());
  }

  /**
   * Display Bank Accounts
   */
  public void displayBankAccountsDetails() {

    if(bankAccountMap.isEmpty()){
      System.out.println("No customer records available");
    }

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

    if(customerMap.isEmpty()){
      System.out.println("No customer records available");
    }

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

