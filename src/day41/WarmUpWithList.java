package day41;
import java.util.*;
import java.util.List;

public class WarmUpWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> doubles=new ArrayList<>();
		doubles.add(2);doubles.add(3);
		System.out.println(DoubleTheList(doubles));
		
		
		
		
	}

public static List <Integer> DoubleTheList(List<Integer> nums){
	  
	
	for(int i=0;i<nums.size();i++) {
		nums.set(i,nums.get(i)*2);//set like  switch 
		
	}
	return nums;
	
	
}





}
