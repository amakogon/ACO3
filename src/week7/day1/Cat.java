package week7.day1;

import week2.day1.Dragon;

import java.io.Serializable;

public class Cat implements Serializable{
  String name;
  int age;
  transient Dragon bestFriend;

  public Cat(String name) {
    this.name = name;
  }

  public void setBestFriend(Dragon bestFriend) {
    this.bestFriend = bestFriend;
  }

  @Override
  public String toString() {
    return "Cat{" +
      "name='" + name + '\'' +
      ", age=" + age +
      ", bestFriend=" + bestFriend +
      '}';
  }
}
