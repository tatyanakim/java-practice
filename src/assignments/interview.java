package assignments;
import java.util.ArrayList;
import java.util.Arrays;
public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	
 String str="xxcozeyycop";
	int c=0;
 for (int i=0;i<str.length()-2;i++) {
	if(str.substring(i,i+2).equals("co")&&i!=str.length()) {
if(str.charAt(i)=='c'&&str.charAt(i+1)=='o'&&str.charAt(i+3)=='e') {
	c++;
}
	}else {
		System.out.println(true);
	}
	
 }System.out.println(c);
	
	
	
	
	
	
	
	
	}
	}

