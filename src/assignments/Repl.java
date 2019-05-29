package assignments;

import java.util.Arrays;

public class Repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[]max= {1,3,45,5};
    int temp=0;
	
   for(int m:max) {
	   if (m>=temp) {
		   temp=m;
	   }
   }System.out.println(temp);
	
	
	
	
	
	
//
  /* System.out.print(
     lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
     );
     
    System.out.print(
     lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
     );
     
    System.out.print(
     lameDb("1tst#2bla#3foo","delete","1","")+"\n"
     );
     
      System.out.print(
     lameDb("1tst#2bla#3foo","none","1","")+"\n"
     );
   
 }*/
   String db="1test#2bla#3foo";
   String op="delete";
   String id="3";
   String data="aaa";
   String result="";
   if(op.equals("add")) {
	   result=db+"#"+id+""+data;
	   
       	
	   }
     
if(op.equals("edit")) {
	  result=db.substring(0,db.indexOf("#"))+"#"+id+""+data+"#"+db.substring(db.lastIndexOf("#"));
   
	System.out.println(result);
	
   }if(op.equals("delete")&&id.equals("1")){
	result=db.substring(db.indexOf("#"));     
		System.out.println(result);
	}else if(op.equals("delete")&&id.equals("2")){
	result=db.substring(0,db.indexOf("#"))+""+db.substring(db.lastIndexOf("#")) ;     
		System.out.println(result);
	}else if(op.equals("delete")&&id.equals("3")){
	result=db.substring(db.lastIndexOf("#"));     
		System.out.println(result);
	}
	
	
   
   
   
   if(op.contentEquals("none")) {
		result=db;
		System.out.println(result);
	}
	
   
    String s1= ("1");
    String s2= ("abc");
     
    	 int length=Math.max(s1.length(), s2.length());
       System.out.println(length);
  
    	 for(int i=0;i<length;i++) {
    		 if(i<s1.length()) 
    			
    		
    			 System.out.print(s1.charAt(i));
    			 if(i<s2.length()) 
    				 System.out.print(s2.charAt(i));
    			 }
    		 
	
	
	//178 done
	
	
    int[]a= {1,2,3};
     int[] b= {4,5,6};
     int z=0;
    	// returns [1,2,3,4,5,6]
       int[]together=new int[a.length+b.length];
       for(int s=0;s<a.length;s++) {
    	   together[z]=a[s];
    	   
       
        z++;
       }
      
	    for(int w=0;w<b.length;w++) {
	    	together[z]=b[w];
	    
	        z++;
	    }
	    System.out.println(Arrays.toString(together));
	
	
	//179 done
	    
	    String nw=" ";
	    String rev="foo";
	    for(int k=rev.length()-1;k>=0;k--) {
	    	nw+=rev.charAt(k);
	    }
	System.out.println(nw);
	
	    
	    
	    
	    String str="javaisjava";
	//indexOf gives us first index of "Java",which is=0;
	int first  =  str.indexOf("java");
	//
	System.out.println(first);
	// lastIndexOf gives us last index of 2nd word "Java" it first letter
	int last=str.lastIndexOf("java");
	System.out.println(last);
	//no find med= str rejem na (0 +4(java),6 )  
	String med=str.substring(first+4,last);
	System.out.println(med);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
    	 
    	
	
   
    	

	}
	
