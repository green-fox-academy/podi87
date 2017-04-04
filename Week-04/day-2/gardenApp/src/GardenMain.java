
public class GardenMain {
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    myGarden.addPlant(new Flower("Yellow"));
    myGarden.addPlant(new Flower("blue"));
    myGarden.addPlant(new Tree("Purple"));
    myGarden.addPlant(new Tree("orange"));
    myGarden.watering1();
    myGarden.watering2();
  }
}
