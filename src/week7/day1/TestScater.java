package week7.day1;

public class TestScater {

  public static void main(String[] args) throws FallException {
    Skater tony = new Skater(15);

    tony.skate();
    try {
      tony.makeTrick();
      System.out.println("Ha ha. I am the best of the best");
    }
//    catch (FallException e) {
//      System.out.println("Catch exception.");
//    }
    finally {
      System.out.println("in finally");
    }
  }
}
