
public class SumDigits {
  public static void main(String[] args) {
    int number1 = 2368;
    System.out.println(sumDig(number1));
  }
  public static int sumDig(int n) {
    int temp = (n) - (n % 10);
    int div = temp / 10;
    if (n < 10 || n == 0) {
      return n;
    } else {
      return div;
    }
  }
}
