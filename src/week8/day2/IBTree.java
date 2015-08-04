package week8.day2;

public interface IBTree<E extends Comparable<E>> extends MyCollection<E> {

  E max();

  E min();
}
