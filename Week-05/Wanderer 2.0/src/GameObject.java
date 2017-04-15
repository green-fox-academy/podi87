
public class GameObject {

  double posX;
  double posY;
  String pictureName;

  public GameObject() {
  }

  public double getPosX() {
    return posX;
  }
  public double getPosY() {
    return posY;
  }

  public GameObject(double posX, double posY, String pictureName){
    this.posX = posX;
    this.posY = posY;
    this.pictureName = pictureName;
  }

}
