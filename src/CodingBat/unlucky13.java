package CodingBat;
import java .util.ArrayList;
public class unlucky13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
//	int []nums={1,2,2,3};
	//int sum=0;
	
//	for(int i=0;i<nums.length;i++) {
		
	/*	if(nums[i]==13&&i==nums.length-1) {
			sum+=0;
			break;
		}
		else if(nums[i]==13&&i!=nums.length-1) {
			nums[i]=0;
			nums[i+1]=0;
		}
		else {
			sum+=nums[i];
		}
	}System.out.println(sum);*/
	
	
	
	int []num= {};
	boolean b=false;
	if(num.length==0) {
		  b=true;
		 
	  }
	  for(int i=0;i<num.length;i++) {
		  
		  if(num[i]==1||num[i]==3) {
			  b=false;
			  break;
		  }else {
			  b=true;
		  }
	  }System.out.println(b);
	
	
	
	  
	  ArrayList<Integer> ns=new ArrayList<>();
	  int t=4;
	 
	 // ns.add(4);
	 // ns.add(3);
	  //ns.add();
	  
	  
	  for (int j=0;j<ns.size();j++) {
		  if(ns.get(j)==t) {
			  ns.remove(j);
			 
		  }
	  }for (int j=0;j<ns.size();j++) {
			  if(ns.get(j)==t) {
				  ns.remove(j);
				 
			  }
	  }System.out.println(ns);
	 
	  
	  
	  
	
	}
	
	}
	

	
	
	


