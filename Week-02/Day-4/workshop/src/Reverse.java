/**
 * Created by Asus on 2017-03-23.
 */
public class Reverse {
  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    StringBuilder rev = new StringBuilder(reversed);
    rev.reverse();
    rev.toString();
    System.out.println(rev);
    System.out.println(reversedstring(reversed));
  }
   public static String reversedstring(String name) {
    String temp ="";
    for (int i = name.length()-1; i >= 0; i--) {
          temp = temp + name.charAt(i);
   }
    return temp;
  }
}
