

public class Enemy extends GameCharacter {

  public Enemy(double posX, double posY, String pictureName, int hp, int currentHP, int dp, int sp, int level, boolean hasKey) {
    super(posX, posY, pictureName, hp, currentHP, dp, sp, level, hasKey);
    if (pictureName == "boss.png") {
      this.hp = (2 * level * dice()) + dice();
      this.currentHP = this.hp;
      this.dp =  ((level / 2) * dice()) + (dice() / 2);
      this.sp = level * dice() + level;
    } else {
      this.hp = (2 * level * dice());
      this.currentHP = this.hp;
      this.dp = ((level / 2) * dice());
      this.sp = level * dice();
    }
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
  public void MoveRight(double [][] wallMatrix) {
    super.MoveRight(wallMatrix);
  }
}

