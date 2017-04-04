import java.util.ArrayList;
import java.util.List;

public class Garden{
  @Override
  public String toString() {
    return "Garden{" +
            "plants=" + plants +
            '}';
  }
  List<Plant> plants = new ArrayList<>();
  public void watering1() {
    for (int i = 0; i < plants.size(); i++)
      plants.get(i).watering(40/plants.size());
  }
  public void watering2(){
    for (int i = 0; i < plants.size(); i++)
      plants.get(i).watering(70/plants.size());
  }
  public Garden(){
    this.plants = new ArrayList<>();
  }
  public void addPlant(Plant plant) {
    plants.add(plant);
  }
}






