import java.net.CookieStore;
import java.util.ArrayList;
import java.util.List;

public class GameMap {

  List<MapTiles> tilesList;
  List<Integer> freeFieldX = new ArrayList<>();
  List<Integer> freeFieldY = new ArrayList<>();

  int[][] wallMatrix = new int[][]{
          {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
          {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
          {0, 1, 0, 1, 0, 1, 1, 0, 0, 0},
          {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
          {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
          {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},};


  public GameMap() {

    tilesList = new ArrayList<>();
    for (int i = 0; i < wallMatrix.length; i++) {
      for (int j = 0; j < wallMatrix[i].length; j++) {
        MapTiles mapTiles = new MapTiles(j, i, wallMatrix[i][j] == 0);
        tilesList.add(mapTiles);
        if (wallMatrix[i][j] == 0) {
          freeFieldX.add(mapTiles.posX);
          freeFieldY.add(mapTiles.posY);
        }
      }
    }
  }
}