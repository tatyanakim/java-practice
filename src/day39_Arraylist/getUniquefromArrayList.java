package day39_Arraylist;
import java.util.*;
import java.util.Scanner;
public class getUniquefromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print just one example of each element Distinct
	Scanner scan=new Scanner(System.in);
	List<Integer> nums=new ArrayList<>();//declare empty ArrayList
	nums.add(10);nums.add(10);nums.add(7);nums.add(8);nums.add(8);nums.add(3);nums.add(4);nums.add(8);
    List<Integer> unique=new ArrayList<>();
    for(Integer num:nums) {
    	if(!unique.contains(num)) {
    		unique.add(num);
    		
    	}
    }System.out.println(unique);
    
    
    
    //print the not pairs only uniques
    List<Integer> unique2=new ArrayList<>();
	
		for(int i=0;i<nums.size();i++) {
			int count=0;
			Integer value=nums.get(i);//s chem sravnivat
	      for(int j=0;j<nums.size();j++) {
	    	  if(value==nums.get(j)&&i!=j) {
	    		 count++; 
	    		 break;
	    		  
	    	  }
	    	  }if(count==0) {
	    		  unique2.add(value);//make it as []
	    		 // System.out.print(value+" ");
	    }
	      
		} System.out.println(unique2);
	
	
		
}
}