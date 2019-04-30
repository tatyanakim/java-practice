package repl_arrays_assignments;

import java.util.Arrays;
import java.util.Scanner;
public class ReplArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//1 Zobie attack
		    /*  Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
				Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
				Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
				Day 3 [0, 0, 0, 0, 0, 0, 0, 0]*/
	      
	      
		int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1 };
		  for(int i=0;i<inhabitants.length;i++) {
			  
	/* while(inhabitants[i]>0) {
		 System.out.println(Arrays.toString(inhabitants));
	       
		   if(inhabitants[i]%2==0) {
	    	   inhabitants[i]=inhabitants[i]/2;
	       }else if(inhabitants[i]%2!=0) {
	    	   inhabitants[i]=(inhabitants[i]-1)/2;
	       }else if(inhabitants[i]==0) {
	    	   inhabitants[i]=0;
	       } count++;
	       
	       
		  
	 }*/
			  
		  }	  
			
			  
			  
			  
			  //2 BINARY
			      //         7  6  5  4  3 2 1 ,0
		/*  int count=0;
			    int decimal=3;           // 
			  int[]binary= new int[8] ;
			  binary[0]=128;
			  binary[1]=64;
			  binary[2]=32;
			  binary[3]=16;
			  binary[4]=8;
			  binary[3]=4;
			  binary[2]=2;
			  binary[1]=1;
			  for(int n=binary.length-1;n>=0;n--) {
				  
			  if(decimal>0) {
			decimal=decimal-binary[n];
			  count++;
			  
			  
			  
			  }
			  
			  System.out.println(count);*/
			  
			  
			
			  
			  //3 Print first 2 elements   done
		/*  Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			int[] num = new int[size];
			for(int i =0; i < size; i++) {
				num[i] = scan.nextInt();
			}
			 int[] temp=new int[2];
			//  int[]nums= {1,3,5};
			 int count=0;
			 
			  for(int i=0;i<size-1;i++) {
				  
					if(num.length==1) {
						System.out.println(Arrays.toString(num));
						System.exit(0);
					}else {
				  
				temp[count]=num[i];
				  count++;
					
				  
					}
			  }
			  System.out.print(Arrays.toString(temp));*/
				
			  
			  
			  
		  Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		  
		    
		   
		    int[] nums = new int[size*2];
		    int count=nums.length-1;
				for(int i =0; i < nums.length; i++) {
					nums[i] = scan.nextInt();
				nums[count]=nums[i];
				count++;
				
				
				
				
				}System.out.println(Arrays.toString(nums));
			  
			  
			  
			
			  
			  
			  
		  
	
	}
}
