package SplitStrings;

import java.util.ArrayList;

public class SplitString {

  final static String input = "lovebarbara";

  public static void main(String[] args) {

    System.out.println(split(input, 4));

  }
  public static ArrayList<String> split(String input, int number) {
    ArrayList<String> stringArrayList = new ArrayList<>();
    try {
    String firstPart = input.substring(0, number);
    String secondPart = input.substring(number, input.length());
    stringArrayList.add(firstPart);
    stringArrayList.add(secondPart);
    } catch (StringIndexOutOfBoundsException error) {
      error.getMessage();
      System.out.println("The given number is bigger than the size");
    }catch (IndexOutOfBoundsException error) {
      error.getMessage();
      System.out.println("The given number is bigger than the size");
    }catch (Exception error) {
      error.getMessage();
      System.out.println("Some kind of error is occured");
    }
    return stringArrayList;
  }
}
