
import java.util.*;


public class Enemy extends GameCharacter {

  public Enemy(double posX, double posY, String pictureName) {
    super(posX, posY, pictureName);
  }

  public void eMove(int temp, double [][] matrix, Hero hero) {
    if ((hero.posX != posX) || (hero.posY != posY)) {
      if (temp == 1) {
        if ((posY > 0) && (matrix[(int) posY - 1][(int) posX] == 0) && (hero.posY <= posY)) {
          super.MoveUp();
        }
      } else if (temp == 2) {
        if ((posY < matrix.length - 1) && (matrix[(int) posY + 1][(int) posX] == 0) && (hero.posY >= posY)) {
          super.MoveDown();
        }
      } else if (temp == 3) {
        if ((posX > 0) && (matrix[(int) posY][(int) posX - 1] == 0) && (hero.posX <= posX)) {
          super.MoveLeft();
        }
      } else if (temp == 4) {
        if ((posX < matrix.length - 1) && (matrix[(int) posY][(int) posX + 1] == 0) && (hero.posX >= posX)) {
          super.MoveRight();
        }
      }
    }
  }
}

