
public class Fibonacci {
  int givenNum;

  public int fibonacci(int givenNum) {
    if ( givenNum <= 0) {
      return 0;
    }
    else if (givenNum == 1) {
      return 1;
    }
    else {
      return fibonacci(givenNum - 1) + fibonacci(givenNum - 2);
    }
  }
  public Fibonacci(int givenNum) {
    this.givenNum = givenNum;
  }
}
