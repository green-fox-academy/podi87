import java.util.Scanner;
/**
 * Created by Asus on 2017-03-21.
 */
public class MileToKilometer {
  public static void main(String[] args) {
    double converter = 1.61;
    Scanner scan = new Scanner(System.in);
    System.out.println("How many kilometer is a Danube River from the Black Sea to it's source?");
    int userInput1 = scan.nextInt();
    System.out.println("It is: " + userInput1 * converter + " miles");

  }
}
