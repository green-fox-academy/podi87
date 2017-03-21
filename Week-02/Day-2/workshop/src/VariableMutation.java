/**
 * Created by Asus on 2017-03-21.
 */
public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    int temp = a;
    a = a + 10;
    System.out.println(a);

    int b = 100;
    int temp1 = b;
    b = b - 7;
    System.out.println(b);

    int c = 44;
    int temp2 = c;
    c = c * 2;
    System.out.println(c);

    int d = 125;
    int temp3 = d;
    d = d / 5;
    System.out.println(d);

    int e = 8;
    int temp4 = e;
    e = e * e *e;
    System.out.println(e);

    int f1 = 123;
    int f2 = 345;
    boolean f = (f1 > f2);
    System.out.println(f);

    int g1 = 350;
    int g2 = 200;
    boolean g = (2 * g2 > g1);
    System.out.println(g);

    long h = (1357988018575474L % 11);
    boolean h1 = (h == 0);
    System.out.println(h1);

    int i1 = 10;
    int i2 = (3 * 3);
    int i3 = (3 * 3 * 3);
    boolean i = (i1 > i2 & i1 < i3);
    System.out.println(i);

    int j1 = (1521 % 3);
    int j2 = (1521 % 5);
    boolean j = (j1 == 0 | j2 == 0);
    System.out.println(j);

    String k = "Apple";
    String repeat = k;
    k = k + k + k + k;
    System.out.println(k);

  }
}
