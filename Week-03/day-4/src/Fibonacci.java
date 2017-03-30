
public class Fibonacci {
  public static void main(String[] args) {
    int starter = 5;
    System.out.println(fiboancci(6));
  }
  public static int fiboancci(int n){
    if (n <= 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    else {
      return fiboancci(n - 1) + fiboancci(n - 2);
    }
  }
}
