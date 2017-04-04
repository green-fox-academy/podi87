
public class Plant {

  String color;
  double waterAmount;
  double wateringMulti;
  double minWater;

  public void watering(double wateringAmount) {
    this.waterAmount += wateringAmount * wateringMulti;
  }
  public void setWaterAmount(double waterAmount){
    this.waterAmount = waterAmount;
  }
  public String getColor() {
    return color;
  }
  public void status(){
    if (this.minWater < this.waterAmount){
      System.out.println("The " + color + " plant needs water");
    } else {
      System.out.println("The " + color + " plant doesn't need water");
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
