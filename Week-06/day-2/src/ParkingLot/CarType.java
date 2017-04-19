package ParkingLot;

public enum  CarType  {
  HONDA, TOYOTA, KIA, AUDI, FORD;

  static int enumSize = CarType.values().length;

  public static CarType randomCar(){
    return CarType.values()[(int)(Math.random() * enumSize)];
  }
}
