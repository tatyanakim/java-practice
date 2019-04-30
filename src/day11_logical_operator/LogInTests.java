package day11_logical_operator;
import java.util.Scanner;
public class LogInTests {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your username:");
	    String userName=scan.next();
	    System.out.println("Enter your  password:");
	    String userPassword=scan.next();
	    String validUserName="cybertek@mail.com";
	    String validUserPassword="WoodenSpoon123";
	    if (userName.contentEquals(validUserName)&&userPassword.contentEquals(validUserPassword)){
	    System.out.println("Login Successful,Welcome!");	
	    }else if(!userName.equals(validUserName)&& !userPassword.contentEquals(validUserPassword)){
	    	System.out.println("Invalid username and invalid password");
	    }else if(userName.contentEquals(validUserName)||!userPassword.equals(validUserPassword)) {
	    	System.out.println("Invalid password");
	    }else if(!userName.equals(validUserName)||userPassword.contentEquals(validUserPassword)) {
	    	System.out.println("Invalid Username");
	    }
	
	//equalsIgnoreCase-its opposite to contentEquals
	}

}
