package assignments;
import java.util.*;
public class ReplAddSumOfPositiveNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> res=new ArrayList<>();
    res.add(4);res.add(-6);res.add(3);res.add(-8);res.add(0);res.add(4);res.add(3);
	
	System.out.println(appendPosSum(res));
	}



 
// (4,-6,3,-8,0,4,3),  (4,3,4,3,14)

public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
	ArrayList<Integer> posNums=new ArrayList<>();
	int sum=0;
	for(int i=0;i<nums.size();i++) {
		if(nums.get(i)>0) {
			posNums.add(nums.get(i));
		    sum+=nums.get(i);
			
		}
		
	}posNums.add(sum);
	return posNums;
}













}
