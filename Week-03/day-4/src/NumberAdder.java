
public class NumberAdder {
  public static void main(String[] args) {
    int number = 5;
    System.out.println(numberAdd(number));
  }
  public static int numberAdd(int n) {
    if(n == 1) {
      return 1;
    }
    else {
      return n + numberAdd(n - 1);
    }
  }
}

