package day34_methods06;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class GetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.out.println(Arrays.toString(getArray()));
	System.out.println(Arrays.toString(getRandomArray(6)));
	
	
	
	
	 printWords("red","blue","grey");
	 String[] myPets= {"cat","dog","bird"};
	 printWords(myPets);
	System.out.println("sum of nums is : "+sum(11,34,565));
	System.out.println(sum(87564, 545, 879844, 55,33232,54545432,2344,2345,533,1234,523));
	int budget = 200;
	if(sum(10, 45, 110, 30) <= budget) {
		System.out.println("Within budget");
	}else {
		System.out.println("Broke");
	}
	int total=sum(234,43,567,12,34,5);
	System.out.println("total : "+total);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	public static int[] getArray() {
		
		int[] rArr= {1,2,4,5,6};
		return rArr;
	
	 
		  
	
	
	
	
	}
	
	public static int[] getRandomArray (int size) {
		Random ran =new Random();
	int[]arr=new int[size];
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<size;i++) {
	
		
		arr[i]=ran.nextInt(101);
		
	}return arr;
	 
	}
	
	
	public static void printWords(String...words) {
		//handle it like an array
		for(String w: words) {
			System.out.println(w);
		}
	}
                  //Varargs
public static int sum(int... nums) {
	int sum=0;
	for(int n:nums) {
		sum+=n;
		
	}return sum;
	
	
}



}


