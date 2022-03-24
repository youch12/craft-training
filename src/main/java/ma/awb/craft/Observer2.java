package ma.awb.craft;

public class Observer2 implements Observer {

  public void update(int state) {
    System.out.println("Updated state inside Observer 2: " + state);
  }
}
