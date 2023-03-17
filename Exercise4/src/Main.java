import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author marathnamalala
 *
 *
 * The letters are in the order of insertion so LinkedHashMap is taken here
 *
 */
public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Sentence");

    //Removed white spaces as the result doesn't contain the white space
    String inputString = scanner.nextLine().replaceAll("\\s+", "");

    Map<Character, Integer> lettersCountMap = new LinkedHashMap<>();

    for (char letter : inputString.toCharArray()) {

      if (lettersCountMap.containsKey(letter)) {
        System.out.println("sss");
        lettersCountMap.put(letter, lettersCountMap.get(letter) + 1);

      } else {
        lettersCountMap.put(letter, 1);
      }
    }

    for (Map.Entry<Character, Integer> entry : lettersCountMap.entrySet()) {
      System.out.println("● : " + entry.getKey() + " " + entry.getValue());
    }
  }
}