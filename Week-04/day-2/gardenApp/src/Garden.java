import java.util.ArrayList;
import java.util.List;

public class Garden{

  List<Plant> plants = new ArrayList<>();

  public void addPlant(Plant plant) {
    plants.add(plant);
  }
  public void status(){
    for (int i = 0; i < plants.size(); i++){
      plants.get(i).status();
    }
  }
  public void watering(double wateringAmount) {
    System.out.println();
    System.out.println("Watering with " + wateringAmount);
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).waterAmount < plants.get(i).minWater) {
        plants.get(i).watering(wateringAmount / plants.size());
      }
    }
  }
  public Garden(){
    this.plants = new ArrayList<>();
  }
}






