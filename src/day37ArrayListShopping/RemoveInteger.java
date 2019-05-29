package day37ArrayListShopping;
import java.util.ArrayList;
public class RemoveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	ArrayList<Integer> nums=new ArrayList<>(10);
	System.out.println(nums.size());
	
	System.out.println(nums.isEmpty());
	
	System.out.println(nums.size()==0);
	nums.add(6);
	nums.add(7);
	nums.add(5);
	nums.add(6);
	nums.add(3);
	nums.add(2);
	
	System.out.println(nums);
	nums.remove(5);// index
	System.out.println(nums);
	
	Integer n1=new Integer(5);
	Integer n2=Integer.valueOf(5);//num removed
	
	nums.remove(n1);
	nums.remove(new Integer(7));//num removed
	System.out.println(nums);
	
	
	
	}

}
