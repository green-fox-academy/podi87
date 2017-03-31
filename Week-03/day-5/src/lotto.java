import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class lotto {
  public static void main(String[] args) {
    Path lotto = Paths.get("lotto.csv");
    Files.isReadable(lotto);
    List<String> list = new ArrayList<>();
    List<Integer> intList = new ArrayList<>();
    List<Integer> lottoNumbers = new ArrayList<>();
    try {
      list = new ArrayList<String>();
      for (String linesAll : Files.readAllLines(Paths.get("lotto.csv"))) {
        String[] lines = linesAll.split(";");
        list.add(lines[lines.length - 5]);
        list.add(lines[lines.length - 4]);
        list.add(lines[lines.length - 3]);
        list.add(lines[lines.length - 2]);
        list.add(lines[lines.length - 1]);
      }
    }catch (IOException e) {
      System.out.println("wrong");
    }
    for (String s : list) {
      intList.add(Integer.valueOf(s));
    }
    System.out.println(intList);
    for (int i = 1; i < 91; i++){
      lottoNumbers.add(i);
    }



  }
}
