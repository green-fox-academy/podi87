import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {

  static String testWord;
  static CountLetters test;
  static  HashMap<Character, Integer> map;
  
  @BeforeClass
  public static void beforeAll() {
    testWord = "tester";
    test = new CountLetters(testWord);
    map = new HashMap<>();
    map.put(testWord.charAt(0), 2);
    map.put(testWord.charAt(1), 2);
    map.put(testWord.charAt(2), 1);
    map.put(testWord.charAt(5), 1);
  }
  @Test
  public void testLetterCounter() throws Exception {
    assertEquals(map, test.letterCounter(testWord));
  }
}