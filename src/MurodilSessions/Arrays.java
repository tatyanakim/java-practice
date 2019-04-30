package MurodilSessions;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int []nums=new int [] {1,1,4,6,7,12};
	int []nums2=new int [] {1,4,6,7,3,12};
	

	isArraySorted(nums);
	isArraySorted(nums2);
	isArraySorted(new int [] {143,12,5});
	
	
	
	
	String word="Java";
	System.out.println(word.charAt(0)+word.charAt(3));
	
	
	
	
	
	
	
	}


		


//this method exepts arrays of ints
public static void isArraySorted(int[] nums) {
	boolean sorted=true;
	for(int i=0;i<nums.length-1;i++) {
	
		if(nums[i]>nums[i+1]) {
			sorted=false;
			break;//exit the loop
		}
	}
	System.out.println("Array nums is sorted?-"+sorted);
}
















}



















