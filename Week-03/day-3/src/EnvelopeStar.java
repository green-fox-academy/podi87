import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    int a = 150;
    int b = 150;
    int c = 150;
    int d = 300;
    graphics.setColor(Color.green);
    for(int i = 0; i <= 150; i += 10) {
      graphics.drawLine(i, c, c, a);
      a -= 10;
      graphics.drawLine(i, c, c, b);
      graphics.drawLine(c, i, b, c);
      graphics.drawLine(c, d, b, c);
      b += 10;
      d -= 10;
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

