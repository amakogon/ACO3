package week8.day1;

public interface MyDeque<E> extends Iterable<E> {

  boolean addFirst(E e);

  E removeFirst();

  boolean addLast(E e);

  E removeLast();

  E getFirst();

  E getLast();
}
