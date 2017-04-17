import java.util.List;

public class GameCharacter extends GameObject {

  int hp;
  int currentHP;
  int dp;
  int sp;
  int level;
  boolean hasKey;

  public GameCharacter(double posX, double posY, String pictureName, int hp, int currentHP, int dp, int sp, int level, boolean hasKey) {
   super(posX,posY, pictureName);
   this.hp = hp;
   this.currentHP = currentHP;
   this.dp = dp;
   this.sp = sp;
   this.level = level;
   this.hasKey = hasKey;
  }

  public GameCharacter() {
  }

  public int dice() {
    return 1 + (int)(Math.random() * 7);
  }

  public void strike (GameCharacter target) {
    int strikeValue = (2 * dice()) + sp;
    if (strikeValue >= target.dp) {
      target.currentHP = target.currentHP - (strikeValue - target.dp);
    }
  }

  public void die(List<GameCharacter> charList) {
    for (int i = 0; i < charList.size(); i++) {
      if ((charList.get(i).currentHP <= 0)) {
        charList.remove(i);
      }
    }
  }

  public boolean notOutOfBounds(double x, double y, double [][] wallMatrix) {
    if ((y < 0) && (y > wallMatrix.length)) {
      return false;
    } else if ((x < 0) && (x > wallMatrix.length)) {
      return false;
    }
    return true;
  }

  public boolean validField(double x, double y, double [][] wallMatrix) {
    if ((posY >= 0 && posY <= wallMatrix.length - 1) && (posX >= 0 && posX <= wallMatrix.length - 1) && notOutOfBounds(x,y,wallMatrix)) {
      return (wallMatrix[(int) y][(int) x] == 0);
    }
    return false;
  }

  public void MoveUp(double [][] wallMatrix) {
    try {
      if (validField(posX, (posY) - 1, wallMatrix)) {
        posY = (posY - 1);
      }
    } catch (ArrayIndexOutOfBoundsException error) {
      MoveDown(wallMatrix);
    }
  }
  public void MoveDown(double [][] wallMatrix) {
    try {
      if (validField(posX, (posY) + 1, wallMatrix)) {
        posY = (posY + 1);
      }
    } catch (ArrayIndexOutOfBoundsException error) {
      MoveUp(wallMatrix);
    }
  }
  public void MoveLeft(double [][] wallMatrix) {
    try {
      if (validField((posX) - 1, posY, wallMatrix)) {
        posX = (posX - 1);
      }
    } catch (ArrayIndexOutOfBoundsException error) {
      MoveRight(wallMatrix);
    }
  }
  public void MoveRight(double [][] wallMatrix) {
    try {
      if (validField((posX) + 1, posY, wallMatrix) && (notOutOfBounds((posX) + 1, posY, wallMatrix))) {
        posX = (posX + 1);
      }
    } catch (ArrayIndexOutOfBoundsException error) {
      MoveLeft(wallMatrix);
    }
  }
}
