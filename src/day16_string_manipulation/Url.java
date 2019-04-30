package day16_string_manipulation;
import java.util.Scanner;
public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the url");
	String url=scan.next();
	
	if(url.startsWith("www.")) {
		System.out.println("It starts with www");
	}else {
		System.out.println("Wrong start: "+url);
	
	
	
	}
    int dotIndex=url.length()-4;
     if(url.charAt(dotIndex)=='.') {
    
    System.out.println("It has dot at the end before extension");
     }else {
    	 System.out.println(". might missplaced");
     }
      
      String domain=url.substring(4,dotIndex);
      String extension= url.substring(dotIndex+1,url.length());
      
      System.out.println();
      
      
	
			
	
	
	
	
	
	
	
	
	
	}

}
