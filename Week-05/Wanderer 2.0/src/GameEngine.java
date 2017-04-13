import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;


public class GameEngine extends JComponent implements KeyListener {

  Graphics graphics;
  GameMap map = new GameMap();
  String heroDown = "hero-down.png";
  Hero hero = new Hero(0,0,heroDown);



  public GameEngine() {

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    for (MapTiles temp : map.tilesList) {
      PositionedImage tiles = new PositionedImage(temp.pictureName, temp.getPosX() * 72,temp.getPosY() * 72);
      tiles.draw(graphics);
    }
    PositionedImage heroImg = new PositionedImage(hero.pictureName, hero.getPosX()*72, hero.getPosY()*72);
    heroImg.draw(graphics);

  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {

    if ((e.getKeyCode() == KeyEvent.VK_UP) && (hero.posY > 0)) {
      hero.pictureName = "hero-up.png";
      if (validField(hero.posX, (hero.posY) - 1)) {
         hero.MoveUp();
      }
    } else if ((e.getKeyCode() == KeyEvent.VK_DOWN) && (hero.posY < map.wallMatrix.length-1)) {
      hero.pictureName = "hero-down.png";
      if (validField(hero.posX,(hero.posY) + 1)) {
        hero.MoveDown();
      }
    } else if ((e.getKeyCode() == KeyEvent.VK_LEFT) && (hero.posX > 0)) {
      hero.pictureName = "hero-left.png";
      if (validField((hero.posX) - 1, hero.posY)) {
        hero.MoveLeft();
      }
    } else if ((e.getKeyCode() == KeyEvent.VK_RIGHT) && (hero.posX < map.wallMatrix.length-1)) {
      hero.pictureName = "hero-right.png";
      if (validField((hero.posX) + 1, hero.posY)) {
        hero.MoveRight();
      }
    }
    repaint();
  }
  public boolean validField(int x, int y) {
        if (map.wallMatrix[y][x] == 0) {
          return true;
        }
    return false;
  }
}