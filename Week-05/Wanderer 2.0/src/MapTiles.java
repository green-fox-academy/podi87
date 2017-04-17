
public class MapTiles extends GameObject {


  boolean floor;
  boolean wall1;
  boolean wall2;
  boolean wall3;
  boolean wall4;
  boolean wall5;
  boolean wall6;
  boolean wall7;
  boolean wall8;
  boolean wall9;
  boolean wall10;
  boolean wall11;
  boolean wall12;
  boolean wall13;
  boolean r2d2;

  public MapTiles(int posX, int posY, boolean floor, boolean wall1, boolean wall2, boolean wall3, boolean wall4, boolean wall5,
                  boolean wall6, boolean wall7,  boolean wall8, boolean wall9, boolean wall10, boolean wall11, boolean wall12, boolean wall13, boolean r2d2) {
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
    }else if (wall8){
      pictureName = "walker1.png";
    }else if (wall9){
      pictureName = "walker2.png";
    }else if (wall10){
      pictureName = "walker3.png";
    }else if (wall11){
      pictureName = "walker4.png";
    }else if (wall12){
      pictureName = "walker5.png";
    }else if (wall13){
      pictureName = "walker6.png";
    } else if (r2d2){
      pictureName = "r2d2floor.png";
    }
  }
}
