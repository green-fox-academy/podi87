/**
 * Created by Asus on 2017-03-23.
 */
public class UrlFixer {
  public static void main(String[] args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    String toReplace = "odds";
    char[] urlchar = url.toCharArray();
    urlchar[38] = 'o';
    urlchar[39] = 'd';
    urlchar[40] = 'd';
    urlchar[41] = 's';
    System.out.println(url.replace("bots", toReplace));
    System.out.println(urlchar);
    StringBuffer newrl = new StringBuffer(url);
      newrl.setCharAt(38, 'o');
      newrl.setCharAt(39, 'd');
      newrl.setCharAt(40, 'd');
    
    System.out.println(newrl);
  }
}
