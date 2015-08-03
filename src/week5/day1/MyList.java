package week5.day1;

public interface MyList<T> extends Iterable<T>{

  boolean add(T t);

  T get(int index);

  int size();

  T remove(int index);
}
