

public class Enemy extends GameCharacter {

  public Enemy(double posX, double posY, String pictureName, int hp, int currentHP, int dp, int sp, int level) {
    super(posX, posY, pictureName, hp, currentHP, dp, sp, level);
    if (pictureName == "boss.png") {
      this.hp = (2 * level * dice()) + dice();
      this.dp =  ((level / 2) * dice()) + (dice() / 2);
      this.sp = level * dice() + level;
    } else {
      this.hp = (2 * level * dice());
      this.dp = ((level / 2) * dice());
      this.sp = level * dice();
    }
  }
//  public int HP() {
//    if (pictureName == "boss.png") {
//      return this.hp = (2 * level * dice()) + dice();
//    } else {
//      return this.hp = (2 * level * dice());
//    }
//  }
//  public int DP() {
//    if (pictureName == "boss.png") {
//      return this.dp = ((level / 2) * dice()) + (dice() / 2);
//    } else {
//      return this.dp = ((level / 2) * dice());
//    }
//  }
//  public int SP() {
//    if (pictureName == "boss.png") {
//      return this.sp = ((level / 2) * dice()) + (dice() / 2);
//    } else {
//      return this.sp = ((level / 2) * dice());
//    }
//  }

  public void eMove(int temp, double [][] matrix, Hero hero) {
    if ((hero.posX != posX) && (hero.posY != posY)) {
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

