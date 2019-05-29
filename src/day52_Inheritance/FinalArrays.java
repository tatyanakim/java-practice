package day52_Inheritance;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String []args) {
	
		final int[] TEAMS= new int []{11,11};
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team2: "+TEAMS[1]);
		
		TEAMS[0]=10;
		TEAMS[1]=9;
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team2: "+TEAMS[1]);
		int[]nums=new int[]{23,454,56}	;
		System.out.println(Arrays.toString(nums));
		
		nums=new int[] {123,345,65,55};
		System.out.println(Arrays.toString(nums));
		
		
		final int[] finalNums= {23,54,656,98};
		System.out.println(Arrays.toString(finalNums));
		final double[]PRICES=new double[3];
		PRICES[0]=8.9;
	   PRICES[1]=865.00;
	   PRICES[2]=99.66;
	   
	   
	   System.out.println(Arrays.toString(PRICES));
	   PRICES[0]=81.01;
	   
	   System.out.println(Arrays.toString(PRICES));
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		
}
}