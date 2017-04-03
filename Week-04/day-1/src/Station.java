
public class Station {
  int gasAmount = 1000;

   public void refill(Car car){
     this.gasAmount = gasAmount - car.capacity;
     car.setGasAmount(car.setCapacity());
   }
   public void printStationGas(){
     System.out.println("Station gas amount: " + gasAmount);
   }
  public static void main(String[] args) {
    Car car = new Car();
    Station station = new Station();
    station.refill(car);
    station.printStationGas();
    car.printGas();
  }
}
