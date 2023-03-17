import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The type Customer.
 *
 * @author marathnamalala
 */
public class Customer {

  private int customerId;
  private String customerName;
  private String emailAddress;
  private String phoneNumber;

  /**
   * Instantiates a new Customer.
   *
   * @param customerId   the customer id
   * @param customerName the customer name
   * @param emailAddress the email address
   * @param phoneNumber  the phone number
   */
  public Customer(int customerId, String customerName, String emailAddress, String phoneNumber) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.emailAddress = emailAddress;
    this.phoneNumber = phoneNumber;
  }

  /**
   * get field
   *
   * @return customerId customer id
   */
  public int getCustomerId() {
    return this.customerId;
  }

  /**
   * set field
   *
   * @param customerId the customer id
   */
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  /**
   * get field
   *
   * @return customerName customer name
   */
  public String getCustomerName() {
    return this.customerName;
  }

  /**
   * set field
   *
   * @param customerName the customer name
   */
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  /**
   * get field
   *
   * @return emailAddress email address
   */
  public String getEmailAddress() {
    return this.emailAddress;
  }

  /**
   * set field
   *
   * @param emailAddress the email address
   */
  public void setEmailAddress(String emailAddress) {
    if (isEmailAddressValid(emailAddress)) {
      this.emailAddress = emailAddress;
    } else {
      throw new IllegalArgumentException("Invalid email address.");
    }
  }

  /**
   * get field
   *
   * @return phoneNumber phone number
   */
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  /**
   * set field
   *
   * @param phoneNumber the phone number
   */
  public void setPhoneNumber(String phoneNumber) {
    if (isPhoneNumberValid(phoneNumber)) {
      this.phoneNumber = phoneNumber;
    } else {
      throw new IllegalArgumentException("Invalid phone number.");
    }
  }

  /**
   * Checks whether email address is valid
   *
   * @param email email address
   * @return boolean
   */
  private boolean isEmailAddressValid(String email) {

    String emailRegex = "^[\\w\\d._%+-]+@[\\w\\d.-]+\\.[\\w]{2,}$";
    Pattern pattern = Pattern.compile(emailRegex);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
  }

  /**
   * Checks whether mobile number is valid
   *
   * @param mobile
   * @return boolean
   */
  private boolean isPhoneNumberValid(String mobile) {

    String phoneRegex = "^\\d{10}$";
    Pattern pattern = Pattern.compile(phoneRegex);
    Matcher matcher = pattern.matcher(mobile);
    return matcher.matches();
  }
}