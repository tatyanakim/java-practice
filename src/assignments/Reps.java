package assignments;
import java.util.*;
public class Reps {
	public static void main(String[] args) {
		
	
	//181 done
		
	//	returns "foo bar"
		String[]combineRs= {"f","o","o"};
        String[]combineRs2= {" b","a","r"};
		
	String combined="";
	for(String s:combineRs) {
		combined+=s;
	}
	for(String s2:combineRs2) {
		combined+=s2;
	}
	
	System.out.print(combined);
	
	System.out.println();
	
	
	
	//zombie attack
	        //Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
			//Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
			//Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
			//Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
	  
     
      
	//done
     
     String num="aa2a3a";// ==> 23
      String n="";
    for(int i=0;i<num.length();i++) {
    	if( Character.isDigit(num.charAt(i)) ){
    		n+=num.charAt(i);
    	}
    	
    	
    	
    	

	
    } System.out.print(n);
    }
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
