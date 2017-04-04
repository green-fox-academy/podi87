
public class Tree extends Plant {

  @Override
  public void status() {
    if (this.minWater > this.waterAmount) {
      System.out.println("The " + color + " Tree needs water");
    } else {
      System.out.println("The " + color + " Tree doesn't need water");
    }
  }
  public Tree(String color) {
    super(color);
    this.minWater = 10;
    this.wateringMulti = 0.4;
  }
}

