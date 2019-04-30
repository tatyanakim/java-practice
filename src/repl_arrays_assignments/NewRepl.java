package repl_arrays_assignments;


public class NewRepl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//152 print out non dublicates
	int []	nums= {2, 5, 5, 6, 3, 6, 9, 34, 3};
   
 //Arrays.sort(nums);
	 int count = 0; 
	  for(int i = 0; i<nums.length; i++){
	    for(int j= 0; j<nums.length; j++){
	    if(nums[i]==nums[j]){
	      count++;
	    //  System.out.print(count);
	  }
	  
	    }
	  if (count==1) {//budet 1 kogda on sam s soboi sravnivaet ili count=2 kogda sam s soboi plus s dublicatom 
	       System.out.println(nums[i]);
	      }
	      count = 0;
	    
	  }
	  
	
	
	  
	  
	  
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	 
	  





	
	

	
	

	
	
	
	
	
	}
	

	
	
	


