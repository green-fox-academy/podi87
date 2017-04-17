import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;


public class GameEngine extends JComponent implements KeyListener {
  int hp;
  int currentHP = hp;
  int dp;
  int sp;
  int level = 1;
  int chance;
  GameCharacter gameCharacter = new GameCharacter();
  GameMap map = new GameMap();
  String heroDown = "hero-down.png";
  Hero hero = new Hero(0,0,heroDown, hp, currentHP, dp, sp, level);
  int counter = 0;
  int rand1 = (int)(Math.random() * map.freeFieldX.size());
  int rand2 = (int)(Math.random() * map.freeFieldX.size());
  int rand3 = (int)(Math.random() * map.freeFieldX.size());
  int rand4 = (int)(Math.random() * map.freeFieldX.size());
  List<GameCharacter> gameCharacterList = new ArrayList<>();
  HUD hud = new HUD();

  public GameEngine() {

    gameCharacterList.add(hero);
    gameCharacterList.add(new Enemy((map.freeFieldX.get(rand1)),(map.freeFieldY.get(rand1)), "skeleton.png", hp, currentHP, dp, sp, level));
    gameCharacterList.add(new Enemy((map.freeFieldX.get(rand2)),(map.freeFieldY.get(rand2)), "skeleton.png", hp, currentHP, dp, sp, level));
    gameCharacterList.add(new Enemy((map.freeFieldX.get(rand3)),(map.freeFieldY.get(rand3)), "skeleton.png", hp, currentHP, dp, sp, level));
    gameCharacterList.add(new Enemy((map.freeFieldX.get(rand4)),(map.freeFieldY.get(rand4)), "boss.png", hp, currentHP, dp, sp, level));

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
    if (gameCharacterList.size() == 1) {
      level++;
      hero.level++;
      chance =(int)(Math.random() * 11);
      System.out.println(chance);
      hero.restore(chance);
      gameCharacterList.add(new Enemy((map.freeFieldX.get(rand1)),(map.freeFieldY.get(rand1)), "skeleton.png", hp, currentHP, dp, sp, level));
      gameCharacterList.add(new Enemy((map.freeFieldX.get(rand2)),(map.freeFieldY.get(rand2)), "skeleton.png", hp, currentHP, dp, sp, level));
      gameCharacterList.add(new Enemy((map.freeFieldX.get(rand3)),(map.freeFieldY.get(rand3)), "skeleton.png", hp, currentHP, dp, sp, level));
      gameCharacterList.add(new Enemy((map.freeFieldX.get(rand4)),(map.freeFieldY.get(rand4)), "boss.png", hp, currentHP, dp, sp, level));
    }


      for (int i = 0; i < gameCharacterList.size(); i++) {
        gameCharacterList.get(i).die(gameCharacterList);
        PositionedImage characters = new PositionedImage(gameCharacterList.get(i).pictureName, gameCharacterList.get(i).posX * 72, gameCharacterList.get(i).posY * 72);
        characters.draw(graphics);


    }
    graphics.drawRect(0, 720, 720, 132);
    for (int i = 0; i < gameCharacterList.size(); i++) {
      graphics.drawString(hud.HUDScreen(gameCharacterList.get(i)), 25, 740 + (i * 15));
    }
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
    if (e.getKeyCode() == KeyEvent.VK_UP) {
        hero.MoveUp(map.wallMatrix);

    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        hero.MoveDown(map.wallMatrix);

    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        hero.MoveLeft(map.wallMatrix);

    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        hero.MoveRight(map.wallMatrix);

    } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      for (GameCharacter someBody : gameCharacterList) {
        if ((someBody.posX == hero.posX) && (someBody.posY == hero.posY) && (someBody != hero)) {
          hero.strike(someBody);
          someBody.strike(hero);
        }
      }
    }
    repaint();
  }


  public void enemyMove() {
    for (int i = 0; i < gameCharacterList.size(); i++) {
      int direction = (int) (Math.random() * 5);
      if ((hero.posX != gameCharacterList.get(i).posX) && (hero.posY != gameCharacterList.get(i).posY)) {
        if (direction == 1) {
          gameCharacterList.get(i).MoveUp(map.wallMatrix);
        } else if (direction == 2) {
          gameCharacterList.get(i).MoveDown(map.wallMatrix);
        } else if (direction == 3) {
          gameCharacterList.get(i).MoveLeft(map.wallMatrix);
        } else if (direction == 4) {
          gameCharacterList.get(i).MoveRight(map.wallMatrix);
        }
      }
    }
  }
}