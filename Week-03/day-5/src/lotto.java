import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lotto {
  public static void main(String[] args) {
    Path lotto = Paths.get("lotto.csv");
    Files.isReadable(lotto);
    List<String> allNumberList = new ArrayList<>();
    List<Integer> intAllNumList = new ArrayList<>();
    ArrayList<Integer> lottoNumbers = new ArrayList<Integer>(90);
    List<Integer> frequency = new ArrayList<>(90);
    List<Integer> topFive = new ArrayList<>();
    List<Integer> topFiveI = new ArrayList<>();

    try {
      allNumberList = new ArrayList<String>();
      for (String linesAll : Files.readAllLines(Paths.get("lotto.csv"))) {
        String[] lines = linesAll.split(";");
        allNumberList.add(lines[lines.length - 5]);
        allNumberList.add(lines[lines.length - 4]);
        allNumberList.add(lines[lines.length - 3]);
        allNumberList.add(lines[lines.length - 2]);
        allNumberList.add(lines[lines.length - 1]);
      }
    } catch (IOException e) {
      System.out.println("wrong");
    }

    for (String s : allNumberList) {
      intAllNumList.add(Integer.valueOf(s));
    }
    //System.out.println(intAllNumList);

    for (int i = 1; i < 91; i++) {
      lottoNumbers.add(i);
    }
    //System.out.println(lottoNumbers);

    for (int i = 0; i < 90; i++) {
      int counter = 0;
      for (int j = 0; j < intAllNumList.size(); j++) {
        if (lottoNumbers.get(i) == intAllNumList.get(j)) {
          counter++;
        }
      }
      frequency.add(counter);
    }

    //System.out.println(frequency);
    getMax(topFive, topFiveI, lottoNumbers, frequency);
    getMax(topFive, topFiveI, lottoNumbers, frequency);
    getMax(topFive, topFiveI, lottoNumbers, frequency);
    getMax(topFive, topFiveI, lottoNumbers, frequency);
    getMax(topFive, topFiveI, lottoNumbers, frequency);
    getMax(topFive, topFiveI, lottoNumbers, frequency);
    getMax(topFive, topFiveI, lottoNumbers, frequency);
    getMax(topFive, topFiveI, lottoNumbers, frequency);
    getMax(topFive, topFiveI, lottoNumbers, frequency);
    System.out.println(getMax(topFive, topFiveI, lottoNumbers, frequency));
    System.out.println(topFiveI);
  }
    public static List getMax(List<Integer> topFive, List<Integer> topFiveI, ArrayList<Integer> lottoNumbers, List<Integer> frequency) {
    int maxIndex = 0;
    for (int i = 0; i < frequency.size(); i++) {
      if (frequency.get(i) > frequency.get(maxIndex)) {
        maxIndex = i;
      }
    }
    topFive.add(lottoNumbers.get(maxIndex));
    topFiveI.add(frequency.get(maxIndex));
    frequency.remove(maxIndex);
    lottoNumbers.remove(maxIndex);
    return topFive;
    }
  }

