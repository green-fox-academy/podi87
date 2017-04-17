import java.net.CookieStore;
import java.util.ArrayList;
import java.util.List;

public class GameMap {

  List<MapTiles> tilesList;
  List<Double> freeFieldX = new ArrayList<>();
  List<Double> freeFieldY = new ArrayList<>();

  double[][] wallMatrix = new double[][]{
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
          {0, 1.1, 1.2, 1.3, 0, 0, 1.1, 1.2, 1.3, 0},
          {0, 1.4, 1.5, 1.6, 0, 0, 1.4, 1.5, 1.6, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 0, 2.1, 0, 0, 0, 0, 2.1, 0, 0},
          {0, 2.2, 2.3, 0, 0, 0, 2.2, 2.3, 0, 0},
          {0, 2.4, 2.5, 2.6, 0, 0, 2.4, 2.5, 2.6, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 3},};

  public GameMap() {

    tilesList = new ArrayList<>();
    for (int i = 0; i < wallMatrix.length; i++) {
      for (int j = 0; j < wallMatrix[i].length; j++) {
        MapTiles mapTiles = new MapTiles(j, i, wallMatrix[i][j] == 0, wallMatrix[i][j] == 1,
                wallMatrix[i][j] == 1.1, wallMatrix[i][j] == 1.2, wallMatrix[i][j] == 1.3,
                wallMatrix[i][j] == 1.4, wallMatrix[i][j] == 1.5, wallMatrix[i][j] == 1.6,
                wallMatrix[i][j] == 2.1, wallMatrix[i][j] == 2.2, wallMatrix[i][j] == 2.3,
                wallMatrix[i][j] == 2.4, wallMatrix[i][j] == 2.5, wallMatrix[i][j] == 2.6,
                wallMatrix[i][j] == 3);
        tilesList.add(mapTiles);
        if (wallMatrix[i][j] == 0) {
          freeFieldX.add(mapTiles.posX);
          freeFieldY.add(mapTiles.posY);
        }
      }
    }
  }
}