import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by Asus on 2017-03-24.
 */
public class Anagram {
  public static void main(String[] args) {

    Scanner ana = new Scanner(System.in);
    System.out.println("Please type a word below: ");
    String ui1 = ana.nextLine();
    System.out.println("Please type another word below: ");
    String ui2 = ana.nextLine();

    String word1 = ui1.toLowerCase();
    String word2 = ui2.toLowerCase();

    if (equal(word1, word2)) {
      System.out.println("True - These words are anagrams.");
    } else {
      System.out.println("False - These words are not anagrams.");
    }
  }
  public static boolean equal (String word1, String word2) {

    boolean space = ((word1.contains(" ") || word2.contains(" ")) == true);
    boolean isEqual = false;

    if (!space) {
      if (word1.length() == word2.length()) {

        char[] word1array = word1.toCharArray();
        Arrays.sort(word1array);
        String ana1 = Arrays.toString(word1array);

        char[] word2array = word2.toCharArray();
        Arrays.sort(word2array);
        String ana2 = Arrays.toString(word2array);

        if (ana1.equals(ana2)) {
          isEqual = true;
        }
      }
    } return isEqual;
  }
}