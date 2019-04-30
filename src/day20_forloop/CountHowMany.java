package day20_forloop;
import java.util.Scanner;
public class CountHowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scan=new Scanner(System.in);
       System.out.println("Enter word ");
       String word=scan.next();
       char myChar='m';
       int count=0;
       
       for(int i=0;i<word.length();i++) {
    	   if(myChar==word.charAt(i)){
    		   count++;
    		   
    	   }
    	   
       }
       System.out.println("\"m\"count:"+count);
       
	
	
	
	
	
	}

}
