
public class GameCharacter extends GameObject {

  public GameCharacter(double posX, double posY, String pictureName) {
   super(posX,posY, pictureName);
  }

  public GameCharacter() {
  }

  public void MoveUp() {
    posY = (posY - 1);
  }
  public void MoveDown() {
    posY = (posY + 1);
  }
  public void MoveLeft() {
    posX = (posX - 1);
  }
  public void MoveRight() {
    posX = (posX + 1);
  }

}
