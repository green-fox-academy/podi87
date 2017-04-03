
public class Sharpie {
  String color;
  float width;
  float inkAmount = 100;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
  }
  public void use() {
    this.inkAmount = inkAmount - 1;
  }
  public void print(){
    System.out.println("Color: " + color);
    System.out.println("Width: " + width);
    System.out.println("Ink amount: " + inkAmount);
  }
  public static void main(String[] args) {
    Sharpie marker = new Sharpie("red",  10);
    marker.use();
    marker.print();
  }
}
