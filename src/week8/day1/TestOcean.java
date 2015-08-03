package week8.day1;

public class TestOcean {

  public static void main(String[] args) {
    Ocean atlantic = Ocean.ATLANTIC;

    System.out.println(atlantic);
    System.out.println(atlantic.getSquare());

    Ocean pacific = Ocean.valueOf("PACIFIC");
    System.out.println(pacific);

    System.out.println("~~~~~~~~~~~~~");
    for(Ocean ocean : Ocean.values()){
      System.out.println(ocean);
    }

    System.out.println(pacific.compareTo(atlantic));

  }
}
