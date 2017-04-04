
public class Flower extends Plant {

  @Override
  public void status() {
    System.out.println("Current waterAmount: " + this.waterAmount);
    System.out.println("Color: " + color);
    if (this.minWater > this.waterAmount) {
      System.out.println(color + " flower needs water.");
    } else {
      System.out.println(color + " flower doesn't need water.");
    }
  }
  public Flower(String color) {
    super(color);
    this.minWater = 5;
    this.wateringMulti = 0.75;
  }
}
