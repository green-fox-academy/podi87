import java.util.Arrays;

/**
 * Created by Asus on 2017-03-23.
 */
public class ToDoPrint {
  public static void main(String[] args) {
    String todoText = " - Buy milk\n";
    String myToDo = "My todo: \n";
    String games = " - Download games\n";
    String diab = "   - Diablo\n";
    todoText = myToDo + todoText + games +diab;

    System.out.println(todoText);

  }
}
