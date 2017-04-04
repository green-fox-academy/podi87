
public class Plant {
  @Override
  public String toString() {
    return "Plant{" +
            "color='" + color + '\'' +
            ", waterAmount=" + waterAmount +
            ", wateringMulti=" + wateringMulti +
            ", minWater=" + minWater +
            '}';
  }
  String color;
  double waterAmount;
  double wateringMulti;
  double minWater;

  public void watering(double wateringAmount) {
    this.waterAmount = wateringAmount * wateringMulti;
  }
  public void setWaterAmount(double waterAmount){
    this.waterAmount = waterAmount;
  }
  public String getColor() {
    return color;
  }
  public void status(){
    System.out.println("Current waterAmount: " + this.waterAmount);
    System.out.println("Color: " + color);
    if (this.minWater < this.waterAmount){
      System.out.println("Needs water");
    }
  }
  public Plant(String color){
    this.color = color;
    this.waterAmount = 0;
    this.wateringMulti = wateringMulti;
  }
  public Plant(){
  }
}
