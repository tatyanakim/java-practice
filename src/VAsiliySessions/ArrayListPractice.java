package VAsiliySessions;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] nums=new int[14];
	nums[0]=23;
	System.out.println(Arrays.toString(nums));
	ArrayList<Integer>nums2=new ArrayList<>();
	
	nums2.add(23);
	nums2.add(100);
	nums2.add(125);
	nums2.add(600);
	nums2.add(2, 65);
	System.out.println(nums2);
  System.out.println("How many elements?: "+nums2.size());
	
	
	
  
  
  
  int []arr= {7,2,3};//2,3,1
  int []ar2=new int[arr.length];
  for (int j=1;j<arr.length;j++) {
	  ar2[j-1]=arr[j];
	    if(j==ar2.length-1) {
	    	ar2[ar2.length-1]=arr[0];
	    }
	
	 
  } 
	System.out.println(Arrays.toString(ar2));
	
	}
}
