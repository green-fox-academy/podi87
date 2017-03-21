/**
 * Created by Asus on 2017-03-21.
 */
public class CodingHours {
  public static void main(String[] args) {

    float codingHours = 6;
    float weeklycHours = (codingHours * 5);
    float weeks = 17;
    System.out.println("Coding hours in a semester only workdays [hours}: " + (weeklycHours * weeks));
    float multiplier = 100;
    float workHours = 52;
    System.out.println("Percentage of coding hours in a semester [%]: " + (weeklycHours * weeks) / (workHours * weeks) * multiplier);

  }
}
