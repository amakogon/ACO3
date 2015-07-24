package week2.day1;

import java.io.Serializable;

public class Dragon {
  private String name;
  private String color;
  private int age;

  private int damage;

  public Dragon(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public final void attack() {
    System.out.println("Dragon " + name + " is biting you. Damage =" + damage);
  }

  public void fly() {
    System.out.println("Dragon " + name + " is flying");
  }

  public boolean isSame(Dragon dragon){
    return name.equals(dragon.name) && color.equals(dragon.color);
  }

  @Override
  public String toString() {
    return "Dragon{" +
      "name='" + name + '\'' +
      ", color='" + color + '\'' +
      ", age=" + age +
      ", damage=" + damage +
      '}';
  }
}
