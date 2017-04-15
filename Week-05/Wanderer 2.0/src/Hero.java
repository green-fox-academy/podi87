
public class Hero extends GameCharacter {

  public Hero(double posX, double posY, String pictureName) {
    super(posX, posY, "hero-down.png");
  }

  public void MoveUp(double [][] wallMatrix){
    super.MoveUp(wallMatrix);
  }
  public void MoveDown(double [][] wallMatrix){
    super.MoveDown(wallMatrix);
  }
  public void MoveLeft(double [][] wallMatrix){
    super.MoveLeft(wallMatrix);
  }
  public void MoveRight(double [][] wallMatrix){
    super.MoveRight(wallMatrix);
  }
}
