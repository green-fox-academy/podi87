import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class Board extends JComponent implements KeyListener {

  int heroBoxX;
  int heroBoxY;
  int skeleBoxX;
  int skeleBoxY;
  int skeleNUm = 3;
  String heroPic = "hero-down.png";
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


  public Board() {
    heroBoxX = 0;
    heroBoxY = 0;

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    List<Integer> availableX = new ArrayList<>();
    List<Integer> availableY = new ArrayList<>();
    PositionedImage hero = new PositionedImage(heroPic, heroBoxX, heroBoxY);
    PositionedImage skeleton = new PositionedImage("skeleton.png", skeleBoxX * 72, skeleBoxY * 72);

    for (int row = 0; row < wallMatrix.length; row++) {
      for (int column = 0; column < wallMatrix[row].length; column++) {
        if (wallMatrix[row][column] == 0) {
          PositionedImage floor = new PositionedImage("floor.png", column * 72, row * 72);
          floor.draw(graphics);
          availableX.add(floor.posX/72);
          availableY.add(floor.posY/72);
        } else {
          PositionedImage wall = new PositionedImage("wall.png", column * 72, row * 72);
          wall.draw(graphics);
        }
      }
      hero.draw(graphics);
      int temp = (int)(Math.random() * availableX.size());
      skeleBoxX = availableX.get(temp);
      skeleBoxY = availableY.get(temp);
      skeleton.draw(graphics);
    }
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