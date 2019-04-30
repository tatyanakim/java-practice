package day13_ternary_strings_intro;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result;
		int score=78;
      /*  if(score>60) {
        	result="pass";
        	
        }
        else {
        	System.out.println("fail");
        }*/
        result=score>	60 ? "pass":"fail";
	   
        
        
        
        
        
        String quality="good";
        int rating=(quality.equals("good"))? 100:0;
        System.out.println(rating);
	    
    //////////////////////////////////////////////////    
      
        int pmHour=6;
        boolean rushHour=pmHour>=4 && pmHour<=7? true:false;
	     System.out.println(rushHour);
	     ////////////////////////////////////////////////////
	     
	     
	     String result1=rushHour==true?"yes":"no";
	      System.out.println(result1);
	//////////////////////////////////////////////////////////
	int amHour=8;
	String amRushHour=amHour>=6&&amHour<=9?"yes":"no";
	System.out.println(amRushHour);
	
	
	
	
	
	
	}

}
