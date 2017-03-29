import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareDrawingFunction {
  public static void mainDraw(Graphics graphics) {
    int x = 10;
    int y = 10;
    for (int i =0; i < 3; i++) {
      int v =(int)(Math.random() * 250);
      int w =(int)(Math.random() * 250);
      drawSquares(graphics, v, w);
    }
  }
  public static void drawSquares (Graphics g, int x, int y) {

    g.drawRect(x, y, 50, 50);
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
