package CodingBat;
import java.util.Arrays;
public class MaxTriple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int []nums= {1};
	     int max=0;
		int m=Math.max(nums[0], nums[(nums.length-1)/2]);
		
	    if(m>nums[nums.length-1]) {
	    	max=m;
	    }else {
	    	max=nums[nums.length-1];
	    }
	    System.out.println(max);
	
	
	
	  int[]a= {4,5};
	int[]b= {1,2,3};
	int[]c=new int[2];
	int count=0;
	if(a.length==0) {
		c[0]=b[0];
		c[1]=b[1];
	}
	else if(a.length>=1) {
	for(int i=0;i<2;i++) {
		if(i!=a.length) {
		c[i]=a[i];
		}else if(i==a.length){
			c[i]=b[count];
			count++;
		}
	}
	}System.out.println(Arrays.toString(c));
	
	
	
	
	int[]ns = {7,0,0};
	int[]ns1=new int[3];
	int co=0;
	ns1[ns1.length-1]=ns[0];
		for(int j=1;j<ns.length;j++) {
			
			ns1[co]=ns[j];
			co++;
			
			
		}
		System.out.println(Arrays.toString(ns1));
	
	
	int sum=0;
	int[]n= {1,2,1};
	if(n.length==0) {
		sum=0;
	}	else if(n.length==1) {
    	sum+=n[0];
    }
	else if (n.length>=2) {
		sum=n[0]+n[1];
		
	}
	System.out.println(sum);
	
	
	
	int[]numbers= {3,5};
	boolean boo=false;
	for(int nbs:numbers) {
		if(nbs==2||nbs==3) {
			boo=true;
			break;
		}else {
			boo=false;
		}
	}
	System.out.println(boo);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
