package week7.day1;

import java.util.EmptyStackException;

public class MyLinkedStack implements IStack {

  private Node top;
  private int size;

  @Override
  public Object pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    Object elem = top.value;
    top = top.next;
    size--;

    return elem;
  }

  @Override
  public boolean push(Object obj) {
//    if(isEmpty()){
//      top = new Node(obj, null);
//      return true;
//    }
    top = new Node(obj, top);
    size++;
    return true;
  }

  @Override
  public Object peek() {
    return null;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  private static class Node {
    Object value;
    Node next;

    Node(Object value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}
