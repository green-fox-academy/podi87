
public class Hero extends GameCharacter {


  public Hero(double posX, double posY, String pictureName, int hp, int currentHP, int dp, int sp, int level) {
    super(posX, posY, "hero-down.png",hp, currentHP, dp, sp, level);
    this.hp = 20 + (3 * dice());
    this.currentHP = this.hp;
    this.dp = 2 * dice();
    this.sp = 5 + dice();
  }
  public int restore(int chance){
  int Hp = 0;
    if (chance <= 1) {
      Hp = this.hp - currentHP;
    } else if (chance <= 4) {
      Hp = this.hp / 3;
    } else {
      Hp = this.hp / 10;
    }
    return this.currentHP + Hp;
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
