package ParkingLot;

public enum CarColor {
  BLACK, WHITE, SILVER, BLUE, RED;

  static int enumSize = CarColor.values().length;

  public static CarColor randomColor() {
    return CarColor.values()[(int)(Math.random() * enumSize)];
  }
}
