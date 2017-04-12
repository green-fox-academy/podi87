
public class Character extends GameObject {

  public Character(int posX, int posY, String pictureName) {
   super(posX,posY, pictureName);
  }

  public Character() {
  }

  public void MoveUp(){
    posY = posY - 1;
  }
  public void MoveDown(){
    posY = posY + 1;
  }
  public void MoveLeft(){
    posX = posX - 1;
  }
  public void MoveRight(){
    posX = posX + 1;
  }


}
