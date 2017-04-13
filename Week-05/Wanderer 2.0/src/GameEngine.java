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
  int counter = 0;
  int rand1 = (int)(Math.random() * map.freeFieldX.size());
  int rand2 = (int)(Math.random() * map.freeFieldX.size());
  int rand3 = (int)(Math.random() * map.freeFieldX.size());
  int rand4 = (int)(Math.random() * map.freeFieldX.size());
  List<Enemy> enemyList = new ArrayList<>();


  public GameEngine() {
    enemyList.add(new Enemy((map.freeFieldX.get(rand1)),(map.freeFieldY.get(rand1)), "skeleton.png"));
    enemyList.add(new Enemy((map.freeFieldX.get(rand2)),(map.freeFieldY.get(rand2)), "skeleton.png"));
    enemyList.add( new Enemy((map.freeFieldX.get(rand3)),(map.freeFieldY.get(rand3)), "skeleton.png"));
    enemyList.add(new Enemy((map.freeFieldX.get(rand4)),(map.freeFieldY.get(rand4)), "boss.png"));

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
    PositionedImage skeleton1 = new PositionedImage(enemyList.get(0).pictureName, enemyList.get(0).posX * 72, enemyList.get(0).posY * 72);
    skeleton1.draw(graphics);
    PositionedImage skeleton2 = new PositionedImage(enemyList.get(1).pictureName, enemyList.get(1).posX * 72, enemyList.get(1).posY * 72);
    skeleton2.draw(graphics);
    PositionedImage skeleton3 = new PositionedImage(enemyList.get(2).pictureName, enemyList.get(2).posX * 72, enemyList.get(2).posY * 72);
    skeleton3.draw(graphics);
    PositionedImage boss = new PositionedImage(enemyList.get(3).pictureName, enemyList.get(3).posX * 72, enemyList.get(3).posY * 72);
    boss.draw(graphics);
    PositionedImage heroImg = new PositionedImage(hero.pictureName, hero.getPosX() * 72, hero.getPosY() * 72);
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
    if (counter == 0) {
      enemyMove();
      counter++;
    } else {
      counter--;
    }
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
    return (map.wallMatrix[y][x] == 0);
  }
  public void enemyMove() {
    for (int i = 0; i < enemyList.size(); i++) {
      if ((enemyList.get(i).posY > 0) && (validField(enemyList.get(i).posX, enemyList.get(i).posY - 1))) {
        enemyList.get(i).MoveUp();
      } else if ((enemyList.get(i).posY < map.wallMatrix.length - 1) && (validField(enemyList.get(i).posX, (enemyList.get(i).posY) + 1))) {
        enemyList.get(i).MoveDown();
      } else if ((enemyList.get(i).posX > 0) && (validField((enemyList.get(i).posX) - 1, enemyList.get(i).posY))) {
        enemyList.get(i).MoveLeft();
      } else if ((enemyList.get(i).posX < map.wallMatrix.length - 1) && (validField((enemyList.get(i).posX) + 1, enemyList.get(i).posY))) {
        enemyList.get(i).MoveRight();
      }
    }
  }
}