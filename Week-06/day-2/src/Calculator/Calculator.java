package Calculator;

public class Calculator {

  public static void main(String[] args) {
    int num1 = 4;
    int num2 = 0;
    
    System.out.println(add(num1,num2));
    System.out.println(substract(num1,num2));
    System.out.println(multiply(num1,num2));
    System.out.println(divide(num1,num2));

  }

  public static <T extends Number> Double add(T num1, T num2) {
    return num1.doubleValue() + num2.doubleValue();  }

  public static <T extends Number> Double substract(T num1, T num2) {
    return num1.doubleValue() - num2.doubleValue();
  }

  public static <T extends Number> Double multiply(T num1, T num2) {
    return num1.doubleValue() * num2.doubleValue();
  }

  public static <T extends Number> Double divide(T num1, T num2) {
    double temp = 0;
    try {
      temp = num1.doubleValue() / num2.doubleValue();
    } catch (ArithmeticException ex) {
      ex.getMessage();
      System.out.println("An error occured!");
    }
    return temp;
  }
}
