package CodingBat;
import java.util.Arrays;
public class double23 {

	public static void main(String[]args) {

    
	int[]nums= {2,2};
	boolean b=false;
	String n=Arrays.toString(nums);
	System.out.println(n);
	if(nums.length<=1) {
		b=false;
	}
	if(n.contains("2, 2")||n.contains("3, 3")) {
		
		b=true;
		
	}else {
		b=false;
	}

System.out.println(b);





int[] a= {1,2};
int[] c= {3,4};
int sum=0;
int sum1=0;

sum=a[0]+a[1];
sum1=c[0]+c[1];

if(sum>sum1||sum==sum1) {
	System.out.println(Arrays.toString(a));
}
else {
	System.out.println(Arrays.toString(c));
}


int []ns= {};
int[] ns2=new int[2];
if(ns.length<2){
	 ns2=ns;
	 }else{
    for(int k=0;k<=1;k++) {
    	ns2[k]=ns[k];
    }
  }
System.out.println(Arrays.toString(ns2));














	}


}
