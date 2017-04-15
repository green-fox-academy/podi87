
public class GameCharacter extends GameObject {

  int hp;
  int currentHP;
  int dp;
  int sp;

  public GameCharacter(double posX, double posY, String pictureName, int hp, int currentHP, int dp, int sp) {
   super(posX,posY, pictureName);
   this.hp = hp;
   this.currentHP = currentHP;
   this.dp = dp;
   this.sp = sp;
  }

  public GameCharacter() {
  }

  public int dice() {
    return (int)(Math.random() * 7);
  }

  public void strike (int enemyHP, int currentEnemyHP, int enemyDP, int attackerSP) {
    int strikeValue = (2 * dice()) + attackerSP;
    if (strikeValue >= enemyDP) {
      currentEnemyHP = enemyHP - (strikeValue - enemyDP);
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
