/**
 * @author marathnamalala
 */
public class Truck extends Vehicle{
  private int bedLength;
  private double payloadCapacity;

  public Truck(String make, String model, int year, String color, double price, int bedLength,
      double payloadCapacity) {
    super(make, model, year, color, price);
    this.bedLength = bedLength;
    this.payloadCapacity = payloadCapacity;
  }


  /**
   * get field
   *
   * @return bedLength
   */
  public int getBedLength() {
    return this.bedLength;
  }

  /**
   * set field
   *
   */
  public void setBedLength(int bedLength) {
    this.bedLength = bedLength;
  }

  /**
   * get field
   *
   * @return payloadCapacity
   */
  public double getPayloadCapacity() {
    return this.payloadCapacity;
  }

  /**
   * set field
   *
   */
  public void setPayloadCapacity(double payloadCapacity) {
    this.payloadCapacity = payloadCapacity;
  }
}
