import java.util.Scanner;
/**
 * Created by Asus on 2017-03-21.
 */
public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many chickens does the farmer have?");
    int userInput1 = scan.nextInt();
    System.out.println("And how many pigs does the farmer have?");
    int userInput2= scan.nextInt();
    System.out.println("This means, the animals have: " + ((userInput1 * 2) + (userInput2 * 4)) + " legs all together.");

  }
}
