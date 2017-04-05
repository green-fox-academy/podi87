import java.util.*;

public class CountLetters {

  String word;

  public Map<Character, Integer> letterCounter(String word) {
    Map<Character, Integer> letterMap = new HashMap<>();
    String copyWord = new String(word);
    for (int i = 0; i < word.length(); i++) {
      int temp = 0;
      for (int j = 0; j < copyWord.length(); j++) {
        if (word.charAt(i) == copyWord.charAt(j)) {
          temp++;
        }
      }
      letterMap.put(word.charAt(i), temp);
    }
    return letterMap;
  }
  public CountLetters(String word) {
    this.word = word;
  }
}
