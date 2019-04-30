package day14_string_methods;
import java.util.Scanner;

public class StringSize {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the emoji:");
		String emoji=scan.next();
		
		if(emoji.length()!=2) {
			System.out.println("Invalid emoji");
			return;//stop execution(if its true dont run the rest
		}
			char first = emoji.charAt(0);
	        char second =emoji.charAt(1);
	       
	       
	if(first==(':')) {
			 if(second==(')')) {
			      System.out.println("smile");
		   
			 }else if(second==('('))  {
			        System.out.println("sad");
			
			
		    }else if(second==('/') ){
			         System.out.println("upset");
		
		    }else if(second==('p')) {
			           System.out.println("playfull");
		    
		    }else {
		    	    System.out.println("Invalid emoji");
		    }

		
			 
			 
			 
			 
			
	}
		
		
	
	
	}
	
	
	
	
	
	
	
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	/*String str1="Good Morning";
	if (str1.equals("Good Morning")) {
		System.out.println("match");
	}else {
		System.out.println("Not match");
	
	}
	
	
	if(str1.equalsIgnoreCase("Good Morning")) {
		System.out.println("Match-ignore case");
	}else {
		System.out.println("Not match-ignore case");
	}
	System.out.println(str1.toUpperCase());
	
	System.out.println(str1);
	 str1=str1.toUpperCase();
	
	 if(str1.toLowerCase().equals("good morning")) {
		 System.out.println("Chained methods");
	 }
	String myName="Tatyana";
	System.out.println(myName.length());
	
	int length=myName.length();
	System.out.println("My name is length: "+length) ;
	
	String userName="Tatyana";
	if(userName.length()==8) {
		System.out.println("Valid name");
		
	}String password="Risya";
	if(password.length()>6) {
		System.out.println("Valid password");
	}*/
	
	
	
	
	
	}


