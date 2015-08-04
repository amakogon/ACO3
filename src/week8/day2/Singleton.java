package week8.day2;

public class Singleton {

  private static Singleton instance;
  private Singleton(){
    System.out.println("in constructor");
  }

  public static Singleton getInstance() {
    if(instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
  public static void foo(){}
}
