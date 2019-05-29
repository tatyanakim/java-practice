package day46Static;

public class Customer {


private String name;
private String email;

//variable for tracking//static means shared
 static int count;


public Customer () {
	this.name="undefined";
	this.email="undefined";
	count++;
	
	
	
	
	

}public Customer(String name, String email) {
		setName(name);
		setEmail(email);
		count++;
	
}






public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", email=" + email + "]";
}


















}
