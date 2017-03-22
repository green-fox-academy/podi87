import java.util.Scanner;

/**
 * Created by Asus on 2017-03-22.
 */
public class MultiplicationTable {
  public static void main(String[] args) {
    int ui = 0;

    Scanner scan = new Scanner(System.in);
    while (ui < 10 || ui > 20) {

      System.out.println("Please type a number between 10 and 20: ");
      ui = scan.nextInt();
      if (ui < 10 || ui > 20) {
        System.out.println("Error, try again!");}
    }
      for (int i = 1; i < 11; i++) {
        System.out.println(i + " * " + ui + " = " + (i * ui));
      }
    }
  }


