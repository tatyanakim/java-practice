package CodingBat;
import java.util.Arrays;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
     int []	nums= {1,2,3};
	int j=nums[0];
	nums[0]=nums[nums.length-1];
	
	nums[nums.length-1]=j;
	
	System.out.println(Arrays.toString(nums));
	
	
	int[]a= {1,2,3};
	int[]b= {4,5,6};
	int[]c=new int[2];
	c[0]=a[1];
	c[1]=b[1];
	System.out.println(Arrays.toString(c));
	
	
	
	int[] ns= {4,0};
	boolean bo=false;
	for(int n:ns) {
		if(n==2||n==3) {
			bo=false;
			break;
		}else {
			bo=true;
			}
		}System.out.println(bo);
	
	
	
		
		int[] numbers= {1,2,1};
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==2&&numbers[i+1]==3) {
				numbers[i+1]=0;
			}
		}System.out.println(Arrays.toString(numbers));
		
		
		
		
		
	
	
	
	
	
	}
	
	
	
	}


