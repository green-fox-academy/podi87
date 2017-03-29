import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
  public static void mainDraw(Graphics graphics) {
    int x1 = 0;
    int y1 = 300;
    int x2 = 300;
    int y2 = 0;
    line(graphics, x1, x2, y1, y1);
    int x3 = 300;
    int y3 = 300;
    int x4 = 300;
    int y4 = 300;
    line1(graphics, x3, x3, y4, y4);
    int x5 = 150;
    int y5 = 0;
    int x6 = 300;
    int y6 = 300;
    line2(graphics, x5, y5, x6, y6);
  }
  public static void line(Graphics g, int x1, int y1, int x2, int y2){
   for (int i = 0; i < 310; i += 10) {
     g.drawLine(x1, y1, x2, y2);
     x1 = x1 + 5;
     x2 = x2 - 5;
     y1 = y1 - 10;
     y2 = y2 - 10;
   }
  }
  public static void line1(Graphics g, int x1, int y1, int x2, int y2) {
    for (int i = 0; i < 310; i += 10) {
      g.drawLine(x1, y1, x2, y2);
      x1 = x1 - 10;
      x2 = x2 - 5;
      y1 = y1;
      y2 = y2 - 10;
    }
  }
  public static void line2(Graphics g, int x1, int y1, int x2, int y2) {
    for (int i = 0; i < 310; i += 10) {
      g.drawLine(x1, y1, x2, y2);
      x1 = x1 - 5;
      y1 = y1 + 10;
      x2 = x2 - 10;
      y2 = y2;
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

