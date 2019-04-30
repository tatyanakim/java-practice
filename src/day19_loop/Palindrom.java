package day19_loop;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		///Example anna    bob     racecar====> Palindrome
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter word");
		String word=scan.next();
	    
		String reversed="";
	     int i = word.length()-1;
	  
	     
	     while(i>=0) {
		reversed+=word.charAt(i);
	    i--;
	     }
	if(reversed.equalsIgnoreCase(word)) {
		System.out.println("its palindrome");
	}else {
		System.out.println("Not palindrome");
	return;
	
	
	}
	
	
	
	
	
	
	
	
	
	
	}

}
