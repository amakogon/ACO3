package week7.day1;

import java.util.Arrays;

public class MyStack implements IStack {

  private Object[] elements;
  private int size;

  public MyStack() {
    elements = new Object[16];
  }

  @Override
  public Object pop() {
    checkSize();
    Object value = elements[--size];

    //help GC
    elements[size] = null;
    return value;
  }

  private void checkSize() {
    if (size == 0) {
      throw new MyEmptyStackException();
    }
  }

  @Override
  public boolean push(Object obj) {
    ensureCapacity();
    elements[size++] = obj;
    return true;
  }

  private void ensureCapacity() {
    if (size >= elements.length) {
      Arrays.copyOf(elements, elements.length * 2);
    }
  }

  @Override
  public Object peek() {
    checkSize();
    return elements[size - 1];
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }
}
