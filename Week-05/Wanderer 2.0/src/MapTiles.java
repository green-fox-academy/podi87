
public class MapTiles extends GameObject {


  boolean floor;

  public MapTiles(int posX, int posY, boolean floor) {
    super(posX, posY, floor ? "floor.png" : "wall.png");
  }
}
