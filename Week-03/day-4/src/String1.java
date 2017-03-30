
public class String1 {
  public static void main(String[] args) {
    String words = "Xmen";
    char x = 'X';
    char y = 'y';

    System.out.println(charChange(words, x, y));
  }
  public static String charChange(String n, char from ,char to) {
    if(n.length() < 1){
      return n;
    }
    else {
      char change = (from == n.charAt(0) ? to : n.charAt(0));
      return change + charChange(n.substring(1), from, to);
    }
  }
}

