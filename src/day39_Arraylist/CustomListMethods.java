package day39_Arraylist;
import java.util.*;
public class CustomListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList<Integer> nums=new ArrayList<>();
	nums.add(10);nums.add(10);nums.add(7);nums.add(8);nums.add(8);nums.add(3);nums.add(4);nums.add(8);
	printlist(nums);
	
	
	//#2
	
	List<Double> doubles=new ArrayList<>();
	doubles.add(10.00);doubles.add(5.0);doubles.add(7.6);doubles.add(8.0);doubles.add(68.0);
	sumList(doubles);
	System.out.println(sumList(doubles));
	}







public static void printlist(ArrayList <Integer> num) {
	for(Integer n:num) {
		System.out.print(n+" ");
	}
	System.out.println();
}




public static  double   sumList (List<Double> nums2) {
	double sum=0.0;
	for(Double d:nums2) {
		sum+=d;
		
	} return sum;

}



}
