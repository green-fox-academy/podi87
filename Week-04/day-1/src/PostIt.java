import java.awt.*;
import java.util.Arrays;

public class PostIt {
  String backgroundColor;
  String text;
  String textColor;

  public PostIt(String backgroundColor, String text, String textColor){
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

   PostIt idea = new PostIt("orange", "idea 1", "blue");
   PostIt awesome = new PostIt("pink", "Awesome", "black");
   PostIt superb = new PostIt("yellow", "superb", "green");

   idea.print();
   awesome.print();
   superb.print();
  }

}
