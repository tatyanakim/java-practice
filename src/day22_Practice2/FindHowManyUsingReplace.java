package day22_Practice2;

public class FindHowManyUsingReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		/* String word="including webpages, images";
   //7
   int length1=word.length();
   word=word.replace("e","");
   int length2=word.length();
   
   int count=length1-length2;
   System.out.println(count);*/
	  
   
		int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = "dogdogcat";
	    
	    for(int i=0;i<word.length()-2;i++){
	      String cat=word.substring(i,i+3);
	      if(cat.equals("cat")){
	        countOfCats++;
	        
	      }
	    }
	    System.out.println(countOfCats);
	    
	    for(int i=0;i<word.length()-2;i++){
	      String dog=word.substring(i,i+3);
	      if(dog.equals("dog")){
	        countOfDogs++; 
	      }
	      
	      }System.out.println(countOfDogs);
	    
	   
	      
	      if(countOfDogs==countOfCats){
	        System.out.println("true");
	      
	      }else {
	        System.out.println("false");
	      
	      }
	    
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	}


