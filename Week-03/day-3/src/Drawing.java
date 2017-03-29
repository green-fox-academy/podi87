import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
  public static void mainDraw(Graphics graphics) {
//PART 1 - //  draw a red horizontal line to the canvas' middle.
    //  draw a green vertical line to the canvas' middle.
    graphics.setColor(Color.red);
    graphics.drawLine(150, 0, 150, 300);
    graphics.setColor(Color.CYAN);
    graphics.drawLine(0, 150, 300, 150);
//PART 2 - // draw a box that has different colored lines on each edge.
    graphics.setColor(Color.black);
    graphics.drawLine(0, 0, 0, 300);
    graphics.setColor(Color.yellow);
    graphics.drawLine(0, 0, 300, 0);
    graphics.setColor(Color.orange);
    graphics.drawLine(300, 0, 300, 300);
    graphics.setColor(Color.blue);
    graphics.drawLine(300, 300, 0, 300);
//PART 3 - // draw the canvas' diagonals in green.
    graphics.setColor(Color.GREEN);
    graphics.drawLine(0, 0, 300, 300);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(300, 0, 0, 300);
//PART 4 - // drawing lines function
    int x1 = 30;
    int x2 = 50;
   for (int i = 0; i < 3; i++){
     int a = (int) (Math.random() * 301);
     int b = (int) (Math.random() * 301);
     graphics.setColor(Color.BLACK);
     drawLines(graphics, a, b);
   }

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
