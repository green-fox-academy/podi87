import java.util.Scanner;

/**
 * Created by Asus on 2017-03-22.
 */
public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please type a number between 10 and 20: ");
    int ui = scan.nextInt();
    if (ui >= 10 && ui <= 20) {
      for (int i = 1; i < 11; i++) {
        System.out.println(i + " * " + ui + " = " + (i * ui));
      }
    }
    else {
        System.out.println("Please type a number according to the conditions above");
      }

      }
    }


