package day14_string_methods;
import java.util.Scanner;
public class Length {
	public static void main(String[] args) {
   
  Scanner scan=new Scanner(System.in);
    System.out.println("Enter word:1)2): ");
    String word1=scan.next();
    String word2=scan.next();
    
     
    
    if(word1.length()>word2.length()) {
    	System.out.println("world1 value is longer");
    }else {
    	System.out.println("word2 value is longer");
    }
	
	
	
	
	
	
	}
}