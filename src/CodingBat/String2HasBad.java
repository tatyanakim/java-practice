package CodingBat;
import java.util.*;
public class String2HasBad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	//Warmup-1 > everyNth 
		
	String str="abcdefg";
	int n=3;
	
	for(int i=0;i<str.length();i+=n) {
		System.out.println(str.charAt(i));
	}
	
	
	
	//Warmup-1 > lastDigit 
	
	
	int a=7;
	int b=17;
 if(a<b) {
	if( b%a==a) {
		System.out.println(true);
	}
 }else if(b<a) {
		if(a%b==b) {
			System.out.println(true);
		}
	}
 else {
	 System.out.println(false);
 }
	
	
 String ba="";
 String si ="bad";
	if(!str.contains("not")){
	   ba= "not "+si;
	    System.out.println(ba);
	  }else{
	   System.out.println(si);
	  }
	
	
	String w="ab";
	if(w.length()>=3) {
		w=w.substring(0,3).concat(w.substring(0,3)).concat(w.substring(0,3));
	
	System.out.println(w);
	}else{
		w=w.concat(w).concat(w);
		System.out.println(w);
	}
	
	
	
	
	
	}
}