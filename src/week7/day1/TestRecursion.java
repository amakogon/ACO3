package week7.day1;

public class TestRecursion {

  public static void main(String[] args) {
//    System.out.println(fact(20));
//    System.out.println(factFor(5));


    for (int i = 0; i < 50; i++) {
      System.out.print(fib(i) + " ");
    }
    System.out.println();

  }

  public static long fact(long number) {
    if (number < 3) {
      return number;
    }
    return number * fact(number - 1);
  }

  public static long factFor(long num) {
    long res = 1;
    for (long i = num; i > 1; i--) {
      res = res * i;
    }
    return res;
  }
// 1 1 2 3 5 8
  public static int fib(int num) {
    if (num < 3) {
      return 1;
    }
    return fib(num - 1) + fib(num - 2);
  }
}
