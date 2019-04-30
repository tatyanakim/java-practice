package day27_Arrays05;
import java .util.*;
import java.util.Arrays;

public class UtilityArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] languages= {"Zulu","Spanish","English","Polish","Uzbek"};
		int [] nums= {43,12,4,1,3,5};
		
		//To String Method-converts Array into a String format[]
		Arrays.toString(nums);//loops inside
 	System.out.println(Arrays.toString(nums));
	String str=Arrays.toString(nums);
	System.out.println(str);
	

	//Sort method from smaller to larger
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
	Arrays.sort(languages);
	System.out.println(Arrays.toString(languages));
	
	
	int[] nums2= {345,665,3333,11,3,0,66};
	//findest thr lowest and the largest
	Arrays.parallelSort(nums2);
	System.out.println(Arrays.toString(nums2));
	int lowest=nums2[0];
	int largest=nums2[nums2.length-1];
	System.out.println("Lowest nums: "+lowest);
	System.out.println("Largest nums: "+largest);
	
	
	
	//Binary search
	int[] numbers= {4,6,7,10,55};
	System.out.println(Arrays.binarySearch(numbers, 7));//indexOf siilar//2
	System.out.println(Arrays.binarySearch(numbers, 55));//4
	System.out.println(Arrays.binarySearch(numbers, 5));//-2
 
	int i=Arrays.binarySearch(numbers,10);
	System.out.println(i);
	
	
	int[] numbers2= {40,6,17,10,55};//not sorted!!!call sort method
	System.out.println(Arrays.binarySearch(numbers2,40));//search nums from 1 to 10
	//Arrays.binarySearch(a, froIndex,toIndex, key)
	
	
	

	
	
	}

}
