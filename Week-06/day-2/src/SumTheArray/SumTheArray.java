package SumTheArray;

import java.util.Arrays;

public class SumTheArray {
  public static void main(String[] args) {
    String [] stringArray = new String[] {"1", "2", "3", "4"};
    Integer[] intArray = {1, 2, 3, 4,};

    System.out.println(sumArrayElement(intArray, 9));

  }

  public static <T extends Number> int sumArrayElement(T[] array, Integer length) {
    int sum = 0;
    try {
      for (int i = 0; i < length; i++) {
        System.out.print(array[i] + ", ");
        sum = sum + array[i].intValue();
      }
    }catch (IndexOutOfBoundsException error) {
      error.getMessage();
      System.out.println("(The given length parameter is out of bounds)");
    }
    System.out.println();
    return sum;
  }



}
