package ParkingLot;

import ParkingLot.Car;
import ParkingLot.CarColor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarMain {

   static List<Car> carList;
   static Car newCar;
   static Map <CarType, CarColor> carMap;

  public static void main(String[] args) {
    carList = new ArrayList<>();

    for (int i = 0; i < 256; i++) {
      CarType tempType = CarType.randomCar();
      CarColor tempColor = CarColor.randomColor();
      carList.add(newCar = new Car(tempType, tempColor));
    }
    System.out.println("AUDI :" + counter(CarType.AUDI, carList));
    System.out.println("HONDA :" + counter(CarType.HONDA, carList));
    System.out.println("FORD :" + counter(CarType.FORD, carList));
    System.out.println("KIA :" + counter(CarType.KIA, carList));
    System.out.println("TOYOTA :" + counter(CarType.TOYOTA, carList));
    System.out.println();
    System.out.println("BLACK :" + counter(CarColor.BLACK, carList));
    System.out.println("WHITE :" + counter(CarColor.WHITE, carList));
    System.out.println("SILVER :" + counter(CarColor.SILVER, carList));
    System.out.println("BLUE :" + counter(CarColor.BLUE, carList));
    System.out.println("RED :" + counter(CarColor.RED, carList));
    System.out.println();
    System.out.println(String.valueOf(mostFrequent(carList).type) + " " + String.valueOf(mostFrequent(carList).color));



  }
  public static <T> Integer counter(T carProperties, List<Car> carList) {
    int innerCounter = 0;
    for (Car c : carList) {
      if (c.type == carProperties) {
        innerCounter++;
      } else if (c.color == carProperties) {
        innerCounter++;
      }
    }
    return innerCounter;
  }

  public static Car mostFrequent(List<Car> carList) {
    List<CarType> carTypeList = new ArrayList<>();
    for (int i = 0; i < CarType.enumSize; i++) {
      carTypeList.add(CarType.values()[i]);
    }

    List<CarColor> carColorList = new ArrayList<>();
    for (int i = 0; i < CarColor.enumSize; i++) {
      carColorList.add(CarColor.values()[i]);
    }

    List<Car> frequentCars = new ArrayList<>();
    List<Integer> frequentCarsNumber = new ArrayList<>();
    for (int i = 0; i < carList.size(); i++) {
      int carCounter = 0;
      for (int j = 0; j < carTypeList.size(); j++) {
        if (carList.get(i).type == carTypeList.get(j)) {
          carCounter++;
        }
      }
      for (int k = 0; k < carColorList.size(); k++) {
        if (carList.get(i).color == carColorList.get(k)) {
          carCounter++;
        }
      }
      frequentCars.add(carList.get(i));
      frequentCarsNumber.add(carCounter);
    }
    int maxIndex = 0;
    for (int i = 0; i < frequentCarsNumber.size(); i++) {
      if (frequentCarsNumber.get(i) > frequentCarsNumber.get(maxIndex)) {
        maxIndex = i;
      }
    }
    return frequentCars.get(maxIndex);
  }
}
