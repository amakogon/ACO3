package week7.day1;

import java.util.Stack;

public class TestStack {
  public static void main(String[] args) {
    IStack stack = new MyStack();

    stack.push(1);
    stack.push(2);
    System.out.println(stack.pop());
    System.out.println(stack.pop());


    System.out.println(stack.pop());

  }

}
