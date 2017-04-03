
public class Counter {
  int start;
  int specified;

  public Counter(){
    start = 0;
    specified = 0;
  }
  public Counter(int start){
    this.start = start;
    this.specified = start;
  }
  public void add() {
    this.start = start + 1;
  }
  public int add(int number){
    this.start = start + number;
    return start;
  }
  public int reset(){
    this.start = specified;
    return start;
  }
  public int get(){
    System.out.println(start);
    return start;
  }

  public static void main(String[] args) {
    Counter counter = new Counter(5);
    counter.get();
    counter.add();
    counter.get();
    counter.add(12);
    counter.get();
    counter.add(2);
    counter.get();
    counter.reset();
    counter.get();


  }
}
