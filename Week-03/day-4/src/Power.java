
public class Power {
  public static void main(String[] args) {
    int base = 5;
    int power = 3;
    System.out.println(powerN(base,power));
  }
  public static int powerN(int a, int b) {
    if (b == 0) {
      return 1;
    }
    else {
      return a * powerN(a, b-1);
    }
  }
}