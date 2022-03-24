package ma.awb.craft;

public class Main {

  public static void main(String[] args) {
    PolygonFactory polygonFactory = new PolygonFactory();

    Polygon instance = polygonFactory.getPolygon("");
    instance.draw();
  }
}
