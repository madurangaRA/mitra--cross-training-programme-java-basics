/**
 * @author marathnamalala
 */
public class Vehicle {
  private String make;
  private String model;
  private int year;
  private String color;
  private double price;

  public Vehicle(String make, String model, int year, String color, double price) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
    this.price = price;
  }


  /**
   * get field
   *
   * @return make
   */
  public String getMake() {
    return this.make;
  }

  /**
   * set field
   *
   */
  public void setMake(String make) {
    this.make = make;
  }

  /**
   * get field
   *
   * @return model
   */
  public String getModel() {
    return this.model;
  }

  /**
   * set field
   *
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * get field
   *
   * @return year
   */
  public int getYear() {
    return this.year;
  }

  /**
   * set field
   *
   */
  public void setYear(int year) {
    this.year = year;
  }

  /**
   * get field
   *
   * @return color
   */
  public String getColor() {
    return this.color;
  }

  /**
   * set field
   *
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * get field
   *
   * @return price
   */
  public double getPrice() {
    return this.price;
  }

  /**
   * set field
   *
   */
  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "make='" + make + '\'' +
        ", model='" + model + '\'' +
        ", year=" + year +
        ", color='" + color + '\'' +
        ", price=" + price +
        '}';
  }
}
