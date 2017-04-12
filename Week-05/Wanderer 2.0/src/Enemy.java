import java.awt.*;
import java.lang.*;
import java.util.List;


  import java.awt.*;
import java.util.List;

public class Enemy extends Character {

    String skeletonName = "skeleton.png";
    int temp;
    int skeleMove;
    List<Integer> X;
    List<Integer> Y;
    int [][] matrix;
    PositionedImage skeleton;
    Graphics graphics;



    public Enemy(Graphics graphics) {
      this.graphics = graphics;
    }

    public void drawSkeleton(Graphics graphics, int [][] matrix, PositionedImage skeleton, List<Integer> X, List<Integer> Y, int temp) {
      skeleton.posX = 72 * (X.get(temp));
      skeleton.posY = 72 * (Y.get(temp));
      for (int row = 0; row < matrix.length; row++) {
        for (int column = 0; column < matrix[row].length; column++) {
          if (matrix[row][column] == matrix[skeleton.posY/72][skeleton.posX/72]) {
            matrix[skeleton.posY/72][skeleton.posX/72] = 2;
            skeleton.draw(graphics);
//        } else if (matrix[row][column] != matrix[skeleton.posY/72][skeleton.posX/72])  {
//          matrix[row][column] = 0;
        }
        }
      }
    }
  }

