import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
  public static void mainDraw(Graphics graphics) {
//PART 1 - //  draw a red horizontal line to the canvas' middle.
           //  draw a green vertical line to the canvas' middle.
    graphics.setColor(Color.red);
    graphics.drawLine(150, 0, 150, 300);
    graphics.setColor(Color.green);
    graphics.drawLine(0, 150, 300, 150);
//PART 2 - // draw a box that has different colored lines on each edge.
    graphics.setColor(Color.black);
    graphics.drawLine(0,0,0,300);
    graphics.setColor(Color.yellow);
    graphics.drawLine(0,0,300,0);
    graphics.setColor(Color.orange);
    graphics.drawLine(300,0,300,300);
    graphics.setColor(Color.blue);
    graphics.drawLine(300,300,0,300);
//PART 3 - // draw the canvas' diagonals in green.
    graphics.setColor(Color.GREEN);
    graphics.drawLine(0,0,300,300);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(300,0,0,300);

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
