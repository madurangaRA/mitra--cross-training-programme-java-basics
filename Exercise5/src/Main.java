import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author marathnamalala
 * <p>
 * If it needs to arrange in alphatical order TreeMap and TreeSet can be used. But no point of using
 * a Map here scene we don't need itterate through. Because of that best collection framework is
 * TreeSet
 */
public class Main {

  public static void main(String[] args) {

    System.out.println("How many names do you have to enter?");
    Scanner scanner = new Scanner(System.in);
    int stringLength = scanner.nextInt();

    Set<String> nameSet = new TreeSet<>();

    System.out.println("Please enter each names and hit Enter button for each name");

    for (int x = 0; x < stringLength; x++) {

      Scanner scanner2 = new Scanner(System.in);
      nameSet.add(scanner2.nextLine());
    }
    System.out.println(nameSet);
  }
}