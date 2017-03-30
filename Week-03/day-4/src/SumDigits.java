
public class SumDigits {
  public static void main(String[] args) {
    int number1 = 2368;
    System.out.println(sumDig(number1));
  }
  public static int sumDig(int n) {
    int right = n % 10;
    int left = n / 10;
    if (left == 0) {
      return right;
    } else {
      return right + sumDig (left);
    }
  }
}
