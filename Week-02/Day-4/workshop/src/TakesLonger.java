/**
 * Created by Asus on 2017-03-23.
 */
public class TakesLonger {
  public static void main(String[] args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String longer = " always takes longer than";
    String longer1 = "Hofstadter's Law: It" + longer + " you expect, even when you take into account Hofstadter's Law.";
    System.out.println(longer1);

    StringBuilder q = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
    q.insert(20, longer);
    System.out.println(q);
  }
}
