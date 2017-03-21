/**
 * Created by Asus on 2017-03-21.
 */
public class Bmi {
  public static void main(String[] args) {
    double massKg = 81.2;
    double heightM = 1.78;
    double heightSquare = Math.pow(heightM, 2);
    System.out.println(massKg / heightSquare);
  }
}
