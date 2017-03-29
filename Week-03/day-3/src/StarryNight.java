import javax.swing.*;
import java.awt.*;
import java.util.Collection;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    int[][] points = {{20, 300},
            {30, 240},
            {25, 190},
            {30, 90},
            {40, 70},
            {60, 100},
            {70, 180},
            {90, 250},
            {95, 300}};
    graphics.setColor(Color.black);
    graphics.fillRect(0, 0, 300, 300);
    randomStars(graphics);
    graphics.setColor(new Color(13, 27, 96));
    graphics.fillRect(200, 200, 100,100);
    graphics.fillRect(150, 220, 50,80);
    graphics.fillRect(100, 240, 50,60);
    graphics.fillRect(60, 250, 40,50);
    graphics.fillRect(0, 240, 60,60);
    graphics.setColor(new Color(255, 247, 114));
    graphics.fillRect(230, 0, 70,70);
    graphics.setColor(new Color(249, 212, 77));
    graphics.fillRect(240, 10, 50,50);
    tree(graphics, points);
  }
  public static void randomStars(Graphics g) {
      for (int i = 0; i < 20; i++) {
        int R = 130 + (int) (Math.random() * 30);
        int G = 130 + (int) (Math.random() * 30);
        int B = 130 + (int) (Math.random() * 30);
        int x = (int) (Math.random() * 280);
        int y = (int) (Math.random() * 280);
        int size = (int) (Math.random() * 10);
        g.setColor(new Color(249, 212, 77));
        g.fillRect(x-1, y-1, size+2, size+2);
        g.setColor(new Color(R, G, B));
        g.fillRect(x, y, size, size);
      }
    }
  public static void tree(Graphics g, int[][] dots) {
    for (int i = 0; i < dots.length - 1; i++) {
      g.setColor(new Color(13, 27, 96));
      g.drawLine(dots[i][0], dots[i][1], dots[i + 1][0], dots[i + 1][1]);
    }
  }
  public static void drawLines(Graphics g, int x1, int y1, int x2, int y2) {
    g.drawLine(x1, y1, x2, y2);
  }
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.white);
      mainDraw(graphics);

    }
  }
}

