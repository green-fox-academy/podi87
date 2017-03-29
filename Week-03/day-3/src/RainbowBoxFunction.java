import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    int w = 10;
    int h = w;
    int w1 = 300;
    for (int i = 0; i < 30; i++) {
      w1 -= 10;
      int R = (int)(Math.random()*256);
      int G = (int)(Math.random()*256);
      int B= (int)(Math.random()*256);
      graphics.setColor(new Color(R,G,B));
      drawSquares(graphics, w1, w1);
    }
  }
  public static void drawSquares (Graphics g, int w, int h) {

    int x = 150 - (w/2);
    int y = 150 - (h/2);

    g.fillRect(x, y, w, h);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
