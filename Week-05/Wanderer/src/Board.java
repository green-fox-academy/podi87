import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;
import java.util.Map;

public class Board extends JComponent implements KeyListener {

  int heroBoxX;
  int heroBoxY;
  List<Integer> availableX;
  List<Integer> availableY;
  String skeletonName = "skeleton.png";
  String heroPic = "hero-down.png";
  String floor = "floor.png";
  String wall = "wall.png";
  int[][] wallMatrix = new int[][]{
          {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
          {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
          {0, 1, 0, 1, 0, 1, 1, 0, 0, 0},
          {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
          {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
          {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},};

  public int availableMatrixLength (int [][] wallMatrix) {
    int floorLength = 0;
    for (int row = 0; row < wallMatrix.length; row++) {
      for (int column = 0; column < wallMatrix[row].length; column++) {
        if (wallMatrix[row][column] == 0) {
          floorLength++;
        }
      }
    }
    return floorLength;
  }

  int temp1 = (int)(Math.random() * availableMatrixLength(wallMatrix));
  int temp2= (int)(Math.random() * availableMatrixLength(wallMatrix));
  int temp3= (int)(Math.random() * availableMatrixLength(wallMatrix));
  
  public Board() {
    heroBoxX = 0;
    heroBoxY = 0;

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    availableX = new ArrayList<>();
    availableY = new ArrayList<>();
    Enemy enemy = new Enemy(graphics);
    GameMap gameMap = new GameMap(graphics);
    PositionedImage hero = new PositionedImage(heroPic, heroBoxX, heroBoxY);
    PositionedImage skeleton = new PositionedImage(skeletonName, 0,0);
    PositionedImage floorTile = new PositionedImage(floor, 0, 0);
    PositionedImage wallTile = new PositionedImage(wall, 0, 0);

    gameMap.drawMap(graphics, wallMatrix, floorTile, wallTile, availableX, availableY);
    hero.draw(graphics);
    enemy.drawSkeleton(graphics, skeleton, availableX, availableY, temp1);
    enemy.drawSkeleton(graphics, skeleton, availableX, availableY, temp2);
    enemy.drawSkeleton(graphics, skeleton, availableX, availableY, temp3);
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
        if ((e.getKeyCode() == KeyEvent.VK_UP) && (heroBoxY > 0) && (wallMatrix[heroBoxY /72 - 1][heroBoxX /72] == 0)) {
          heroBoxY -= 72;
          heroPic = "hero-up.png";
        } else if ((e.getKeyCode() == KeyEvent.VK_DOWN) && (heroBoxY < 648) && ((wallMatrix[heroBoxY /72 + 1][heroBoxX /72] == 0))) {
          heroBoxY += 72;
          heroPic = "hero-down.png";
        } else if ((e.getKeyCode() == KeyEvent.VK_LEFT) && (heroBoxX > 0) && ((wallMatrix[heroBoxY /72][heroBoxX /72 - 1] == 0))) {
          heroBoxX -= 72;
          heroPic = "hero-left.png";
        } else if ((e.getKeyCode() == KeyEvent.VK_RIGHT) && (heroBoxX < 648) && ((wallMatrix[heroBoxY /72][heroBoxX /72 + 1] == 0))) {
          heroBoxX += 72;
          heroPic = "hero-right.png";
        }
        repaint();
      }
}