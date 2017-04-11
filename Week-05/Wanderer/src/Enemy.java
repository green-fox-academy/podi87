import java.awt.*;
import java.util.List;

public class Enemy {

  String skeletonName = "skeleton.png";
  int temp;
  List<Integer> X;
  List<Integer> Y;
  int [][] matrix;
  PositionedImage skeleton;
  Graphics graphics;

  public Enemy(Graphics graphics) {
    this.skeletonName = skeletonName;
    this.temp = temp;
    this.X = X;
    this.Y = Y;
    this.graphics = graphics;
  }

  public void drawSkeleton(Graphics graphics, int [][] matrix, PositionedImage skeleton, List<Integer> X, List<Integer> Y, int temp) {
    skeleton.posX = X.get(temp);
    skeleton.posY = Y.get(temp);
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        if (matrix[row][column] == matrix[skeleton.posY / 72][skeleton.posX / 72]) {
          matrix[skeleton.posY/72][skeleton.posX/72] = 2;
          skeleton.draw(graphics);
        }
      }
    }
  }
}
