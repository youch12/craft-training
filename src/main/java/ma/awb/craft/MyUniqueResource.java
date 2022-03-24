package ma.awb.craft;

public class MyUniqueResource {

  private static MyUniqueResource instance = new MyUniqueResource();
  private String info = "Initial info class";

  // private constructor
  private MyUniqueResource() {
  }

  public static MyUniqueResource getInstance() {
    return instance;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }
}
