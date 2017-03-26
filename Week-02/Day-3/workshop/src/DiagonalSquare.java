import java.util.Scanner;

/**
 * Created by Asus on 2017-03-26.
 */
public class DiagonalSquare {
  public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    System.out.println("Please enter your number below: ");
    int ui = number.nextInt();

    boolean smallNumber = (ui == 1 || ui < 1) == false;
    //int test = 5;
    if (smallNumber) {
      for (int i = 0; i < ui; i++) {
        for (int i1 = 0; i1 < 1; i1++) {
          System.out.print("% ");
        }
      }
      System.out.println();
      int a = 0;
      while (a < ui - 2) {
        a++;
        for (int j3 = 0; j3 < 1; j3++) {
          System.out.print("% ");
        }
        for (int j2 = 1; j2 < a; j2++) {
          System.out.print("  ");
        }
        for (int j = 0; j < 1; j++) {
          System.out.print("% ");
        }
        for (int j2 = ui - 2; j2 > a; j2--) {
          System.out.print("  ");
        }
        for (int j3 = 0; j3 < 1; j3++) {
          System.out.print("% ");
        }
        System.out.println();
      }
      for (int i = 0; i < ui; i++) {
        for (int i1 = 0; i1 < 1; i1++) {
          System.out.print("% ");
        }
      }
    } else {
      System.out.println(("Too small! Please try again and enter a bigger number!\n" +
              "% % % \n" +
              "% "+ui+" % \n" +
              "% % %"));
    }
  }
}






