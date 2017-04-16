
public class Hero extends GameCharacter {



  public Hero(double posX, double posY, String pictureName, int hp, int currentHP, int dp, int sp, int level) {
    super(posX, posY, "hero-down.png",hp, currentHP, dp, sp, level);
    this.hp = 20 + (3 * dice());
    this.dp = 2 * dice();
    this.sp = 5 + dice();
  }

//  public int HP() {
//    return this.hp = 20 + (3 * dice());
//  }
//  public int DP() {
//    return this.dp = 2 * dice();
//  }
//  public int SP() {
//    return this.dp = 5 + dice();
//  }

  public void MoveUp(double [][] wallMatrix, Enemy enemy){
      super.MoveUp(wallMatrix);
  }
  public void MoveDown(double [][] wallMatrix, Enemy enemy){
      super.MoveDown(wallMatrix);
  }
  public void MoveLeft(double [][] wallMatrix, Enemy enemy){
      super.MoveLeft(wallMatrix);
  }
  public void MoveRight(double [][] wallMatrix, Enemy enemy){
      super.MoveRight(wallMatrix);
  }
}
