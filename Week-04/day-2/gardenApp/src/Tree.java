
public class Tree extends Plant {

  @Override
  public void status() {
    System.out.println("Current waterAmount: " + this.waterAmount);
    System.out.println("Color: " + color);
    if (this.minWater > this.waterAmount) {
      System.out.println(color + " tree needs water.");
    } else {
      System.out.println(color + " tree doesn't need water.");
    }
  }
  public Tree(String color) {
    super(color);
    this.minWater = 10;
    this.wateringMulti = 0.4;
  }
}

