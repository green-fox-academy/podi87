
public class MutantBunnies {
  public static void main(String[] args) {
    int bunnies = 5;
    System.out.println(ears(bunnies));
  }
  public static int ears(int bunny) {
    if (bunny == 0) {
      return 0;
    } else if (bunny % 2 != 0) {
      int res = 2 + ears(bunny - 1);
      return res;
    } else {
      int res = 3 + ears(bunny - 1);
      return res;
    }
  }
}

