import java.util.Scanner;

public class SumDigits {
  public static void main(String[] args) {
    int number1 = 126;
    System.out.println(sumDig(number1));
  }
  public static int sumDig(int n) {
    if (n < 10 || n == 0) {
      return n;
    } else {
      return n % 10 + sumDig(n = n / 10);
    }
  }
}
