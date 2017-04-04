
public class GardenMain {
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    myGarden.addPlant(new Flower("yellow"));
    myGarden.addPlant(new Flower("blue"));
    myGarden.addPlant(new Tree("purple"));
    myGarden.addPlant(new Tree("orange"));
    myGarden.status();
    myGarden.watering(40);
    myGarden.status();
    myGarden.watering(70);
    myGarden.status();
  }
}
