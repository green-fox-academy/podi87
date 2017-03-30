import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowSquare {
  public static void mainDraw(Graphics graphics) {
    int x =0;
    int y =0;
    int size =500;
    graphics.drawRect(x, y, size, size);
    drawR(graphics, x, y, size);
  }
  public static void drawR(Graphics g, int x, int y, int size) {
    if (size < 1){
      return;
    }
    else {
      g.setColor(Color.black);
      g.drawRect(x, y, size, size);
      drawR(g, x+size/3, y, size/3);
      drawR(g, x+2*(size/3), y +size/3, size/3);
      drawR(g,x+size/3, y+2*(size/3), size/3);
      drawR(g, x, y+size/3, size/3);
    }
  }
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(500, 500));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.yellow);
      mainDraw(graphics);

    }
  }
}

