package ma.awb.craft;

public class Main {

  public static void main(String[] args) {
    Stock teslaStock = new Stock("TESLA");
    Stock amazonStock = new Stock("AMAZON");

    BuyStock teslaBuyOrder = new BuyStock(teslaStock);
    SellStock teslaSellOrder = new SellStock(teslaStock);

    BuyStock amazonBuyOrder = new BuyStock(amazonStock);
    SellStock amazonSellOrder = new SellStock(amazonStock);

    Broker broker = new Broker();
    broker.takeOrder(teslaBuyOrder);
    broker.takeOrder(teslaSellOrder);

    broker.takeOrder(amazonBuyOrder);
    broker.takeOrder(amazonSellOrder);

    broker.placeOrders();
  }
}
