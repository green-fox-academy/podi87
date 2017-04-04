import java.util.ArrayList;
import java.util.List;

public class Garden{

  List<Plant> plants = new ArrayList<>();
  public void status(){
    for (int i = 0; i < plants.size(); i++){
      plants.get(i).status();
    }
  }
  public void watering1(double wateringAmount) {
    for (int i = 0; i < plants.size(); i++)
      plants.get(i).watering(wateringAmount/plants.size());
    System.out.println();
    System.out.println("Watering with " + wateringAmount);
  }
  public void watering2(double wateringAmount){
    for (int i = 0; i < plants.size(); i++)
      plants.get(i).watering(wateringAmount/plants.size());
    System.out.println();
    System.out.println("Watering with " + wateringAmount);
  }
  public Garden(){
    this.plants = new ArrayList<>();
  }
  public void addPlant(Plant plant) {
    plants.add(plant);
  }
}






