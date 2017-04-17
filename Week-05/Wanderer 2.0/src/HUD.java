import java.util.List;

public class HUD extends GameCharacter {

  public HUD() {
  }

  public String HUDScreen(GameCharacter gameCharacter) {
    String status  = "";
      if (gameCharacter.pictureName.equals("hero-down.png")) {
        status = "Hero Level - " + gameCharacter.level + " | HP: " + gameCharacter.hp + "/" + gameCharacter.currentHP +
                " | DP: " + gameCharacter.dp + " | SP: " + 6;
      } else if (gameCharacter.pictureName.equals("skeleton.png")) {
        status = "Stormtrooper Level - " + gameCharacter.level + " | HP: " + gameCharacter.hp + "/" + gameCharacter.currentHP +
                " | DP: " + gameCharacter.dp + " | SP: " + 6;
      } else if (gameCharacter.pictureName.equals("boss.png")) {
        status = "Boss Level - " + gameCharacter.level + " | HP: " + gameCharacter.hp + "/" + gameCharacter.currentHP +
                " | DP: " + gameCharacter.dp + " | SP: " + 6;
      }
    return status;
  }
}
