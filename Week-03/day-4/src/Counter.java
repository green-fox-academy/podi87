/**
 * Created by Asus on 2017-03-30.
 */
public class Counter {
  public static void main(String[] args) {
   int number = 120;
    System.out.println(factorialRec(number));

  }
  public static int factorialRec(int n) {
    if(n == 1) {
      return 1;
    }
    else {
      System.out.print(n + ", ");
      return factorialRec(n - 1);
    }
  }
}
