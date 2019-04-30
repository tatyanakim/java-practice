package day22_Practice2;

public class Substring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String word = "java";
		System.out.println(word.substring(0, 1));
		System.out.println(word.substring(1, 2));
		System.out.println(word.substring(2, 3));
		System.out.println(word.substring(3, 4));
		System.out.println();

		int i2 = 0;

		System.out.println(word.substring(i2, i2 + 1));
		i2++;
		System.out.println(word.substring(i2, i2 + 1));
		i2++;
		System.out.println(word.substring(i2, i2 + 1));
		System.out.println("**************************");

		for (int i = 0; i <= 3; i++) {
			// System.out.println(word.charAt(i));

			System.out.println(word.substring(i, i + 1));

		}

		System.out.println("+++++++++++++++REVERSE++++++++++");
		String word2 = "java";
		for (int n = 3; n >= 0; n--) {
			// System.out.println(word.charAt(n));
			String letter = word2.substring(n, n + 1);
			System.out.println(letter);
		}

		//word2.substring(2,3);

		int start = 1;
		int end = 5;
		String word3 = "UnitedStates";
		System.out.println(word3.substring(start, end));

		// ++++++PRINT LAST LETTER
		System.out.println(word3.substring(word2.length() - 1));

		// ++++++++++++HOW TO LOOK FOR A WORD IN A STRING++++++++++++++++*/
		
		
		 /*int count=0;
			for(int i=0;i<log.length()-5;i++){//pribavlyaem po odnomu
				
				String temp=log.substring(i,i+5);//virezali po 5 bukv lubih iz vsego
				if(temp.contentEquals("error")){//esli to chto virezali =error
					count++;//schitai
				}
			}
				System.out.println(count);*/
			

		/* String str = "abXYabc";
	
		    
		  int n = 3;
		    int count=0;
		    
		    for(int i=0;i<str.length()-n;i++){
		      
		    	
		    	String let=str.substring(i,i+n);
		   System.out.println(let);
		    	if(let.equals(str.substring(0,n))) {
		    	
		        count++;
		      }
		    }
		      if (count==2){
		        System.out.println("true"+count);
		      }else{
		        System.out.println("false" +count);
		      
		      }*/
		//input: 
		//output: myid
		/*String sentence="I wrote [236] lines of code today";
		int start=sentence.indexOf('[')+1;
		int end= sentence.indexOf(']');
		String codeCount=sentence.substring(start,end);
		System.out.println(codeCount);*/
		
		
		 String html ="<!DOCTYPE html><html><head><title>Test</title></head><body><div><a href=\"http://www.google.com\" id=\"linkid\">Clicki Here!</a></div></body></html>";
		  int start=0;
			int end=0;
	      if(!(html.contains("<html>"))){
			    System.out.println("Invalid input!");
			  }else{
			    String newhtml;
			    String newhtml2;
		  	 newhtml=html.replace("><","");
		  	 newhtml2=newhtml.replace("/","");
		   System.out.println(newhtml2);
			
		  	 start=newhtml2.indexOf("id=")+4; 
			// System.out.println(html.indexOf("id="));
			
		  	 end=newhtml2.lastIndexOf ("\"");     
			//System.out.println(html.indexOf ("id\">")+2);
		 System.out.println(newhtml2.substring(start,end));
			 // }

		
  }
		         
		/*String str = "xxbreadyy";
		
	    int count=0;
	    
	    for (int i=0;i<str.length()-4;i++){
	       
	    	 String let=str.substring(i,i+5);
	      
	     System.out.println(let);
	    	 if(let.equals("bread")){
	         count++;
	       }System.out.println(count);
	    }  
	if(count<2){
	           System.out.println("nothing");
	       
	}
	System.out.println("++++++++++++++++++++++++");
	String json2="{\"id\": 1944, \"firstName\": \"Cecil\", \"lastName\": \"Nacey\", \"role\": \"student-team-leader\"}\n" + 
			"";
	String json ="{\"id\": 1963, \"firstName\": \"Molly\",\"lastName\": \"Cossor\", \"role\": \"student-team-member\"}";
	String newjson=json.replace(" ","");
	int beginname=newjson.indexOf("firstName")+12;
	
	int endname=newjson.indexOf("lastName")-3;
	int beglast=newjson.indexOf("lastName")+11;
	int endlast=newjson.indexOf("role")-3;
	String namenew=newjson.substring(beginname,endname);
	String lastnew=newjson.substring(beglast,endlast);
	System.out.println("First name: "+namenew);
	System.out.println("Last name: "+lastnew);*/
	
	}

}     
	    
    




	      
	     
	     
	
	  
		  
		
	



