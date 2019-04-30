package day28_arrays;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Reversed Array
	String sentence="You are very interesting person";
	String[] reversed1=sentence.split(" ");
	System.out.println(Arrays.toString(reversed1));
	int count=0;
	String[] reversed= new String[reversed1.length];
	for(int i=reversed1.length-1;i>=0;i--) {
		reversed[count]=reversed1[i];
		count++;
		
	}System.out.println(Arrays.toString(reversed));
	
	
	//Murodils version
	
	String sentence2="You are very interesting person";
	String[] arr=sentence.split(" ");
	System.out.println(Arrays.toString(arr));
	 String rev=" ";
	for(int i2=arr.length-1;i2>=0;i2--) {
		
	System.out.print(arr[i2]+" ");//version1
	  
	System.out.println();
	
	rev+=arr[i2]+" ";//
	
	}                          //version 2
	System.out.print(rev.trim());//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	








}
