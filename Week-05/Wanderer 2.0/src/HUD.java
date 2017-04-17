import java.util.List;

public class HUD extends GameCharacter {

  public HUD() {
  }

  public String HUDScreenHero(GameCharacter gameCharacter) {
    String status = "";
    if (gameCharacter.pictureName.equals("hero-down.png")) {
      status = "Hero Level - " + gameCharacter.level + " | HP: " + gameCharacter.hp + "/" + gameCharacter.currentHP +
              " | DP: " + gameCharacter.dp + " | SP: " + gameCharacter.sp + key(gameCharacter);
    }
    return status;
  }

  public String HUDScreenEnemy(GameCharacter gameCharacter) {
    String status = "";
     if (gameCharacter.pictureName.equals("skeleton.png")) {
       status = "Stormtrooper Level - " + gameCharacter.level + " | HP: " + gameCharacter.hp + "/" + gameCharacter.currentHP +
              " | DP: " + gameCharacter.dp + " | SP: " + gameCharacter.sp + key(gameCharacter);
     } else if (gameCharacter.pictureName.equals("boss.png")) {
       status = "Boss Level - " + gameCharacter.level + " | HP: " + gameCharacter.hp + "/" + gameCharacter.currentHP +
              " | DP: " + gameCharacter.dp + " | SP: " + gameCharacter.sp + key(gameCharacter);
     }
    return status;
  }

  public String key(GameCharacter gameCharacter) {
    if (gameCharacter.hasKey == true) {
      return " - Has a key";
    }
    return " - Has no key";
  }
}
