package day40_OOP;

public class Employee {


  public String name;//can be used anywhere in project
  public String jobTitle;
  public double salary;



public void work() {
	System.out.println(name+ " is working hard");

}public void attendMeeting() {
		System.out.println(name+" attending all the meetings");
	
}public void introduce() {
	System.out.println( "name: ["+ name+"] jobTitle: ["+jobTitle+"] "+ "salary: ["+ salary+"]");
}

}
