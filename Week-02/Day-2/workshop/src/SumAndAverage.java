import java.util.Scanner;

/**
 * Created by Asus on 2017-03-21.
 */
public class SumAndAverage {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please type one number between 0 and 100:");
    int userInput1 = scan.nextInt();
    System.out.println("Please type one more number between 10 and 20:");
    int userInput2 = scan.nextInt();
    System.out.println("Please type one number between 20 and 86:");
    int userInput3 = scan.nextInt();
    System.out.println("Please type one number between 100 and 200:");
    int userInput4 = scan.nextInt();
    System.out.println("Please type one number between 0 and 1000:");
    int userInput5 = scan.nextInt();
    System.out.println("Sum: " + (userInput1 + userInput2 + userInput3 + userInput4 + userInput5));
    System.out.println("Average: " + (userInput1 + userInput2 + userInput3 + userInput4 + userInput5) / 5.);

  }
}
