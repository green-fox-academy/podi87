import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  static int tester1;
  static int tester2;
  static int tester3;
  static int tester4;
  static int tester5;
  static Fibonacci test;

  @BeforeClass
  public static void beforeAll() {
    tester1 = 5;
    tester2 = 0;
    tester3 = 1;
    tester4 = -3;
    tester5 = 10;
    test = new Fibonacci(tester1);
  }
  @Test
  public void testFibonacci1() throws Exception {
    assertEquals(tester1, test.fibonacci(tester1));
  }
  @Test
  public void testFibonacci2() throws Exception {
    assertEquals(tester2, test.fibonacci(tester2));
  }
  @Test
  public void testFibonacci3() throws Exception {
    assertEquals(tester3, test.fibonacci(tester3));
  }
  @Test
  public void testFibonacci4() throws Exception {
    assertEquals(0, test.fibonacci(tester4));
  }
  @Test
  public void testFibonacci5() throws Exception {
    assertEquals(55, test.fibonacci(tester5));
  }
}