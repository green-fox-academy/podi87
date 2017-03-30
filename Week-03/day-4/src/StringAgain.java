
public class StringAgain {
  public static void main(String[] args) {
    String words = "Xmen";
    char x = 'X';
    String to = "";
    System.out.println(charChange(words, x, to));
  }
  public static String charChange(String n, char from ,String to) {
    to = "";
    if(n.length() < 1){
      return n;
    }
    else {
      return (from == n.charAt(0) ? to : n.charAt(0)) + charChange(n.substring(1), from, to);
    }
  }
}

