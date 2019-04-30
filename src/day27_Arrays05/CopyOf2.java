package day27_Arrays05;
import java.util.*;
public class CopyOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//copy all the values from array
	int[] nums1= {34,56,23,1,55};
	int[]nums2=Arrays.copyOf(nums1, nums1.length+2);//adding extra spaces in array
	// copy only middle 3
	int[]nums3=Arrays.copyOfRange(nums1,1,4);
	System.out.println("Nums3: "+Arrays.toString(nums3));
	System.out.println(Arrays.toString(nums2));
	
	nums2[5]=100;
	nums2[6]=200;
	System.out.println(Arrays.toString(nums2));
	
	
	
	
	
	
	int[] newArr= {34,23,54,23};
	System.out.println("Length before: "+newArr.length);
	//added 5 extra indexes
	newArr=Arrays.copyOf(newArr, newArr.length+5);
	System.out.println("Length after: "+newArr.length);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
