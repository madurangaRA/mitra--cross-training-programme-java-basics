import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author marathnamalala
 */
public class BankAccount {

  private int accountNumber;
  private String accountHolderName;
  private double accountBalance;
  private String accountType;

  private final LinkedList<Transaction> transactionHistory = new LinkedList<>();

  public BankAccount(int accountNumber, String accountHolderName, double accountBalance,
      String accountType) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.accountBalance = accountBalance;
    this.accountType = accountType;
  }

  /**
   * get field
   *
   * @return accountNumber
   */
  public int getAccountNumber() {
    return this.accountNumber;
  }

  /**
   * set field
   */
  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * get field
   *
   * @return accountHolderName
   */
  public String getAccountHolderName() {
    return this.accountHolderName;
  }

  /**
   * set field
   */
  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  /**
   * get field
   *
   * @return accountBalance
   */
  public double getAccountBalance() {
    return this.accountBalance;
  }

  /**
   * set field
   */
  public void setAccountBalance(double accountBalance) {
    this.accountBalance = accountBalance;
  }

  /**
   * get field
   *
   * @return accountType
   */
  public String getAccountType() {
    return this.accountType;
  }

  /**
   * set field
   */
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  /**
   * Deposit.
   *
   */
  public void deposit() {

    System.out.println("Please Enter the Amount");
    Scanner scanner = new Scanner(System.in);
    double amount = scanner.nextDouble();

    if (amount <= 0) {
      System.out.println("Deposit amount  cannot be a negative value");
      return;
    }

    accountBalance += amount;
    System.out.println("New balance: " + accountBalance);
    Transaction transaction = new Transaction(new Util().randomNumber(), LocalDate.now(),
        amount, "deposit");
    updateTransactionHistory(transaction);
  }

  /**
   * Withdraw.
   *
   */
  public void withdraw() {

    System.out.println("Please Enter the Amount");

    Scanner scanner2 = new Scanner(System.in);
    double amount = scanner2.nextDouble();

    if (amount <= 0) {
      System.out.println("Withdraw amount  cannot be a negative value");
      return;
    }

    if (amount > accountBalance) {
      System.out.println("Sorry! you do not have enough money to complete this transaction.");
      return;
    }

    accountBalance -= amount;
    System.out.println("New balance: " + accountBalance);

    Transaction transaction = new Transaction(new Util().randomNumber(), LocalDate.now(),
        getAccountBalance(), "withdraw");
        updateTransactionHistory(transaction);
  }

  /**
   * Get transaction history.
   */
  public void getTransactionHistory() {

    for (Transaction transaction : transactionHistory) {
      System.out.println(transaction.toString());
    }
  }

  /**
   * Updates transaction history.
   *
   * @param transaction the transaction
   */
  public void updateTransactionHistory(Transaction transaction) {

    transactionHistory.add(transaction);
  }

  @Override
  public String toString() {
    return "BankAccount{" +
        "accountNumber=" + accountNumber +
        ", accountHolderName='" + accountHolderName + '\'' +
        ", accountBalance=" + accountBalance +
        ", accountType='" + accountType + '\'' +
        ", transactionHistory=" + transactionHistory +
        '}';
  }
}
