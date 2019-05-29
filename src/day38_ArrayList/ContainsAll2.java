package day38_ArrayList;
import java.util.*;
public class ContainsAll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Integer> nums1=new ArrayList<>();
	nums1.add(10);nums1.add(20);nums1.add(30);nums1.add(40);
	nums1.add(50);
	
	List<Integer> nums2=new ArrayList<>();
	nums2.add(20);nums2.add(10);nums2.add(40);nums2.add(30);
	nums2.add(50);
	//test if nums1has all nums2 values
	
	if(nums1.containsAll(nums2)) {
		System.out.println("Nums1 has all values of num2");
	}else {
		System.out.println("Does not have");
	}
	//nums2 was added 50
	System.out.println(nums2.containsAll(nums1));
	
	boolean b=nums1.containsAll(nums2)&&nums2.containsAll(nums1);
	
	System.out.println(b);
	
	
	
	
	List<String> planA=new ArrayList<>();
	planA.add("java");
	planA.add("replit");
	planA.add("ping pong");
	planA.add("food");
	planA.add("run");
	planA.add("sleep");
	//
	List<String> planB=new ArrayList<>();
	planB.add("food");
	planB.add("run");
	planB.add("sleep");
	planB.add("java");
	planB.add("ping pong");
	planB.add("repl it");
	
	if(planA.containsAll(planB) && planA.containsAll(planB)) {
		System.out.println("All lists from planA are in plan B ");
	}else {
		System.out.println("doesnt contains");
	}
	
	
	
	
	
	
	}

}
