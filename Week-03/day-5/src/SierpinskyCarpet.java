import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics graph) {
    int x =0;
    int y =0;
    int size =900;
    //graph.drawRect(a, b, size, size);
    drawSq(graph, x, y, size, size);
  }
  public static void drawSq(Graphics g, int x, int y, int size, int size1) {
    int R = 0;
    int G = (int)(Math.random()*256);
    int B = (int)(Math.random()*256);
    g.setColor(new Color(R,G,B));
    g.fillRect(x+size/3, y+size/3, size/3,size/3);
    if (size < 1){
      return;
    }
    else {
      drawSq(g, x, y, size/3, size/3);
      drawSq(g, x+(size/3), y, size/3, size/3);
      drawSq(g, x+(size/3)*2, y, size/3, size/3);
      drawSq(g, x+(size/3)*2, y +(size/3), size/3, size/3);
      drawSq(g, x+(size/3)*2, y +(size/3)*2, size/3, size/3);
      drawSq(g, x+(size/3), y +(size/3)*2, size/3, size/3);
      drawSq(g, x, y+(size/3)*2, size/3, size/3);
      drawSq(g, x, y +(size/3), size/3, size/3);
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
      this.setBackground(Color.lightGray);
      mainDraw(graphics);

    }
  }
}

