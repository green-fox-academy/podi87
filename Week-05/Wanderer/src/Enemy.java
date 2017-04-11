import java.awt.*;
import java.util.List;

public class Enemy extends Board {

  String skeletonName = "skeleton.png";
  int skeleX;
  int skeleY;
  List<Integer> X;
  List<Integer> Y;
  PositionedImage skeleton;
  Graphics graphics;


  public int drawSkeletonX(PositionedImage skeleton, List<Integer> X, int  temp) {
//    int temp = (int) (Math.random() * X.size());
    skeleton.posX = skeleX;
    skeleX = X.get(temp);
    return skeleX;

  }
  public int  drawSkeletonY(PositionedImage skeleton, List<Integer> Y, int temp) {
    skeleton.posY = skeleY;
    skeleY = Y.get(temp);
    return skeleY;
  }

  public Enemy(Graphics graphics) {
    this.skeletonName = skeletonName;
    this.skeleX = skeleX;
    this.skeleY = skeleY;
    this.graphics = graphics;

  }
}
