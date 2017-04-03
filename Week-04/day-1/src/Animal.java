
public class Animal {
  int hunger = 50;
  int thirst = 50;

  public void eat(){
    this.hunger = hunger - 1;
  }
  public void drink(){
    this.thirst = thirst - 1;
  }
  public void play() {
    this.thirst = thirst + 1;
    this.hunger = hunger + 1;
  }
  public void print(){
    System.out.println("Hunger: " + hunger);
    System.out.println("Thirst: " + thirst);
  }

  public static void main(String[] args) {
    Animal zebra = new Animal();
    zebra.drink();
    zebra.print();
    zebra.eat();
    zebra.print();
    zebra.play();
    zebra.print();

  }
}
