package week8.day2;

public interface MyCollection<E> {

  boolean add(E e);

  boolean contains(E e);

  int size();

  boolean isEmpty();

  E remove(E e);
}
