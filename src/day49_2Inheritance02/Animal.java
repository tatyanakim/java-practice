package day49_2Inheritance02;

public class Animal {

private String type;
public Animal() {
	System.out.println("Animal constructor");
	type="undefined";
	
}	
	public Animal(String type) {
		System.out.println("Animal 1 arg constructor");
		this.type=type;
	
	
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}







}
