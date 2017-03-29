import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
  public static void mainDraw(Graphics graphics) {
    int x = 10;
    int y = 10;
    int w = 10;
    int h = 10;
    for (int i = 0; i < 6; i++) {
      graphics.setColor(new Color(177,70,244));
      graphics.fillRect(x, y, w, h);
      graphics.setColor(Color.black);
      graphics.drawRect(x, y, w, h);
      x += w;
      y += h;
      w += 10;
      h += 10;
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
