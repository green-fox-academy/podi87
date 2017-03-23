import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Asus on 2017-03-23.
 */
public class methods {
  public static void main(String[] args) {
    String s0 = "Korte-Alma-Eper";
    ArrayList<Integer> alist = new ArrayList<>();
    HashMap<Integer, String> hm = new HashMap();
    hm.put(1, "Alma");
    System.out.println(hm.get(1));
    alist.add(1);
    alist.add(1);
    alist.add(1);
    alist.add(1);
    //alist.clear();
    //int[] aarray;
    System.out.println(alist.toString());
    System.out.println(alist.contains(1));
    System.out.println(alist.isEmpty());
  }
}





