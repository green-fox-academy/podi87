import java.util.Scanner;
/**
 * Created by Asus on 2017-03-22.
 */
public class SausageParty {
  public static void main(String[] args) {

    Scanner party = new Scanner(System.in);

    System.out.println("Number of girls who come to the party: ");
    int ui1 = party.nextInt();
    System.out.println("Number of boys who come to the party: ");
    int ui2 = party.nextInt();

    if (ui1 == 0) {
      System.out.println("Sausage party :D");
    }
    else if ((ui1 + ui2) >= 20 && (ui1 / ui2) != 1.) {
      System.out.println("Quite cool party! ");
    }
    else if ((ui1 + ui2) < 20) {
      System.out.println("Average party...");
    }
    else if (ui1 == ui2 && (ui1 + ui2) > 20) {
      System.out.println("The party is excellent!");
    }
  }
}
