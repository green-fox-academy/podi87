import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Asus on 2017-03-23.
 */
public class Matchmaking {
  public static void main(String[] args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    ArrayList<String> order = new ArrayList<String>();

    for (int i = 0; i < girls.size() + boys.size()-1; i +=2) {
      order.add(i, girls.get(i/2));
      order.add(i, boys.get(i/2));
    }
    System.out.println(order);
  }

}





