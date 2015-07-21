package week7.day2;

public class Ex1 {
  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5};

//    print(arr, 0);


    System.out.println(count8(8818));
  }

  private static void print(int[] arr, int index) {
    if (index >= arr.length) {
      return;
    }
    System.out.print(arr[index] + " ");
    print(arr, ++index);
  }

  public static int count8(int n) {
    if (n == 0) {
      return 0;
    }

    int digit = n % 10;
    if (digit == 8 && n / 10 == 0) {
      return 1;
    }

    int next = (n / 10) % 10;
    if (digit == 8 && next == 8) {
      return 2 + count8(n / 10);
    }
    if (digit == 8) {
      return 1 + count8(n / 10);
    }
    return count8(n / 10);
  }
}
