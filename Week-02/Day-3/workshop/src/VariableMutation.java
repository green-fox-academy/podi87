/**
 * Created by Asus on 2017-03-22.
 */
public class VariableMutation {
  public static void main(String[] args) {
    double a = 24;
    int out = 0;
    if (a % 2 == 0 ) {
      out++;}
    System.out.println(out);

    int b = 10;
    String out2 = " ";
    if (10 < b && b < 20) {System.out.println(out2 ="Sweet!");}
      else if (b <= 10) {System.out.println(out2 ="More!");}
      else if (b >= 20) {System.out.println(out2 ="Less!");}

    int c = 123;
    int credits = 100;
    boolean isBonus = false;

    if (credits >= 50 && isBonus == false) {System.out.println(c - 2);}
    else if (credits < 50 && isBonus == false) {System.out.println(c - 1);}
    else if (isBonus == true) {System.out.println(c);}

    int d = 8;
    int time = 120;
    String out3 = " ";
    if ((d % 4 == 0) && time <= 200) {System.out.println(out3 = "check");}
    else if (time > 200) {System.out.println(out3 = "Time out");}
    else if (d % 4 != 0) {System.out.println(out3 = "Run Forest Run!");}



  }


}
