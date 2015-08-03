package week5.day1;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{

  private static final int DEFAULT_CAPACITY = 16;

  private T[] elements;
  private int index;

  public MyArrayList() {
    this(DEFAULT_CAPACITY);
  }

  public MyArrayList(int capacity) {
    elements = (T[]) new Object[capacity];
  }

  public boolean add(T t) {
    ensureCapacity();
    elements[index++] = t;
    return true;
  }

  private void ensureCapacity() {
    if (index >= elements.length) {
      elements = Arrays.copyOf(elements, index * 2);
    }
  }

  public T get(int index) {
    return elements[index];
  }

  public int size() {
    return index;
  }

  @Override
  public T remove(int index) {
    return null;
  }

  @Override
  public Iterator<T> iterator() {
    return new MyArrayListIterator();
  }

  private class MyArrayListIterator implements Iterator<T>{
    private int index = 0;

    @Override
    public boolean hasNext() {
//      return elements[index] != null;
      return index < size();
    }

    @Override
    public T next() {
      return elements[index++];
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }

}
