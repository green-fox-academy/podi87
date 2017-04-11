import java.util.List;

public class Enemy extends Board {

  String skeletonName = "skeleton.png";
  int skeleX;
  int skeleY;
  List<Integer> X;
  List<Integer> Y;
  public void drawSkeleton (List<Integer> X, List<Integer> Y) {
    PositionedImage skeleton = new PositionedImage(skeletonName, skeleX, skeleY);
    int temp = (int) (Math.random() * X.size());
    skeleX = X.get(temp);
    skeleY = Y.get(temp);
  }

  public Enemy() {
  }
}
