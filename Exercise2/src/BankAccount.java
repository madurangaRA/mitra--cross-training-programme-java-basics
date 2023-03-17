import java.util.List;

/**
 * @author marathnamalala
 */
public class BankAccount {

  private int accountNumber;
  private String accountHolderName;
  private double accountBalance;
  private String accountType;

  private List<Transaction> transactionHistory;


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
   * @param amount the amount
   */
  public void deposit(double amount) {
    if (amount <= 0) {
      System.out.println("Deposit amount  cannot be a negative value");
      return;
    }

    accountBalance += amount;
    System.out.println("New balance: " + accountBalance);
  }

  /**
   * Withdraw.
   *
   * @param amount the amount
   */
  public void withdraw(double amount) {
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
  }

  /**
   * Get transaction history.
   */
  public void getTransactionHistory() {

    for (Transaction transaction : transactionHistory) {
      System.out.println(transaction.toString());
    }
  }
}
