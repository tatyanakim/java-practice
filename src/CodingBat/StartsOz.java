package CodingBat;
import java.util.*;
public class StartsOz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a=3;
	int b=2;
	int c=1;
	ArrayList<Integer>nums=new ArrayList <>();
	nums.add(a);nums.add(b);nums.add(c);
	int temp=Integer.MIN_VALUE;

	for(int n:nums) {
		if(n>=temp) {
			temp=n;
		}
	}System.out.println(temp);
		
	//int max,  a sravnivaem s b,  assign to max,max sravnivaem s c
	
	
	
	int d=8;
	int e=13;
	
	if((Math.abs(10-d))>(Math.abs(10-e))) {
		System.out.println(e);
	}
	else if(Math.abs(10-d)==Math.abs(10-e)) {
		System.out.println(0);
	}else {
		System.out.println(d);
	}
		
	
		
		
		int[]arr2= {1,2,3,4};
		for(int each:arr2) {
			if(each==3) return;{
				
			}System.out.print(each+" ");
		}
		
		
		
		
		
	}
	
}
