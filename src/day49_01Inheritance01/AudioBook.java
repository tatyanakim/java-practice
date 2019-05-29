package day49_01Inheritance01;

public class AudioBook extends Book{

private double length;
private String Narrator;



public void listen() {
	System.out.println("Listenning to "+ getType()+" book by "+getAuthor()+" and narrated by "+Narrator);
}

public double getLength() {
	return length;
	
	
	
	
}

public void setLength(double length) {
	this.length = length;
}
public String getNarrator() {
	return Narrator;
}
public void setNarrator(String narrator) {
	Narrator = narrator;
}









}
