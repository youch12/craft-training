package ma.awb.craft;

public class Observer1 implements Observer {

  public void update(int state) {
    System.out.println("Updated state inside Observer 1: " + state);
  }
}
