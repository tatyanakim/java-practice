package day24_arrays;

import java.util.Arrays;

public class SumOfNum {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		/*int sumOfNum=0;
		int[] nums= new int[3];
		nums[0]=5;
		nums[1]=6;
		nums[2]=7;
		for(int i=0;i<nums.length;i++) {
			
			sumOfNum+=nums[i];
		 System.out.println(nums[i]);
			//System.out.println(Arrays.toString(nums));//toString(from arrays class can help us to print an array as a String
		}
		System.out.println(sumOfNum);*/
		
		
		
		int max=0;
		int[] numbers= new int[3];
		numbers[0]=5;
		numbers[1]=6;
		numbers[2]=7;
		for(int i=0;i<numbers.length;i++) {
		if(numbers[i]>max) {
			max=numbers[i];//assign to max the biggest one
		}
		}System.out.println("Max num is "+max);
		
		
		
		int min=Integer.MAX_VALUE;
		int[] numbes= new int[3];
		numbes[0]=5;
		numbes[1]=6;
		numbes[2]=7;
		for(int j=0;j<numbes.length;j++) {
		if(numbes[j]<min) {
			min=numbes[j];//assign to max the biggest one
		}
		}System.out.println("Min num is "+min);
		
		
		
		
		
		
		
	}

}
