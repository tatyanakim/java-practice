package day32_Methods;

import java.util.Arrays;

public class ArrayParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//Method: printArray
	//return type void
		//param:int[] nums
	// print values of the nums array
	
	int[] myArray= {44,22,66,11};
	printArray(myArray);
	printArray(new int[] {33,45,34,4});
	int[] myNums=new int[] {2,3,6,44,89,90};
	printArray(myNums);
	
	int[]one= {1,3,5};
	int[]two= {5,9,8,56,66};
	print2ArraysV2(one,two);//calling print Array method
	print2Arrays(one,two);
	
	}
public static void printArray(int[]nums) {
	for(int n:nums) {
		System.out.print(n+" ");
		
	}System.out.println();
}





public static void print2ArraysV2(int[] arrone,int[] arrtwo) {
	if(arrone.length>arrtwo.length) {
		printArray(arrone);
		printArray(arrtwo);
	}else {
		printArray(arrtwo);
		printArray(arrone);
		}
	
}
public static void print2Arrays(int[] arrone,int[] arrtwo) {
	if(arrone.length>arrtwo.length) {
		System.out.println(Arrays.toString(arrone));
		System.out.println(Arrays.toString(arrtwo));
	}else {
		System.out.println(Arrays.toString(arrtwo));
		System.out.println(Arrays.toString(arrone));
		}
	
}
		
	
	
}

