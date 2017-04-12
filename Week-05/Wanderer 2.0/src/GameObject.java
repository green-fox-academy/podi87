
public class GameObject {

  int posX;
  int posY;
  String pictureName;

  public GameObject() {
  }

  public int getPosX() {
    return posX;
  }
  public int getPosY() {
    return posY;
  }

  public GameObject(int posX, int posY, String pictureName){
    this.posX = posX;
    this.posY = posY;
    this.pictureName = pictureName;
  }

}
