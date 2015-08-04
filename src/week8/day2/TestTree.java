package week8.day2;

public class TestTree {
  public static void main(String[] args) {
    IBTree<Integer> tree = new BTreeImpl<Integer>();
    tree.add(8);
    tree.add(4);
    tree.add(2);
    tree.add(6);
    tree.add(5);
    tree.add(7);
    tree.add(10);
    tree.add(9);
    tree.add(12);

  }
}
