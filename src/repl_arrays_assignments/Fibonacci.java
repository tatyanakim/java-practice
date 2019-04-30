package repl_arrays_assignments;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144     Fibonachi
	// input= index output =fibonachi
	    int fibn=1;
		int num=6;                                             //0 1 1 2 3 5 8 13 
		int [] arr= new int [num];//{0,1,2,3,4,5,6,7,8,9};
	                                // index   6
	            //6
	
	
		for (int  i=0;i<arr.length;i++) {
	      
			
		
			System.out.println(fibn+i+1);
	
	
	
	
	
	
		}
	
		
		
		
		
		
		
		
		
		
		
		//done
		
		
		
		
		String new2 = " ";
        int counter=0;
                String str2 = "AAABBBBCCDD";
                for (int i = 0; i < str2.length(); i++) {
                    if (str2.charAt(i)==(new2.charAt(counter))) {
                        
                        
                    } else {
                        new2 += str2.substring(i, i + 1);
                        counter++;
                    }
                } 
                System.out.println(new2);
        
     //   done
	String str="apple"; //"jav"
	String s="";
	String letter="";
   
	for(int k=0;k<str.length();k++) {
	letter=str.substring(k,k+1);
		if(!s.contains(letter)) {
			s+=letter;
		}
		}
		System.out.println(s);	
		
		
		
		
		//
	
		String m="";
		String w=" ";
		String main="hello,hello";
		String coverMe="o";
		 if(main.contains(coverMe)){
		      //w="["+coverMe+"]";
		  m=main.replace(coverMe,"["+coverMe+"]");
		  System.out.println(m);
		 }else {
			 m="["+main+"]";
			  System.out.println(m);
		 }
		
		   
          String m1="";
          
          String s1 = "123456789";
			String s2 = "abcde";
		String extra="";
		String l="";
		String sh="";
			if(s1.length()>s2.length()) {
			
				l=s1;
				sh=s2;
				
				String[] ar1=l.split("");
				String[] ar2=sh.split("");
				for(int j=0;j<ar1.length;j++) {
					 m1=ar1[j]+ar2[j];
						System.out.print(m1);
						
				}	
			}else if(s1.length()<s2.length()){
				sh=s1;
			    l=s2;
			    String[] ar1=sh.split("");
				String[] ar2=l.split("");
				for(int j=0;j<ar2.length;j++) {
					 m1=ar2[j]+ar1[j];
						System.out.print(m1);
						
				}	
			
			
			
			
			
			}
			
			
			
			
			
		
		
		
			}
		
		}	
		
			
		
		
	
	
