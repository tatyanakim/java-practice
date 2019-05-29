package day51Inheritance;

public class Snowboarding extends Exercise{
  public int perform (int minutes) {
	  super.perform(10);//version from the parent 
System.out.println("Snowboarding");
return minutes*7;
  }
}
