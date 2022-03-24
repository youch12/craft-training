package ma.awb.craft;

public class PolygonFactory {

  public Polygon getPolygon(String type) {
    if (type == null) {
      return null;
    }
    if (type.equalsIgnoreCase("Triangle")) {
      return new Triangle();
    } else if (type.equalsIgnoreCase("Square")) {
      return new Square();
    } else if (type.equalsIgnoreCase("Pentagon")) {
      return new Pentagon();
    }
    return null;
  }
}
