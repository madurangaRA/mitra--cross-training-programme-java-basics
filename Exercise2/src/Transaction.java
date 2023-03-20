import java.time.LocalDate;

/**
 * @author marathnamalala
 */
public class Transaction {
    private int transactionId;
    private LocalDate transactionDate;
    private double transactionAmount;
    private String transactionType;

    public Transaction(int transactionId, LocalDate transactionDate, double transactionAmount, String transactionType) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
    }

    /**
     * get field
     *
     * @return transactionId
     */
    public int getTransactionId() {
        return this.transactionId;
    }

    /**
     * set field
     *
     */
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * get field
     *
     * @return transactionDate
     */
    public LocalDate getTransactionDate() {
        return this.transactionDate;
    }

    /**
     * set field
     *
     */
    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * get field
     *
     * @return transactionAmount
     */
    public double getTransactionAmount() {
        return this.transactionAmount;
    }

    /**
     * set field
     *
     */
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * get field
     *
     * @return transactionType
     */
    public String getTransactionType() {
        return this.transactionType;
    }

    /**
     * set field
     *
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Transaction{" +
            "transactionId=" + transactionId +
            ", transactionDate=" + transactionDate +
            ", transactionAmount=" + transactionAmount +
            ", transactionType='" + transactionType + '\'' +
            '}';
    }
}
