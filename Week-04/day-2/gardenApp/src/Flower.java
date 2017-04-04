
public class Flower extends Plant {

  @Override
  public void status() {
    if (this.minWater > this.waterAmount) {
      System.out.println("The " + color + " Flower needs water");
    } else {
      System.out.println("The " + color + " Flower doesn't need water");
    }
  }
  public Flower(String color) {
    super(color);
    this.minWater = 5;
    this.wateringMulti = 0.75;
  }
}
