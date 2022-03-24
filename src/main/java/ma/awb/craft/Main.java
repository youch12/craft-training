package ma.awb.craft;

public class Main {

  public static void main(String[] args) {
    MyUniqueResource firstInstance = MyUniqueResource.getInstance();

    System.out.println(firstInstance.getInfo());

    MyUniqueResource secondInstance = MyUniqueResource.getInstance();
    secondInstance.setInfo("New class info");

    System.out.println(firstInstance.getInfo());
    System.out.println(secondInstance.getInfo());
  }
}
