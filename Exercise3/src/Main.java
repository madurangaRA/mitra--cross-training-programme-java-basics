
/**
 * @author marathnamalala
 */
public class Main {

  public static void main(String[] args) {

    Car wpkd2332 = new Car("Suzuki", "Swift", 2005, "silver", 2750000, 4, 4, false);
    Car wpcar9099 = new Car("Suzuki", "WagonR", 2017, "white", 4500000, 4, 4, false);
    Car cpcat2332 = new Car("Toyota", "Aqua", 2017, "silver", 5750000, 4, 4, false);
    Car wpkc2332 = new Car("Suzuki", "Swift", 2005, "blue", 2750000, 4, 4, false);

    Truck sgpu3531 = new Truck("Tata", "Piaggio", 2012, "white", 9750000, 45, 455);
    Truck sgdr3531 = new Truck("Tata", "Piaggio", 2012, "black", 1000000, 45, 455);
    Truck sgpu3541 = new Truck("Demo", "Batta", 2008, "white", 8750000, 56, 500);
    Truck nccar3531 = new Truck("Demo", "Batta", 2012, "white", 9250000, 56, 500);

    Vehicle[] vehicles = {wpkd2332, wpcar9099, cpcat2332, wpkc2332, sgpu3531, sgdr3531, sgpu3541,
        nccar3531};
    Inventory inventory = new Inventory(vehicles);

    System.out.println("Average Price : " + inventory.getAveragePrice());

    System.out.println("Suzuki Swift Vehicles : ");
    for (Vehicle filteredResult : inventory.searchByMakeAndModel("Suzuki", "Swift")) {
      System.out.println(filteredResult.toString());
    }
  }
}