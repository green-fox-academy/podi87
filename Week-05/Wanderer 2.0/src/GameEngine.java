import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;


public class GameEngine extends JComponent implements KeyListener {

  Graphics graphics;
  int heroBoxX;
  int heroBoxY;
  int skeleMove = 0;
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
//
//  Enemy enemy = new Enemy(graphics);
//  GameMap gameMap = new GameMap(graphics);
//  int temp1 = (int)(Math.random() * gameMap.availableMatrixLength(wallMatrix));
//  int temp2= (int)(Math.random() * gameMap.availableMatrixLength(wallMatrix));
//  int temp3= (int)(Math.random() * gameMap.availableMatrixLength(wallMatrix));

  public GameEngine() {
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
    GameMap map = new GameMap();
    PositionedImage hero = new PositionedImage(heroPic, heroBoxX, heroBoxY);
    PositionedImage skeleton = new PositionedImage(skeletonName, 0, 0);
    PositionedImage floorTile = new PositionedImage(floor, 0, 0);
    PositionedImage wallTile = new PositionedImage(wall, 0, 0);

    for (MapTiles temp : map.tilesList) {
      PositionedImage tiles = new PositionedImage(temp.pictureName, temp.getPosX() * 72,temp.getPosY() * 72);
      tiles.draw(graphics);
    }
    hero.draw(graphics);


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
    if ((e.getKeyCode() == KeyEvent.VK_UP) && (heroBoxY > 0)) {
      heroPic = "hero-up.png";
      if (wallMatrix[heroBoxY /72 - 1][heroBoxX /72] == 0) {
        heroBoxY -= 72;
      }
    } else if ((e.getKeyCode() == KeyEvent.VK_DOWN) && (heroBoxY < 648)) {
      heroPic = "hero-down.png";
      if (wallMatrix[heroBoxY /72 + 1][heroBoxX /72] == 0) {
        heroBoxY += 72;
      }
    } else if ((e.getKeyCode() == KeyEvent.VK_LEFT) && (heroBoxX > 0)) {
      heroPic = "hero-left.png";
      if (wallMatrix[heroBoxY /72][heroBoxX /72 - 1] == 0) {
        heroBoxX -= 72;
      }
    } else if ((e.getKeyCode() == KeyEvent.VK_RIGHT) && (heroBoxX < 648)) {
      heroPic = "hero-right.png";
      if (wallMatrix[heroBoxY /72][heroBoxX /72 + 1] == 0) {
        heroBoxX += 72;
      }
    }
    repaint();
  }
}