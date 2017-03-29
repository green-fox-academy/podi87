import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    int x1 = 0;
    int y1 = 0;
    int x2 = 300;
    int y2 = 0;
    while (y2 < 300 && x1 < 300) {
      graphics.setColor(new Color(177, 70, 244));
      drawLines(graphics, x1, y1, x2, y2);
      y2 += 20;
      x1 += 20;
    }
    int X1 = 0;
    int Y1 = 0;
    int X2 = 0;
    int Y2 = 300;
    while (Y1 < 300 && X2 < 300) {
      graphics.setColor(Color.green);
      drawLines(graphics, X1, Y1, X2, Y2);
      Y1 += 20;
      X2 += 20;
    }
//    graphics.setColor(Color.GREEN);
//    for(int i = 0; i < 300; i += 20) {
//      graphics.setColor(Color.GREEN);
//      graphics.drawLine(0, i, i, 300);
//      graphics.setColor(new Color(142,0,237));
//      graphics.drawLine(i, 0, 300, i);
//    }
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

