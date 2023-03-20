import java.util.Random;

/**
 * @author marathnamalala
 */
public class Util {

  /**
   * Generates random number within 0 - 1000000000.
   *
   * @return the int
   */
   int randomNumber() {
    Random random = new Random();
    return random.nextInt(1000000000);
  }
}
