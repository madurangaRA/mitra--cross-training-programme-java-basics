import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author marathnamalala
 */
public class Main {

  public static void main(String[] args) {

    Bank bank = new Bank(new ArrayList<>(), new ArrayList<>());

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

    int accountNumber = 0;
    accountNumber++;

    Scanner scanner2 = new Scanner(System.in);

    System.out.println("Account Holder Name:");
    String holderName = scanner2.nextLine();

    System.out.println("Account Type:");
    System.out.println("1. Saving");
    System.out.println("2. Current");
    int accountTypeId = scanner.nextInt();
    String accountType = null;

    if (accountTypeId == 1) {
      accountType = "Saving";
    } else if (accountTypeId == 2) {
      accountType = "Current";
    } else {
      System.out.println("Wrong Input Please try again");
      return;
    }
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Initial Balance :");
    double initialAmount = sc.nextDouble();
    if (initialAmount < 0) {
      System.out.println("Invalid initial balance.");
      return;
    }
    BankAccount bankAccount = new BankAccount(accountNumber, holderName, initialAmount,
        accountType);

    bank.addBankAccount(bankAccount);
  }
}