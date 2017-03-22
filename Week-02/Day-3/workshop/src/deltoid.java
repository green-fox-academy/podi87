import java.util.Scanner;

/**
 * Created by Asus on 2017-03-22.
 */
public class deltoid {
  public static void main(String[] args) {
    Scanner star = new Scanner(System.in);
    System.out.println("Please type a number:");
    int ui = star.nextInt();


    for (int i = 0; i < ui/2; i++) {
      for (int j = 0; j < (ui - i) - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (i * 2) + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for ( int l = ui/2; l < ui; l++) {
      for (int m = 1; m < (l+1) ; m++) {
        System.out.print(" ");
      }
      for (int n = 1; n < (ui-l)*2; n++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


