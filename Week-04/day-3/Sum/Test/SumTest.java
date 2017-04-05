import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.IdentityHashMap;

import static org.junit.Assert.*;

public class SumTest {
  static Sum summarize;
  static ArrayList<Integer> testListEmpty;
  static ArrayList<Integer> testList1;
  static ArrayList<Integer> testListOneElement;
  static ArrayList<Integer> testListMultiple;
  static ArrayList<Integer> testListNull;
  static int testNum1;
  static int testNum2;

  @BeforeClass
  public static void beforeAll() {
    summarize = new Sum(testList1);
    testList1 = new ArrayList<Integer>(2);
      for (int i = 1; i < 3; i++) {
        testList1.add(i);
    }
    testNum1 = testList1.get(0) + testList1.get(1);
    summarize = new Sum(testListEmpty);
    testListEmpty = new ArrayList<Integer>(4);
    summarize = new Sum(testListOneElement);
    testListOneElement = new ArrayList<Integer>(1);
    testListOneElement.add(5);
    summarize =  new Sum(testListMultiple);
    testListMultiple = new ArrayList<Integer>(3);
    testListMultiple.add(2);
    testListMultiple.add(2);
    testListMultiple.add(2);
    testNum2 = testListMultiple.get(0) * testListMultiple.get(1) * testListMultiple.get(2);
    summarize = new Sum(testListNull);
    testListNull = null;
  }
  @Test
  public void testGetSum() throws Exception {
    assertEquals(testNum1, summarize.getSum(testList1)) ;
  }
  @Test
  public void testEmptyList() throws Exception {
    assertEquals(0 , summarize.getSum(testListEmpty));
  }
  @Test
  public void testOneElement() throws Exception {
    assertEquals(5, summarize.getSum(testListOneElement));
  }
  @Test
  public void testMultiplie() throws Exception {
    assertEquals(testNum2, summarize.getMultiplie(testListMultiple));
  }
  @Test
  public void setNull() throws Exception {
    assertEquals(0, summarize.getNull(testListNull));
  }
}