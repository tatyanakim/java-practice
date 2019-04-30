package MurodilSessions;
import java.util.Arrays;
public class ArrayRemoveOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//remove pairs
		
		
	
	int[] arr= {4,5,1,5,10};
	int remove=5;
	System.out.println(Arrays.toString(removeFromArray(arr,remove)));
	
	
	
	
	}
	public static int[] removeFromArray(int[] nums, int target) {
		// find out how many targets are in nums
		int counter = 0;
		// loop and using if condition, increase counter for each match
		for (int n : nums) {
			if (n == target) {
				counter++;
			}
		}
		// declare new empty array with size that
		// does not include target count
		int[] newArray = new int[nums.length - counter];
		// loop nums one more time and add all values that are not target
		int idx = 0;
		for (int n : nums) {
			if (n != target) { // (!(n == target))
				newArray[idx] = n;
				idx++; // add 1 so that it moves to next index
			}
		}
		return newArray;
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	


