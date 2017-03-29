import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    int x1 = 0;
    int y1 = 0;

    for (int i = 0; i < 30; i++) {
      if (x1 <= 300){
        drawLines(graphics, x1, y1);
        x1 += 20;
      } else {
        drawLines(graphics, x1, y1);
        y1 += 20;
      }
    }
    for (int j = 0; j < 33; j++){
      if (x1 >= 0){
        drawLines(graphics, x1, y1);
        x1 -= 20;
      }else if (y1 >= 0) {
        drawLines(graphics, x1, y1);
        y1 -= 20;
      }
    }
  }

  private static void While(boolean b) {
  }

  public static void drawLines(Graphics g, int x1, int y1){
    int x2 = 150;
    int y2 = 150;
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.white);
      mainDraw(graphics);

    }
  }

}
