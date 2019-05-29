package day40_OOP;

public class Contact {

	String name;
	String phoneNum="";
	String email=" ";
	
	
	
	
public void  call() {
	System.out.println(phoneNum+ " is calling you");
}public void sendMesssage() {
	System.out.println(name+ " sent you a message");
}public void sendEmail() {
	System.out.println(email+" sent you email");
}
}