package day19_loop;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		///Example anna    bob     racecar====> Palindrome
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter word");
	
		String word=scan.nextLine();
	
		
		if (word.contains(" ")) {
		word=word.replaceAll("\\s", "");
		}
	    
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
		System.out.println(reversed);
	return;
	
	
	}
	
	String a="nurses run";
	String b="nursesrun";
	
	a=a.replaceAll("\\s", "");//remove all spaces in a String
	System.out.println(a);
	System.out.println(a.equals(b));
	
	
	
	
	
	}

}
