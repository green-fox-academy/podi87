
public class Hero extends GameCharacter {


  public Hero(double posX, double posY, String pictureName, int hp, int currentHP, int dp, int sp, int level, boolean hasKey) {
    super(posX, posY, "hero-down.png",hp, currentHP, dp, sp, level, hasKey);
    this.hp = 20 + (3 * dice());
    this.currentHP = this.hp;
    this.dp = 2 * dice();
    this.sp = 5 + dice();
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
