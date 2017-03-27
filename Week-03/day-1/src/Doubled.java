import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Asus on 2017-03-27.
 */
public class Doubled {
  public static void main(String[] args) {
    Path dupli = Paths.get("duplicated.txt");
    Files.isReadable(dupli);
    //System.out.println(Files.isReadable(dupli));
    List<String> lista = new ArrayList<>();
    try {
      for (String allLines : Files.readAllLines(Paths.get("duplicated.txt"))) {
        char[] chars = allLines.toCharArray();
        String ready = "";
        for (int i = 0; i < allLines.length(); i+=2) {
          allLines.toString();
          ready = ready + allLines.charAt(i);
        }
        ready += "\n";
        System.out.println(ready);
      }
    } catch (IOException e) {
      System.out.println("not working");
    }
  }
}
