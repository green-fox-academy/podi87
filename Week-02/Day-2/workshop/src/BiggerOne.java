import java.util.Scanner;
/**
 * Created by Asus on 2017-03-22.
 */
public class BiggerOne {
  public static void main(String[] args) {
    Scanner bigger = new Scanner(System.in);
    System.out.println("Please type your first number here: ");
    int ui1 = bigger.nextInt();
    System.out.println("Please type your second number here: ");
    int ui2 = bigger.nextInt();

    if (ui1 > ui2) {
      System.out.println("This is the bigger number: " + ui1);}
      else if (ui1 < ui2) {
      System.out.println("This is the bigger number: " + ui2);
    }
  }
}
