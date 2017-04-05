import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  static String w1;
  static String w2;
  static String w3;
  static Anagram myAnagram;

  @BeforeClass
  public static void beforeAll() {
  w1 = "retek";
  w2 = "keret";
  w3 = "kerrret";
  myAnagram = new Anagram(w1, w2);
  }
  @Test
  public void testEqualTrue() throws Exception {
    assertTrue(myAnagram.equal(w1, w2));
  }
  @Test
  public void testEqualFalse() throws Exception {
    assertFalse(myAnagram.equal(w1, w3));
  }
}