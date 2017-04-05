import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  static String name;
  static Apples apples;

  @BeforeClass
  public static void beforeAll() {
    name = "korte";
    apples = new Apples(name);
  }
  @Test
  public void testGetName() throws Exception {
    assertEquals(name, apples.getApple());
  }
}