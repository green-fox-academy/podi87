import java.util.List;

public class HUD extends GameCharacter {

  public HUD() {
  }

  public String HUDScreen(List<Enemy> enemy, Hero hero) {
//    System.out.println("Hero Level - " + level + "HP: " + hero.hp + "/" + currentHP +
//    " | DP: " + hero.dp + " | SP: " + 6);
    return "Hero Level - " + level + "HP: " + hero.hp + "/" + currentHP +
            " | DP: " + hero.dp + " | SP: " + 6;
  }

}
