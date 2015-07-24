package week2.day2;

import week2.day1.Dragon;

public class IceDragon extends Dragon {
  private int iceDamage;

  public IceDragon(String name, String color) {
//    super();
    super(name, color);
  }

  public void setIceDamage(int iceDamage) {
    this.iceDamage = iceDamage;
  }

  public int getIceDamage() {
    return iceDamage;
  }

//  public void attack(){
//    System.out.println("I can't attack");
//  }


  public void fly() {
    super.fly();
  }


  public void freeze() {
    System.out.println("Freeze with damage " + iceDamage);
  }
}
