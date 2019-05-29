package day42_Encapsulation;

public class Person {


//declare name and age encapsulated data

private String name;
private int age;


//give access to everyone
//create getter and setter methods for name 
//read only

public String getName() {
	return name;
}
//write only
public void setName(String name) {
	this.name=name;//assign to the upstairs name 
}





public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age=age;
}
}
