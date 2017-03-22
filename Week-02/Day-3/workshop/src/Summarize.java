/**
 * Created by Asus on 2017-03-22.
 */
public class Summarize {
  public static void main(String[] args) {
   int[] sum = {2, 6, 23, 7,};
   int summarize = 0;

    for (int i = 0; i < sum.length; i++) {
      summarize += sum[i];
      System.out.println(summarize);
    }
  }
}
