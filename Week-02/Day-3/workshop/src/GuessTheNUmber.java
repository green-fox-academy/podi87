import java.util.Random;
import java.util.Scanner;

/**
 * Created by Asus on 2017-03-26.
 */
public class GuessTheNUmber {
  public static void main(String[] args) {
    Scanner guess = new Scanner(System.in);
    Random number = new Random();
    int num = number.nextInt(100);
    System.out.println(num);


    for (int i = 0; i < 100; i++) {
      System.out.println("Guess my number between 0 and 100: ");
      int ui = guess.nextInt();
      if(ui == num) {
        System.out.println("Correct! You found the number: " + num + " You won!");
        break;
      } else if (ui < num){
        System.out.println("Too low!");
      } else if (ui > num) {
        System.out.println("Too high!");
      }
    }
  }
}
