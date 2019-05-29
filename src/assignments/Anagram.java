package assignments;
import java.util.Scanner;//import Scanner
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Anagram is a word, phrase, or name formed by rearranging 
		//the letters of another, such as cinema, formed from iceman.
		//Anagram
		//1)ignore spaces
		//2)make code case sensitive
		
	Scanner scan =new Scanner(System.in);
	//ask user for an input
	System.out.println("Enter word1: ");
	//lets get this input assume that it will be a space 
	String w1=scan.nextLine();
	System.out.println("Enter word2: ");
	String w2=scan.nextLine();
	
	//lets create if condition to remove spaces
	if(w1.contains(" ")||w2.contains(" ")) {
	w1=	w1.replaceAll("\\s", "");
	w2=w2.replaceAll("\\s", "");
	//checking on spaces
	System.out.println(w1);
	System.out.println(w2);
	}
	
	
	
	//convert our input to Lower Case(
	w1=w1.toLowerCase();
	w2=w2.toLowerCase();
	System.out.println(w1);
	System.out.println(w2);
	
	
	
		
	//now we have to check  if word1 and word2 are anagram to each other 
	//we can do it by converting String to array ,sort it and compare with each other 
	//but lets use for loop /may be we will need nested for loop
	 //what i want to do is actually to check every single letter of word1 and if it equals to word2
	  //we need to add this letter to a new variable 
	   //lets create a variable 
	    
	 String temp="";
	  
	
	for(int i=0;i<w1.length();i++) {
		for(int j=0;j<w2.length();j++) {
			//if condition
			
			
			if(w1.charAt(i)==w2.charAt(j)) {
			temp+=w1.charAt(i);
			System.out.println(w1.charAt(i));
			break;
			
			}
		}
				
		}
	if(temp.equals(w1)) {
		System.out.println("Its anagram");
	}else {
		System.out.println("Its not anagram");
	}
		
	
	}
	
	}


