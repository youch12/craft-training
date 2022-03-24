package ma.awb.craft;

public class Stock {

  private String name;

  public Stock(String name) {
    this.name = name;
  }

  public void buy() {
    System.out.println("Stock [ Name: " + name + "] bought");
  }

  public void sell() {
    System.out.println("Stock [ Name: " + name + "]sold ");
  }
}
