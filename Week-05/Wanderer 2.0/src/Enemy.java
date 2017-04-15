
import java.util.*;


public class Enemy extends GameCharacter {

  public Enemy(double posX, double posY, String pictureName) {
    super(posX, posY, pictureName);
  }


  public void eMove(int temp, double [][] matrix, Hero hero) {
    if ((hero.posX != posX) || (hero.posY != posY)) {
      if (temp == 1) {
        super.MoveUp(matrix);
      }else if (temp == 2) {
        super.MoveDown(matrix);
      }else if (temp == 3) {
        super.MoveLeft(matrix);
      }else if (temp == 4) {
        super.MoveRight(matrix);
      }
    }
  }
}

