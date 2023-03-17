/**
 * @author marathnamalala
 */
public class Car extends Vehicle {

  private int numDoors;
  private int numPassengers;
  private boolean isConvertible;

  public Car(String make, String model, int year, String color, double price, int numDoors,
      int numPassengers, boolean isConvertible) {
    super(make, model, year, color, price);
    this.numDoors = numDoors;
    this.numPassengers = numPassengers;
    this.isConvertible = isConvertible;
  }

  /**
   * get field
   *
   * @return numDoors
   */
  public int getNumDoors() {
    return this.numDoors;
  }

  /**
   * set field
   *
   */
  public void setNumDoors(int numDoors) {
    this.numDoors = numDoors;
  }

  /**
   * get field
   *
   * @return numPassengers
   */
  public int getNumPassengers() {
    return this.numPassengers;
  }

  /**
   * set field
   *
   */
  public void setNumPassengers(int numPassengers) {
    this.numPassengers = numPassengers;
  }

  /**
   * get field
   *
   * @return isConvertible
   */
  public boolean isIsConvertible() {
    return this.isConvertible;
  }

  /**
   * set field
   *
   */
  public void setIsConvertible(boolean isConvertible) {
    this.isConvertible = isConvertible;
  }
}