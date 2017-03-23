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
    int size = girls.size() > boys.size() ? girls.size() : boys.size();
    for (int i = 0; i < boys.size(); i +=1) {
      if (girls.size() > i) {
        order.add(girls.get(i));
      }
      if (boys.size() > i) {
        order.add(boys.get(i));
      }
    }
    System.out.println(order);
  }
}




