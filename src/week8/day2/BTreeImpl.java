package week8.day2;

public class BTreeImpl<E extends Comparable<E>> implements IBTree<E> {

  private Node<E> root;
  private int size;

  @Override
  public boolean add(E e) {
    if (e == null) {
      return false;
    }
    if (isEmpty()) {
      root = new Node<E>(e, null, null, null);
      size++;
      return true;
    }

    for (Node<E> start = root; ; ) {
      if (e.compareTo(start.value) < 0) {
        //go left
        if (start.leftChild == null) {
          start.leftChild = new Node<E>(e, start);
          break;
        } else {
          start = start.leftChild;
        }
      } else {
        //go right
        if (start.rightChild == null) {
          start.rightChild = new Node<E>(e, start);
          break;
        } else {
          start = start.rightChild;
        }
      }
    }
    size++;
    return true;
  }

  @Override
  public boolean contains(E e) {
    return node(e) != null;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public E remove(E e) {
    Node<E> target = node(e);

    if (target == null) {
      return null;
    }

    Node<E> targetLeftChild = target.leftChild;
    Node<E> targetRightChild = target.rightChild;

    E result = target.value;
    if (targetLeftChild == null && targetRightChild == null) {
      //check parent side
      if (target == root) {
        root = null;
      } else {
        Node<E> targetParent = target.parent;
        if (targetParent.rightChild == target) {
          targetParent.rightChild = null;
        } else {
          targetParent.leftChild = null;
        }
      }
    } else if (targetLeftChild == null) {
      if (target == root) {
        targetRightChild.parent = null;
        root = targetRightChild;
      } else {
        target.rightChild.parent = target.parent;
        target.parent = target.rightChild;
      }
    } else if (targetRightChild == null) {
      if (target == root) {
        targetLeftChild.parent = null;
        root = targetLeftChild;
      } else {
        target.leftChild.parent = target.parent;
        target.parent = target.leftChild;
      }
    } else {
      Node<E> maxLeft = max(targetLeftChild);
      target.value = maxLeft.value;
      maxLeft.parent.rightChild = maxLeft.leftChild;
      if (maxLeft.leftChild != null) {
        maxLeft.leftChild.parent = maxLeft.parent;
      }
    }
    return result;
  }

  @Override
  public E max() {
    Node<E> maxNode = max(root);
    return maxNode == null ? null : maxNode.value;
  }

  @Override
  public E min() {
    Node<E> minNode = min(root);
    return minNode == null ? null : minNode.value;
  }

  private Node<E> min(Node<E> start) {
    Node<E> min = start;
    while (min.leftChild != null) {
      min = min.leftChild;
    }
    return min;
  }

  private Node<E> max(Node<E> start) {
    Node<E> max = start;
    while (max.rightChild != null) {
      max = max.rightChild;
    }
    return max;
  }

  private Node<E> node(E elem) {
    Node<E> resultNode = null;
    for (Node<E> start = root; start != null; ) {
      if (start.value.equals(elem)) {
        resultNode = start;
        break;
      } else if (elem.compareTo(start.value) < 0) {
        start = start.leftChild;
      } else {
        start = start.rightChild;
      }
    }
    return resultNode;
  }

  private static class Node<E> {
    E value;
    Node<E> leftChild;
    Node<E> rightChild;
    Node<E> parent;

    private Node(E value, Node<E> leftChild, Node<E> rightChild, Node<E> parent) {
      this.value = value;
      this.leftChild = leftChild;
      this.rightChild = rightChild;
      this.parent = parent;
    }

    private Node(E value, Node<E> parent) {
      this(value, null, null, parent);
    }
  }

}
