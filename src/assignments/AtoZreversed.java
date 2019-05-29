package assignments;

import java.util.Arrays;

public class AtoZreversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		String str="Ab,c,de!$";//"c,b$a"
		char[]charArr=str.toCharArray();
		char[] sameplace=new char[str.length()];
		char []ar=new char[str.length()];
		int c=0;
	  
	for(int i=str.length()-1;i>=0;i--) {
	   if(Character.isAlphabetic(str.charAt(i))) {
		  ar[c]=str.charAt(i);
		 
		  c++;
	   }else {
		   sameplace[i]=str.charAt(i);
	   }
	   
	}
	int count=0;
	
	
	
	
	for(int j=0;j<sameplace.length;j++) {
		if(sameplace[j]=='\u0000') {
			sameplace[j]=ar[count];
			count++;
		}else {
			sameplace[j]=sameplace[j];
			
		}
	
	
	
	}String s=new String (sameplace);
	System.out.println(Arrays.toString(sameplace));
   System.out.println(s);
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}