package repl_arrays_assignments;

import java.util.Arrays;

public class Repl100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//170 done
	String str="one two three";
	String bad="two";
	String none="";
	if(str.contains(bad)) {
	none=str.replace(bad ,"");
		
	}
	System.out.println(none);
	
	
	//171
	
	
	String limit="bla bla";
	String[]lim=limit.split("");
	String result="";
	int cut=2;
	int res=0;
	//returns "ab"
   res=lim.length-cut;
   for(int i=0;i<res;i++) {
	   result+=lim[i];
   }
	System.out.println(result);
	
	
	
	
	
	//173
	String a="apple";
	String b="catqqqqqq";

	   if(a.length()>b.length()){
		   System.out.println(a);
	   }
	   
	   else{
		   System.out.println(b);
	   }
	  
	
	//172
	String at3="longword";
	String mid="foo";
	String first="";
	String lastt="";
	String whole="";
	
	//will return: "lonfoogword"


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
