import java.awt.*;
import java.awt.List;
import java.util.*;
import java.util.*;


public class GameMap {

  String floor = "floor.png";
  String wall = "wall.png";
  int [][] matrix;
  java.util.List<Integer> mapX;
  java.util.List<Integer> mapY;
  PositionedImage floorTile;
  PositionedImage wallTile;
  Graphics graphics;

  public GameMap(Graphics graphics) {
    this.floor = floor;
    this.wall = wall;
    this.matrix = matrix;
    this.mapX = mapX;
    this.mapY = mapY;
    this.floorTile = floorTile;
    this.wallTile = wallTile;
    this.graphics = graphics;
  }

  public int availableMatrixLength (int [][] matrix) {
    int floorLength = 0;
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        if (matrix[row][column] == 0) {
          floorLength++;
        }
      }
    }
    return floorLength;
  }

  public void drawMap (Graphics graphicss, int [][] matrix, PositionedImage floorTile, PositionedImage wallTile, java.util.List<Integer> mapX, java.util.List<Integer> mapY) {
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        if (matrix[row][column] == 0 || matrix[row][column] == 2) {
          floorTile = new PositionedImage(floor, column * 72, row * 72);
          floorTile.draw(graphics);
          mapX.add(floorTile.posX);
          mapY.add(floorTile.posY);
        } else {
          wallTile = new PositionedImage(wall, column * 72, row * 72);
          wallTile.draw(graphics);
        }
      }
    }
  }
}
