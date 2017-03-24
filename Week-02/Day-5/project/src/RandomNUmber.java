import java.util.Random;
import java.util.Scanner;

/**
 * Created by Asus on 2017-03-24.
 */
public class RandomNUmber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please choose a range between 1 and a number whatever you want: ");
    int uirange = scan.nextInt();

    Random generate = new Random();
    int rn = generate.nextInt(uirange);
     System.out.println(rn);

    System.out.println("Please choose your lives:");
    int lives = scan.nextInt();

     for (int i = lives; i > 0; i--) {
        System.out.println("Remaining life: " + i);
        System.out.println("I've the number between 0-" + uirange + ". You have " + i + " lives. Enter number: ");
        int nextui = scan.nextInt();

        if (nextui == rn) {
         System.out.println("Congratulations. You won!");
         break;
         } else if (nextui > rn){
            System.out.println("Too high.");
         } else{
           System.out.println("Too low.");
         }
       } System.out.println("Game over!");
     }
  }

