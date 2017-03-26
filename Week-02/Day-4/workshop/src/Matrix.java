/**
 * Created by Asus on 2017-03-26.
 */
public class Matrix {
  public static void main(String[] args) {
    String [][] matrix = {
            {"1 ", "0 ", "0 ", "0 "},
            {"0 ", "1 ", "0 ", "0 "},
            {"0 ", "0 ", "1 ", "0 "},
            {"0 ", "0 ", "0 ", "1 "}
            };

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column <matrix[row].length; column++) {
        System.out.print(matrix[row][column]);
      }
      System.out.println();
    }
  }
}
