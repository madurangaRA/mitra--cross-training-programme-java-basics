import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

/**
 * @author marathnamalala
 */
public class Main {

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

          int customerId = 0;
          customerId++;

          Scanner scanner = new Scanner(System.in);

          System.out.println("Customer Name:");
          String customerName = scanner.nextLine();

          System.out.println("Customer Email:");
          String customerEmail = scanner.nextLine();

          System.out.println("Customer Mobile Number:");
          String customerPhoneNumber = scanner.nextLine();

          Customer customer = new Customer(customerId, customerName, customerEmail,
              customerPhoneNumber);

          bank.addCustomer(customer);
        } else if (staffAction == 2) {

          int accountNumber = 0;
          accountNumber++;

          Scanner scanner2 = new Scanner(System.in);

          System.out.println("Account Holder Name:");
          String holderName = scanner2.nextLine();

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
          Scanner scanner4 = new Scanner(System.in);
          double initialAmount = scanner4.nextDouble();
          if (initialAmount < 0) {
            System.out.println("Invalid initial balance.");
            return;
          }
          BankAccount bankAccount = new BankAccount(accountNumber, holderName, initialAmount,
              accountType);

          bank.addBankAccount(bankAccount);
        }
      }
      while (loggedIn && userType == 2) {

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
          case 1 -> {
            System.out.println("Please Enter the Amount");
            Scanner scanner6 = new Scanner(System.in);
            double amount = scanner6.nextDouble();

            bankAccount.deposit(amount);

            Random rand = new Random();

            Transaction transaction = new Transaction(rand.nextInt(1000000), LocalDate.now(),
                amount, "deposit");
            bankAccount.updateTransactionHistory(transaction);
          }
          case 2 -> {
            System.out.println("Please Enter the Amount");
            Scanner scanner7 = new Scanner(System.in);
            bankAccount.withdraw(scanner7.nextDouble());
            double amount = scanner5.nextDouble();

            Random rand = new Random();

            Transaction transaction = new Transaction(rand.nextInt(1000000), LocalDate.now(),
                amount, "withdraw");
            bankAccount.updateTransactionHistory(transaction);
          }
          case 3 -> {
            bankAccount.getTransactionHistory();
          }
          case 4 -> {
            loggedIn = false;
            System.out.println("Thank you for choosing NDB bank");
          }
          default -> System.out.println("Incorrect Input");
        }
      }
    }
  }
}