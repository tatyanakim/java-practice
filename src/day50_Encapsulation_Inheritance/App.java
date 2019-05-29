package day50_Encapsulation_Inheritance;

public class App {


private String name;
 
static int count;
 
public  App(String name){
	 this.name=name;
 }

public static void build(String language) {
	System.out.println("Building an app using "+language);
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

















}
