/**
 * Created by Asus on 2017-03-21.
 */
public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = (3600 * 14);
    int currentMinutes = (60 * 34);
    int currentSeconds = 42;
    int allcurrentSeconds = (currentSeconds + currentMinutes + currentHours);
    int allSecondsADay = (3600 * 24);
    System.out.println(allSecondsADay - allcurrentSeconds);

  }
 }
