package day14_string_methods;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String email="test@gmail.com";
		System.out.println(email.contains("@"));
	
	
	
	
	    String list ="potatoes,apples,tomatoes,eggs,milk";
	    System.out.println(list.contains("apples"));
	
	    boolean hasEggs=list.contains("eggs");
	    
	    System.out.println(hasEggs);
	    
	    
	  
	    email="name@yahoo.com";
	    if(email.contains("yahoo")) {
	    	System.out.println("Its yahoo email");
	    }else if (email.contains("gmail")) {
	    	System.out.println("Gmail account");
	    }else if(email.contains("hotmail")) {
	    	System.out.println("its hotmail");
	    }
	    
	    String etsyTitle="Wooden spoon | Etsy";
	    if(etsyTitle.contains("|")) {
	    	System.out.println("Pipe is there");
	    }else {
	    	System.out.println("Pipe is not detected");
	    	
	    	 }
	    String myName="Tatyana";
	    if(myName.contains("a")|| myName.contains("e")){
	    		System.out.println("a or e is there");
	}else {
		System.out.println("not there");
	}
	    
	   String str= "java" ;
	   str.indexOf("j");
	   str.indexOf("v");
	   str.indexOf("a");
	    
	    
	}
}
