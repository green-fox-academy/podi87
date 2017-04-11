import java.awt.*;
import java.util.List;

public class Enemy {

  String skeletonName = "skeleton.png";
  int temp;
  List<Integer> X;
  List<Integer> Y;
  PositionedImage skeleton;
  Graphics graphics;

  public void drawSkeleton(Graphics graphics, PositionedImage skeleton, List<Integer> X, List<Integer> Y, int temp) {
    skeleton.posX = X.get(temp);
    skeleton.posY = Y.get(temp);
    skeleton.draw(graphics);
  }

  public Enemy(Graphics graphics) {
    this.skeletonName = skeletonName;
    this.temp = temp;
    this.X = X;
    this.Y = Y;
    this.graphics = graphics;
  }
}
