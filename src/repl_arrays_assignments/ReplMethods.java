package repl_arrays_assignments;
import java.util.Arrays;
import java.util.Scanner;
public class ReplMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int n=2;
	int[]r={1,5,77,8,4,6} ;
	int[] new_r=new int[r.length+1];//5
	

	for(int i=0;i<new_r.length;i++) {
		
	  	if(i==new_r.length-1) {
	  		new_r[i]=n;
	  	}else {
	
	  	new_r[i]=r[i];
	  	
	}
	}System.out.println(Arrays.toString(new_r));
	
	
	
	
	
	//135 done
	int[] arr= {6, 2, 5, 3};
	int[]a=new int[arr.length];
	for(int i=0;i<a.length;i++) {
		if(i==a.length-1) {
			a[a.length-1]=arr[0];
		}else {
			a[i]=arr[i+1];
			
		}
	}System.out.println(Arrays.toString(a));
	
	
	
	//125 done
	
	int[]nums= {1,2,3,4};
	int[]num=new int[nums.length*2];
	for(int p=0;p<num.length;p++) {
		if(p==num.length-1) {
			num[num.length-1]=nums[nums.length-1];
		}else {
			num[p]=0;
		}
	}System.out.println(Arrays.toString(num));
	
	//126
	int[]outer= { 1, 2, 4, 6};
	int []inner= {2, 4};
	for(int j=0;j<inner.length;j++) {
		
	}
	
	
	//143                            121 sdelat!!!
/*  *****
	*   *
	*   *
	*   *
	*****    */

	
	for(int d=0;d<5;d++) {
		for(int p=0;p<=3;p++) {
			if(d==0||d==4)
			System.out.print("*");
		}
		System.out.println("*   ");
	}
	
	
	
	
	
	
	
	
	//136 
	
	int[][]ar =    {{1,2,3},
	                {4,5,6},
	                {9,8,9},
	                };
	
	
	
	
	
	
	
	
	
	//154 done
	
	int num2=1001;
	String[] nu=Integer.toString(num2).split("");
	int count=0;
		System.out.println(Arrays.toString(nu));
	String[] reversed = new String[nu.length];
  // System.out.println(Arrays.toString(reversed));
	for(int j=nu.length-1;j>=0;j--) {
		
     reversed[count]=nu[j];
     count++;
	}System.out.println(Arrays.toString(reversed));
	  if(Arrays.equals(nu, reversed)) {
		  System.out.println(true);
	  }else {
		  System.out.println(false);
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	  
	  
	
	



	

	
	
	
	}
	  
	  
	
	


