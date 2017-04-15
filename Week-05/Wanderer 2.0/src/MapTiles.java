
public class MapTiles extends GameObject {


  boolean floor;
  boolean wall1;
  boolean wall2;
  boolean wall3;
  boolean wall4;
  boolean wall5;
  boolean wall6;
  boolean wall7;

  public MapTiles(int posX, int posY, boolean floor, boolean wall1, boolean wall2, boolean wall3, boolean wall4, boolean wall5, boolean wall6, boolean wall7) {
    super(posX, posY, "floor.png");
    if (floor){
      pictureName = "floor.png";
    }else if (wall1){
      pictureName = "wall1.png";
    }else if (wall2){
      pictureName = "wall2.png";
    }else if (wall3){
      pictureName = "wall3.png";
    }else if (wall4){
      pictureName = "wall4.png";
    }else if (wall5){
      pictureName = "wall5.png";
    }else if (wall6){
      pictureName = "wall6.png";
    }else if (wall7){
      pictureName = "wall7.png";
    }

  }
}
