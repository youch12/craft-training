package ma.awb.craft;

public class Main {

  public static void main(String[] args) {

    Observable observable = new Observable();

    Observer1 observer1 = new Observer1();
    Observer2 observer2 = new Observer2();

    observable.attach(observer1);
    observable.attach(observer2);

   System.out.println("Observable state "+ observable.getState());
    observable.setState(20);
  }
}
