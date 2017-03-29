import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.green);
    graphics.drawRect(145,145, 10,10);
    graphics.setColor(Color.blue);
    graphics.drawRect(130,130, 40,40);
    graphics.setColor(Color.black);
    graphics.drawRect(120,120, 60,60);
    graphics.setColor(Color.red);
    graphics.drawRect(90,90, 120,120);
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
