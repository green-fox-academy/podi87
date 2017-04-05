import java.util.ArrayList;

public class Sum {
  ArrayList<Integer> list;

  public int getMultiplie(ArrayList<Integer> list) {
    int sum = 1;
    for (int i = 0; i < list.size(); i++) {
      sum *= list.get(i);
    }
    return sum;
  }
  public int getSum(ArrayList<Integer> list) {
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
       sum += list.get(i);
    }
    return sum;
  }
  public int getNull(ArrayList<Integer> list) {
    if (list != null) {
      int sum = 0;
      for (int i = 0; i < list.size(); i++) {
        sum += list.get(i);
      }
      return sum;
    } else
      return 0;
  }
  public Sum(ArrayList<Integer> list) {
    this.list = list;
  }
}
