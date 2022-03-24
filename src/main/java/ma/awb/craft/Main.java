package ma.awb.craft;

public class Main {

  public static void main(String[] args) {
    PolygonFactory polygonFactory = new PolygonFactory();

    Polygon square = polygonFactory.getPolygon("SQUARE");
    System.out.println(square.draw());

    Polygon triangle = polygonFactory.getPolygon("Triangle");
    System.out.println(triangle.draw());

    Polygon pentagon = polygonFactory.getPolygon("PENTAGON");
    System.out.println(pentagon.draw());
  }
}
