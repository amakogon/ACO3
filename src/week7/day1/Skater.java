package week7.day1;

import week3.day1.geometry.Figure;

public class Skater {


  private int skill;

  public Skater(int skill) {
    this.skill = skill;
  }

  public void makeTrick() throws FallException {
    if(skill < 10 || Math.random() < 0.4){
      throw new FallException();
    }
    System.out.println("back flip");
  }

  public void skate() {
    System.out.println("Prosto skate");
  }
}
