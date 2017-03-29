import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {

    int[][] box = {
            {10, 10},
            {290, 10},
            {290, 290},
            {10, 290}};
    int[][] points = {{50, 100},
            {70, 70},
            {80, 90},
            {90, 90},
            {100, 70},
            {120, 100},
            {85, 130},
            {50, 100}};

    drawBox(graphics, box );
    drawBox(graphics, points);

  }
    public static void drawBox(Graphics g, int[][] dots) {

      for (int i = 0; i < dots.length - 1; i++) {
        g.setColor(Color.GREEN);
        g.drawLine(dots[i][0], dots[i][1], dots[i + 1][0], dots[i + 1][1]);
        g.drawLine(dots[3][0], dots[3][1], dots[0][0], dots[0][1]);
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.white);
      mainDraw(graphics);

    }
  }
}

