package week8.day1;

import week5.day1.MyArrayList;
import week5.day1.MyList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
  public static void main(String[] args) {
    int[] mas = {4, 6, 3, 7, 1, 2};
    for (int num : mas) {
      System.out.print(num + " ");
    }
    System.out.println();

    MyList<Integer> list = new MyArrayList<Integer>();
//    List<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(7);
    list.add(1);

    System.out.println("~~~~iterate over list~~~~~");
    for(Integer i : list){
      System.out.println(i);
    }
    System.out.println("~~~");
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }

  }
}
