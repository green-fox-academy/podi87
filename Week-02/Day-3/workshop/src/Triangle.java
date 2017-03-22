import java.util.Scanner;

/**
 * Created by Asus on 2017-03-22.
 */
public class Triangle {
  public static void main(String[] args) {
    Scanner star = new Scanner(System.in);
    System.out.println("Please type a number:");
    int ui = star.nextInt();

    for (int i = 1; i <= ui ; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
       }
      System.out.println("");
    }
  }
}

