import java.awt.*;


public class Enemy extends GameCharacter {

  boolean skeleton;
  Graphics graphics;

  public Enemy(int posX, int posY, boolean skeleton, Graphics graphics) {
    super(posX, posY, skeleton ? "skeleton.png" : "boss");
    this.graphics = graphics;
  }

  public Enemy(Graphics graphics) {
  }

  public void MoveUp(){
    posY = posY - 1;
  }
  public void MoveDown(){
    posY = posY + 1;
  }
  public void MoveLeft(){
    posX = posX - 1;
  }
  public void MoveRight(){
    posX = posX + 1;
  }

}

