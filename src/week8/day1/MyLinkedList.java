package week8.day1;

import week5.day1.MyList;

import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E>, MyDeque<E> {

  private int size;
  private Node<E> head;
  private Node<E> tail;

  @Override
  public boolean add(E e) {
    if (isEmpty()) {
      addFirst(e);
      tail = head;
      return true;
    }
    Node<E> node = new Node<E>(e, null, tail);
    tail.next = node;
    tail = node;
    size++;
    return true;
  }

  @Override
  public E get(int index) {
    return node(index).elem;
  }

  @Override
  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }


  private Node<E> node(int index) {
    checkIndex(index);
    if (index == 0) {
      return head;
    } else if (index == size - 1) {
      return tail;
    }

    Node<E> node;
    if (index > size() / 2) {
      int counter = size - 1;
      node = tail;
      while (counter != index) {
        node = tail.prev;
        counter--;
      }
    } else {
      int counter = 1;
      node = head;
      while (counter != index) {
        node = head.next;
        counter++;
      }
    }
    return node;
  }

  private void checkIndex(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException(String.valueOf(index));
    }
  }

  @Override
  public E remove(int index) {
    checkIndex(index);
    if (index == 0) {
      return removeFirst();
    } else if (index == size() - 1) {
      return removeLast();
    }

    Node<E> node = node(index);
    E returnElem = node.elem;

    node.prev.next = node.next;
    node.next.prev = node.prev;

    return returnElem;
  }


  @Override
  public Iterator<E> iterator() {
    return null;
  }

  @Override
  public boolean addFirst(E e) {
    head = new Node<E>(e, head, null);
    size++;
    return true;
  }

  @Override
  public E removeFirst() {
    return null;
  }

  @Override
  public boolean addLast(E e) {
    return add(e);
  }

  @Override
  public E removeLast() {
    return null;
  }

  @Override
  public E getFirst() {
    return get(0);
  }

  @Override
  public E getLast() {
    return get(size - 1);
  }

  private static class Node<E> {
    E elem;
    Node<E> next;
    Node<E> prev;

    private Node(E elem, Node<E> next, Node<E> prev) {
      this.elem = elem;
      this.next = next;
      this.prev = prev;
    }
  }
}
