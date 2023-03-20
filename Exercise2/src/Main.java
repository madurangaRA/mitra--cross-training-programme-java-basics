import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

/**
 * @author marathnamalala
 */
public class Main {

  static int randomNumber() {
    Random random = new Random();
    return random.nextInt(1000000000);
  }

  /**
   * Add a customers to Customer List of the Bank
   *
   * @param bank the bank
   */
  static void addCustomer(Bank bank) {

    Customer customer = new Customer();
    customer.setCustomerId(randomNumber());

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

    bank.addCustomer(customer);

    System.out.println(customer.toString());
  }

  /**
   * Add a bank account to Bank account list of the bank
   *
   * @param bank the bank
   */
  static void addBankAccount(Bank bank) {

    Scanner scanner4 = new Scanner(System.in);
    System.out.println("Account Holder Name:");
    String holderName = scanner4.nextLine();

    System.out.println("Account Type:");
    System.out.println("[1] Saving");
    System.out.println("[2] Current");
    Scanner scanner3 = new Scanner(System.in);
    int accountTypeId = scanner3.nextInt();

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
    Scanner scanner5 = new Scanner(System.in);
    double initialAmount = scanner5.nextDouble();
    if (initialAmount < 0) {
      System.out.println("Invalid initial balance.");
      return;
    }
    BankAccount bankAccount = new BankAccount(randomNumber(), holderName,
        initialAmount,
        accountType);

    System.out.println("Bank account created successfully! The Bank account number is "
        + bankAccount.getAccountNumber());

    bank.addBankAccount(bankAccount);

    System.out.println(bankAccount.toString());
  }

  /**
   * Deposit an amount for the given bank account
   *
   * @param bankAccount the bank account
   */
  static void deposit(BankAccount bankAccount) {

    System.out.println("Please Enter the Amount");
    Scanner scanner6 = new Scanner(System.in);
    double amount = scanner6.nextDouble();

    bankAccount.deposit(amount);

    Transaction transaction = new Transaction(randomNumber(), LocalDate.now(),
        amount, "deposit");
    bankAccount.updateTransactionHistory(transaction);
  }

  /**
   * Withdraw an amount for the given bank account.
   *
   * @param bankAccount the bank account
   */
  static void withdraw(BankAccount bankAccount) {

    System.out.println("Please Enter the Amount");
    Scanner scanner7 = new Scanner(System.in);
    bankAccount.withdraw(scanner7.nextDouble());

    Transaction transaction = new Transaction(randomNumber(), LocalDate.now(),
        bankAccount.getAccountBalance(), "withdraw");
    bankAccount.updateTransactionHistory(transaction);
  }

  public static void main(String[] args) {

    Bank bank = new Bank(new HashMap<>(), new HashMap<>());

    boolean exit = false;

    while (!exit) {

      System.out.println(
          "Please select your user type by entering the  number or press [3] to exit");
      System.out.println("[1] Login as the Customer");
      System.out.println("[2] Login as the Bank Staff");

      Scanner sc = new Scanner(System.in);
      int userType = sc.nextInt();

      if (userType == 3) {
        exit = true;
      }

      boolean loggedIn = true;

      while (loggedIn && userType == 2) {

        System.out.println("Please select an action by entering the  number");
        System.out.println("[1] Add Customer");
        System.out.println("[2] Add Account");
        System.out.println("[3] Logout");

        Scanner sc2 = new Scanner(System.in);
        int staffAction = sc2.nextInt();

        if (staffAction == 3) {

          loggedIn = false;
        } else if (staffAction == 1) {

          addCustomer(bank);
        } else if (staffAction == 2) {

          addBankAccount(bank);
        }
      }
      while (loggedIn && userType == 1) {

        System.out.println("Please Enter the Bank Account Number");
        Scanner scanner4 = new Scanner(System.in);
        BankAccount bankAccount = bank.getAccount(scanner4.nextInt());

        System.out.println("Please select an action by entering the number");
        System.out.println("[1] Deposit");
        System.out.println("[2] Withdraw");
        System.out.println("[3] Check Transaction History");
        System.out.println("[4] Logout");

        Scanner scanner5 = new Scanner(System.in);
        int customerAction = scanner5.nextInt();

        switch (customerAction) {
          case 1 -> deposit(bankAccount);
          case 2 -> withdraw(bankAccount);
          case 3 -> bankAccount.getTransactionHistory();
          case 4 -> {
            loggedIn = false;
            System.out.println("Thank you for choosing us!");
          }
          default -> System.out.println("Incorrect input");
        }
      }
    }
  }
}