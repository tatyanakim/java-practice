package day24_arrays;
import java.util.Arrays;
public class SortArraysBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };

		System.out.println("Before sorting");
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(cars));
        System.out.println("Positions: "+Arrays.binarySearch(cars, "Ford"));
 //Arrays class is from java.util package 
    //    This class help us to work with arrays
     //Arrays.sort()- sorts values in ascending order
        // If we sort words to letters from A-Z
        //if numbers from lowest to highest
        
        
        
        System.out.println("++++++++++++++++++++++");

		int[] lotteryNum= {12,45,3,62,42,90};
		System.out.println(Arrays.toString(lotteryNum));
		 Arrays.sort(lotteryNum);//zasortiroval
	//	for(int i=lotteryNum.length-1;i>=0;i--) {
	//		System.out.println(lotteryNum[i]);
			
	//	}
		
	/*int index= Arrays.binarySearch(lotteryNum, 45);//works with sorted elements looking for positions of num /String
	 
	System.out.println("Position: "+index);
	
	
	int index2=Arrays.binarySearch(lotteryNum,5);
	System.out.println("index2:"+index2);*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
