import java.awt.*;
import java.util.Arrays;

public class PostIt {
  Color backgroundColor;
  String text;
  Color textColor;

  public PostIt(Color backgroundColor, String text, Color textColor){
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }
  public void print(){
    System.out.println(backgroundColor);
    System.out.println(text);
    System.out.println(textColor);
  }
  public static void main(String[] args) {

   PostIt idea = new PostIt(Color.orange, "idea 1", Color.blue);
   PostIt awesome = new PostIt(Color.pink, "Awesome", Color.black);
   PostIt superb = new PostIt(Color.yellow, "superb", Color.green);

   idea.print();
   awesome.print();
   superb.print();
  }

}
