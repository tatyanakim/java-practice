package CodingBat;
import java.util.Arrays;
public class has271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String a=""	;
	String b="h";
	
		String ab="";
	if(a.length()==0&&b.length()==0) {
		ab="@@";
	}else if( a.length()==0) {
		ab="@"+b.substring(b.length()-1);
	}else if(b.length()==0) {
		ab=a.substring(0,1)+"@";
		
	}else {
		ab=a.substring(0,1)+b.substring(b.length()-1);
		
	}
	System.out.println(ab);
	
	
	
	String str="blueTimes";
	
	
	
	if(str.startsWith("red")) {
		System.out.println("red");
	}else if(str.startsWith("blue")) {
		System.out.println("blue");
	}else {
		System.out.println("empty");
	}
	
	
	
String s="Hello";

	
	
	
	
	
	}
		
}
	
	
	
	
	


