/**
 * Created by Asus on 2017-03-23.
 */
public class Factorial {
  public static void main(String[] args) {
    int[] sum = {1, 2, 3, 4};
    int factorial = 1;

    for (int i = 0; i < sum.length; i++) {
      factorial = factorial * sum[i];
    }
    System.out.println(factorial);
  }
}