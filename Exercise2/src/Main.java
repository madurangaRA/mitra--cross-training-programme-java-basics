import java.util.HashMap;
import java.util.Scanner;

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

      Scanner scanner1 = new Scanner(System.in);
      int userType = scanner1.nextInt();

      if (userType == 3) {
        exit = true;
      }

      boolean loggedIn = true;

      while (loggedIn && userType == 2) {

        System.out.println("Please select an action by entering the  number");
        System.out.println("[1] Add Customer");
        System.out.println("[2] Add Account");
        System.out.println("[3] Remove Account");
        System.out.println("[4] Remove Customer");
        System.out.println("[5] View All Customers");
        System.out.println("[6] View All Accounts");
        System.out.println("[7] Logout");

        Scanner scanner2 = new Scanner(System.in);
        int staffAction = scanner2.nextInt();

        switch (staffAction) {
          case 1 -> bank.addCustomer();
          case 2 -> bank.addBankAccount();
          case 3 -> bank.removeBankAccount();
          case 4 -> bank.removeCustomer();
          case 5 -> bank.displayCustomers();
          case 6 -> bank.displayBankAccountsDetails();
          case 7 -> loggedIn = false;
          default -> System.out.println("Incorrect input");
        }
      }
      while (loggedIn && userType == 1) {

        System.out.println("Please Enter the Bank Account Number");
        Scanner scanner3 = new Scanner(System.in);
        BankAccount bankAccount = bank.getAccount(scanner3.nextInt());

        System.out.println("Please select an action by entering the number");
        System.out.println("[1] Deposit");
        System.out.println("[2] Withdraw");
        System.out.println("[3] Check Transaction History");
        System.out.println("[4] Logout");

        Scanner scanner4 = new Scanner(System.in);
        int customerAction = scanner4.nextInt();

        switch (customerAction) {
          case 1 -> bankAccount.deposit();
          case 2 -> bankAccount.withdraw();
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