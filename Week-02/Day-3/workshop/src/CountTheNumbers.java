import java.util.Scanner;

/**
 * Created by Asus on 2017-03-22.
 */
public class CountTheNumbers {
  public static void main(String[] args) {
    Scanner count = new Scanner(System.in);
    System.out.println("Please type your number between 0 and 100:");
    int ui1 = count.nextInt();
    System.out.println("Please type another number between 0 and 100:");
    int ui2 = count.nextInt();

    boolean notBigger = ui2 < ui1;
    if (notBigger) {
      System.out.println("The second number should be bigger.");}
      else if (notBigger == false) {
      for (ui1 = ui1; ui1 < ui2; ui1++) {
        System.out.println(ui1);}
    }
  }
}
