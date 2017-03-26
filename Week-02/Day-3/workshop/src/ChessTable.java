import java.util.Scanner;

/**
 * Created by Asus on 2017-03-26.
 */
public class ChessTable {
  public static void main(String[] args) {
    Scanner star = new Scanner(System.in);
    System.out.println("Please type a number:");
    int ui = star.nextInt();

    //int test = 7;
    int a = 0;
    boolean smallNumber = (ui == 1 || ui < 1) == false;

    if (smallNumber) {
      while (a < ui) {
        a++;
        for (int i = 0; i < ui; i++) {
          System.out.print("% ");
        }
        System.out.println();
        for (int j = 0; j < 1; j++) {
          System.out.print(" ");
        }
        for (int i = 0; i < ui; i++) {
          System.out.print("% ");
        }
        System.out.println();
      }
    }
  }
}
