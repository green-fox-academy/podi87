import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    int x1 = 130;
    int y2 = 0;
    while (y2 < 300 && x1 < 300) {
      graphics.setColor(new Color(177, 70, 244));
      drawLines(graphics, x1, 0, 300, y2);
      y2 += 20;
      x1 += 20;
    }
    int Y1 = 130;
    int X2 = 0;
    while (Y1 < 300 && X2 < 300) {
      graphics.setColor(Color.green);
      drawLines(graphics, 0, Y1, X2, 300);
      Y1 += 20;
      X2 += 20;
    }
    int xx1 = 170;
    int yy2 = 0;
    while (yy2 < 300 && xx1 > 0) {
      graphics.setColor(Color.CYAN);
      drawLines(graphics, xx1, 0, 0, yy2);
      yy2 += 20;
      xx1 -= 20;
    }
    int XX1 = 130;
    int XX2 = 300;
    int YY2 = 300;
    while (XX1 < 300 && YY2 > 130) {
      graphics.setColor(Color.orange);
      drawLines(graphics, XX1, 300, XX2, YY2);
      XX1 += 20;
      YY2 -= 20;
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

