package CodingBat;

import java.util.Arrays;

public class makeLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abaa";

		if(str.length()<=1&&!str.contains("a")&&!str.contains("b")){
		    str="";
		  }else if(!str.contains("a")&&!str.contains("b")){
		    str=str.substring(2);
		  }else if(str.charAt(0)=='a'&&str.charAt(1)=='b'){
		    str=str;
		  }else if(str.charAt(0)=='a'){
		    str=str.substring(0,1)+str.substring(2);
		    }else if(str.charAt(1)=='b'){
		      str=str.substring(1);
		    }System.out.println(str);
		
	
	
	int[]nums= {1};
	int[]n=new int[nums.length*2];
	n[n.length-1]=nums[nums.length-1];
	System.out.println(Arrays.toString(n));
	
	
	
	int []a= {1};
	int []b= {};
	int c=0;
	
	System.out.println(b.length);
	
	
	if(a.length==0&&b.length!=0){
		 c=0; 
	  
	}if(b.length==0&&a.length!=0){
	    b[b.length]=a[a.length];
	}if(a[0]==1) {
			c++;
	  }
	
		System.out.println(b.length);

	
	
	
	}
}


