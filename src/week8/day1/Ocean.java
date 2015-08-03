package week8.day1;

public enum Ocean {
  PACIFIC(3000), INDIAN(1700), ATLANTIC(2400), NORTH_ATLANTIC(500);

  private final double square;

  private Ocean(double square) {
    this.square = square;
  }

  public double getSquare() {
    return square;
  }

}
