import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by Asus on 2017-03-27.
 */
public class lotto {
  public static void main(String[] args) {
    Path lotto = Paths.get("lotto.csv");
    Files.isReadable(lotto);
    //System.out.println(Files.isReadable(lotto));
    try {
      List<String> list = new ArrayList<>();
      HashMap<String, Integer> mostCommon = new HashMap<>();
      for (String linesAll : Files.readAllLines(Paths.get("lotto.csv"))) {
        //System.out.println(Arrays.toString(linesAll.split(";")));
        String[] lines = linesAll.split(";");
        //System.out.println(lines[lines.length-5]);
        list.add(lines[lines.length - 5]);
        list.add(lines[lines.length - 4]);
        list.add(lines[lines.length - 3]);
        list.add(lines[lines.length - 2]);
        list.add(lines[lines.length - 1]);
      }
      System.out.println(list);



    } catch (IOException e) {
      System.out.println("not readable");
      e.printStackTrace();
    }
  }
}
