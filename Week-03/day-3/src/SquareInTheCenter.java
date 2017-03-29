import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareInTheCenter {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.black);
    graphics.drawLine(150,0,150,300);
    graphics.setColor(Color.black);
    graphics.drawLine(0,150,300, 150);
    graphics.setColor(Color.green);
    graphics.drawRect(145,145, 10,10);
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
