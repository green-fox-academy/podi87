import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
  public static void mainDraw(Graphics graphics) {
    int y = 0;
    int x = 0;
    int w = 30;
    int h = 30;
    for (int i = 0; i < 5; i++) {
      x = 0;
      for (int j = 0; j < 5; j++) {
        graphics.setColor(Color.black);
        graphics.fillRect(x, y, w, h);
        x += w * 2;
      }
      y += h;
      x = w;
      for (int k = 0; k < 5; k++) {
        graphics.setColor(Color.black);
        graphics.fillRect(x, y, w, h);
        x += w * 2;
      }
      y += h;
    }
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
