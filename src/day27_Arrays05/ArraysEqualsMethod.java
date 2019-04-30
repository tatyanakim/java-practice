package day27_Arrays05;

import java.util.Arrays;

public class ArraysEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Equals same index
		int[] nums1= {4,5,6,10,100};
		int[] nums2= {4,5,6,10,100};
		
	System.out.println(Arrays.equals(nums1, nums2));
		
		
	if(Arrays.equals(nums1, nums2)) {
		System.out.println("Same");
	}else {
		System.out.println("misatches values present");
	}
	
	
	
	String []str1= {"one","two","three"};
	String[] str2= {"one","two","three"};
	
	System.out.println(Arrays.equals(str1, str2));
	boolean match=Arrays.equals(str1, str2);
	System.out.println(match);
	
	
	
	//String st1= {"apple,orange,orange"};
	//String st2= {"apple,apple,orange"};
	
	
	//	Arrays.equals(str1.split(","),str2.split(","));
	
	
}
}
