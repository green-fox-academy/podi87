
public class Car {
  int carGasAmount;
  int capacity;

  public Car() {
    this.carGasAmount = 0;
    this.capacity = 100;
  }
  public int setCapacity(){
    return capacity;
  }
  public int setGasAmount(int carGasAmount){
    this.carGasAmount = carGasAmount;
    return carGasAmount;
  }
  public void printGas(){
    System.out.println("Car gas amount: " + carGasAmount);
  }
}
