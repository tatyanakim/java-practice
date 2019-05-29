package CodingBat;
import java.util.Arrays;
public class MakeMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[]nums= {8, 6, 7, 5, 3, 0, 9};
	int[]ns=new int[3];
	
	int count=0;
	for(int i=(nums.length-1)/2-1;i<=(nums.length-1)/2+1;i++) {
		ns[count]=nums[i];
		System.out.println(ns[count]);
		count++;
	}
		System.out.println(Arrays.toString(ns));	
	
	
	
	
	int[]numbers= {1,1,1};
	boolean b=false;
	for(int j=0;j<numbers.length-1;j++) {
		if(numbers[j]==1&&numbers[j+1]==3) {
		if(j==0||j==1||j==numbers.length-1||j==numbers.length-2) {
		b=true;
		}
	else {
			b=false;
		}
		}
	}System.out.println(b);
	
	
	
	
	
	
	int [] arr= {2,2,3};
	int[]temp=new int[2];
	temp[0]=arr[0];
	temp[1]=arr[arr.length-1];
	int[]ar=new int[3];
	int max=0;
	
	for(int a:temp) {
		if(a>max) {
			
			max=a;
			}
		ar[0]=max;
		ar[1]=max;
		ar[2]=max;
	}System.out.println(Arrays.toString(ar));
	
	
	
	int []n= {1};
	int []n1=new int[2];
	n1[0]=n[0];
	n1[n1.length-1]=n[n.length-1];
	
	System.out.println(Arrays.toString(n1));
	
	
	
	
	}
	
	
	
	
	
	
	
	
	

}
