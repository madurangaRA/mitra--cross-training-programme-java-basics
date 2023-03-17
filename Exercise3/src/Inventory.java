import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author marathnamalala
 */
public class Inventory {

  Vehicle[] vehicles;
  public Inventory(Vehicle[] vehicles) {
    this.vehicles = vehicles;
  }

  /**
   * get field
   *
   * @return vehicles
   */
  public Vehicle[] getVehicles() {
    return this.vehicles;
  }

  /**
   * set field
   *
   */
  public void setVehicles(Vehicle[] vehicles) {
    this.vehicles = vehicles;
  }

  /**
   * Gets average price.
   *
   * @return the average price
   */
  public double getAveragePrice() {
    double totalPrice = 0;
    for (Vehicle vehicle : vehicles) {

      totalPrice = totalPrice + vehicle.getPrice();
    }
    return totalPrice / vehicles.length;
  }

  /**
   * Gives a list of vehicles matched the given make and model .
   *
   * @param make  the make
   * @param model the model
   * @return the list
   */
  public List<Vehicle> searchByMakeAndModel(String make, String model){

    List<Vehicle> filteredVehicles = new ArrayList<>();

    for (Vehicle vehicle : vehicles) {

      if((vehicle.getMake().equals(make)) && (vehicle.getModel().equals(model))) {

        filteredVehicles.add(vehicle);
      }

    }
    return filteredVehicles;
  }

  @Override
  public String toString() {
    return "Inventory{" +
        "vehicles=" + Arrays.toString(vehicles) +
        '}';
  }
}
