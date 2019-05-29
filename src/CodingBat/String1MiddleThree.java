package CodingBat;
import java.util.ArrayList;
import java.util.Arrays;

public class String1MiddleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int fLetter=((word.length()-1)/2)-1;
	     // int sLetter=((word.length()-1)/2);
	     // int tLetter=((word.length()-1)/2)+1;
	    
	
	
	String s="aio";
	if(s.contains(" ")) {
		s=s.replaceAll("\\s", "");
		System.out.println(s);
	}
	if(s.length()==3) {
	System.out.println(s);
	}
	else {
	String 	s2=s.substring((s.length()-1)/2-1,(s.length()-1)/2+2);
	System.out.println(s2);
	}
	
	//switch nums
	int temp=0;
	int []arr= {7,2,3,5};
	temp=arr[0];
arr[0]=arr[arr.length-1];
arr[arr.length-1]=temp;
	System.out.println(Arrays.toString(arr));
	
	//arrayList double return
	

}
