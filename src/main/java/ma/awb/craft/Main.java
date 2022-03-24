package ma.awb.craft;

public class Main {

  public static void main(String[] args) {
    Stock teslaStock = new Stock();

    BuyStock buyStockOrder = new BuyStock();
    SellStock sellStockOrder = new SellStock();

    Broker broker = new Broker();
    broker.takeOrder(buyStockOrder);
    broker.takeOrder(sellStockOrder);

    broker.placeOrders();
  }
}
