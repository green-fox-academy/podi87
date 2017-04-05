import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

   String word1;
   String word2;
   String word3;

  public boolean equal (String word1, String word2) {
    String wordX = word1.toLowerCase();
    String wordY = word2.toLowerCase();

      if (word1.length() == word2.length()) {

        char[] wordXarray = wordX.toCharArray();
        Arrays.sort(wordXarray);
        String anag1 = Arrays.toString(wordXarray);

        char[] wordYarray = word2.toCharArray();
        Arrays.sort(wordYarray);
        String anag2 = Arrays.toString(wordYarray);

        if (anag1.equals(anag2)) {
          System.out.println("True - These words are anagrams.");
          return true;
        }
      }
    System.out.println("False - These words are not anagrams.");
    return false;
  }
  public Anagram(String word1, String word2) {
    this.word1 = word1;
    this.word2 = word2;
    this.word3 = word3;
  }
}