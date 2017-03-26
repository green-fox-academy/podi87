import java.util.Scanner;

/**
 * Created by Asus on 2017-03-26.
 */
public class Square {
  public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    System.out.println("Please enter your number below: ");
    int ui = number.nextInt();
    boolean smallNumber = (ui == 1 || ui < 1) == false;

    //int test = 4;
    if (smallNumber) {
      for (int i = 0; i < ui; i++) {
        for (int j = 0; j < 1; j++) {
          System.out.print("% ");
        }
      }
      System.out.println();
      int a = 0;
      while (a < ui - 2) {
        a++;
        for (int k = 0; k < 1; k++) {
          System.out.print("% ");
          for (int l = 1; l < ui - 1; l++) {
            for (int m = 0; m < 1; m++) {
              System.out.print("  ");
            }
          }
        }
        for (int n = ui; n < ui + 1; n++) {
          System.out.print("% ");
        }
        System.out.println();
      }
      for (int i = 0; i < ui; i++) {
        for (int j = 0; j < 1; j++) {
          System.out.print("% ");
        }
      }
    }else {
      System.out.println("Too small! Please try again and enter a bigger number!\n" +
              "% % % \n" +
              "% "+ui+" % \n" +
              "% % %");
    }
  }
}
