import java.util.Scanner;

/**
 * Created by Asus on 2017-03-26.
 */
public class ParametricAverage {
  public static void main(String[] args) {
    Scanner numbers = new Scanner(System.in);
    System.out.println("Please enter a number how many numbers would you like to summarize: ");
    int num= numbers.nextInt();
    System.out.println("Please enter your numbers: ");
    double number;
    double sum = 0;
    int a = 0;
      while (a < num) {
        a++;
        number = numbers.nextInt();
        sum += number;
      }
    double average = sum / num;
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }
}
