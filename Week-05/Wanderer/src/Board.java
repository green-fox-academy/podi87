import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
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
    testBoxX = 0;
    testBoxY = 0;


    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    PositionedImage hero = new PositionedImage(heroPic, testBoxX, testBoxY);

    for (int row = 0; row < wallMatrix.length; row++) {
      for (int column = 0; column < wallMatrix[row].length; column++) {
        if (wallMatrix[row][column] == 0) {
          PositionedImage floor = new PositionedImage("floor.png", column * 72, row * 72);
          floor.draw(graphics);
        } else {
          PositionedImage wall = new PositionedImage("wall.png", column * 72, row * 72);
          wall.draw(graphics);

        }
      }
      hero.draw(graphics);
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
        if ((e.getKeyCode() == KeyEvent.VK_UP) && (testBoxY > 0) && (wallMatrix[testBoxY/72 - 1][testBoxX/72] == 0)) {
          testBoxY -= 72;
          heroPic = "hero-up.png";
        } else if ((e.getKeyCode() == KeyEvent.VK_DOWN) && (testBoxY < 648) && ((wallMatrix[testBoxY/72 + 1][testBoxX/72] == 0))) {
          testBoxY += 72;
          heroPic = "hero-down.png";
        } else if ((e.getKeyCode() == KeyEvent.VK_LEFT) && (testBoxX > 0) && ((wallMatrix[testBoxY/72][testBoxX/72 - 1] == 0))) {
          testBoxX -= 72;
          heroPic = "hero-left.png";
        } else if ((e.getKeyCode() == KeyEvent.VK_RIGHT) && (testBoxX < 648) && ((wallMatrix[testBoxY/72][testBoxX/72 + 1] == 0))) {
          testBoxX += 72;
          heroPic = "hero-right.png";
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
      }
}