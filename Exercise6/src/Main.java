import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author marathnamalala
 */
public class Main {

  public static void main(String[] args) {

    List<String> stations = new LinkedList<>();

    stations.add("Fort");
    stations.add("Maradana");
    stations.add("Dematagoda");
    stations.add("Kelaniya");
    stations.add("Wanawasala");
    stations.add("Hunupitiya");
    stations.add("Ederamulla");
    stations.add("Horape");
    stations.add("Ragama");

    System.out.println(stations);

    System.out.println("Please enter the starting station from above list");
    Scanner scanner = new Scanner(System.in);
    String start = scanner.nextLine();

    System.out.println("Please enter the destination station from above list");
    Scanner scanner2 = new Scanner(System.in);
    String destination = scanner2.nextLine();

    ListIterator<String> it = stations.listIterator(stations.indexOf(start));

    System.out.println("________");

    if (stations.indexOf(start) < stations.indexOf(destination)) {

      while (it.hasNext()) {
        String station = it.next();
        System.out.println(station);
        if (station.equals(destination)) {
          break;
        }
      }
    } else {
      while (it.hasPrevious()) {
        String station = it.previous();
        System.out.println(start);
        System.out.println(station);
        if (station.equals(destination)) {
          break;
        }
      }
    }
    System.out.println("________");
  }
}
