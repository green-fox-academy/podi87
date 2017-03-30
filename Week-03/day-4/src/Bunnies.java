
public class Bunnies {
  public static void main(String[] args) {
    int bunnies = 10;
    System.out.println(ears(bunnies));
  }
  public static int ears(int bunny) {
    if (bunny == 0) {
      return 0;
    } else {
      int res = 2 + ears(bunny - 1);
      return  res;
    }
  }
}

