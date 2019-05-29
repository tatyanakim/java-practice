package OCA_quizes;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	     
	     /*  What's the result of the following code fragments?
	     /                            0         1
	        int[][] arr=new int[][] { {1,2}, {3,4} };
	                arr[1] = arr[0];
	           
	            System.out.println(arr[0]);
	            
	            A. Compile Error                             B. [ 1, 2 ]
	            C. [ 3, 4 ]                                  C. hashcodes   <=(correct)
	            */
	             
	              
	       //Convert to String
	     
	    
	        
	        
	    
	    
	    
	     
	     
	   /*  2. which one of the following will give compile error?
	     //[index num of single dimensional array] [index num of elements in dimensional array]
	       
	        A. int[][] arr=new int[2][];
	        B. double[][] arr=new double[][] { {1,2}, {3,4} };
	        C. long[][] arr=new long[2][] { {1,2}, {3,4} };        <=(compile error)
	        D. int[][] arr ={ {'A', 'B'}, {'C' , 'D' } };
	            
	     
	    
	    
	    
	    
	    
	     *
	     *
	     *
	     */
	        
	    
	     
	    
	    
	     
	    // 3. what's the result of the following code fragment?
	                int[][] arr= { {1,2,3}, {3,4} };
	            
	                for(int i=0; i<2; i++) {// i=0,i=1;
	               
	            	for(int j=0; j<2; j++) { //j=0; j=1;
	                    System.out.println(arr[i][j]+" ");//[0][0] [0][1]   [1][0] [1][1]
	                }
	            }
	            
	          //  A.  1 2 3 3 4                             B. 1 2 3 4  <=(correct)
	          //  C.  1 2 3                                 D. Throws an Exception
	           // E. Compile Error
	     
	    
	     
	    
	    
	        
	    
	    
	    /*
	     byte=short=int=long=float=double
	      4. Which Three lines fail to compile?
	            1   int ivar = 100;
	            2   double dvar = 123;
	            3   float fvar = 200; 
	            4       ivar = fvar;   error  
	            5       fvar = ivar;   compile
	            6       dvar = fvar;   compile
	            7       fvar = dvar;   error
	            8       dvar = ivar;   compile
	            9       ivar = dvar;   error
	            
	        A. line 3, line 5, line 8                        B. line 4, line 7, line 9 (correct)
	        C. line 5, line 6, line 9                        D. line 4, line 5, line 8
	     
	     */
	    
	        
	    
	    
	    /*
	     5. Which code fragment, when inserted at line 3, enables the code to print 10:20?
	            public static void main(String[] args) {
	            //size has to be 2,single dim array
	                 line 3 **
	                 arr[0]=10;
	                 arr[1]=20;
	                 System.out.println(arr[0]+" "+ arr[1]); 
	            }
	            
	            A. int arr[2] ;                           B. int[] arr n = new int[2];
	            C. int[] arr;     arr = int[2];           D. int arr[] = new int[2];<=(correct)
	 
	     
	     */
	    
	    
	    
	    
	     /*
	            6.  What's the result?
	            public static void main(String[] args) {
	        
	                    System.out.println("Result A"+0+1);
	                    System.out.println("Result B"+(1)+(2));
	                    
	                }
	        A. ResultA01     ResultB12 <=(correct)                    B. ResultA01     ResultB3
	        C. ResultA1      ResultB3                      C. ResultA1      ResultB12
	      
	      */
	    
	        
	    
	    
	    
	      /*
	                7.  What's the result?
	                
	                public static void main(String[] args) {
	        
	                        System.out.println("5 + 2 = "+3+4);
	                        System.out.println("5 + 2 = "+(3+4));
	                        
	                    }
	            
(correct)=>	   A. 5 + 2 = 34     5 + 2 = 7            B. 5 + 2 = 34    5 + 2 =34
	            C. 7 = 7        7 + 7                  D. 5 + 2 = 3 + 4     5 + 2 = 7
	       
	       
	       */
	    
	    
	    
	    
	      
	       /*
	          8. What's the result?
	          
	            public static void main(String[] args) {
	                    String str = " ";
	                        str.trim();
	                    System.out.println(str.equals("") +"   "+str.isEmpty());    
	                }
	                
	           A. false     true                               B. true    true
	           C. false     false  <=(correct)                 D. true    false
	     
	     
	       */
	    
	        
	    
	    
	        
	        /*
	            9. what's the result ?
	                    public static void main(String[] args) {
	                            int[][] arr=  { {1,2}, {3,4} };
	                            for(int i=arr.length-1; i>=0; i-- ) {
	                                for(int j=0; j<arr.length; j++) {
	                                    System.out.println(arr[i][j]+" ");
	                                }
	                            }
	                        }
	                        
	            A.  3 4 1 2  <=(correct)            B. 1 2 3 4
	            C.  4 3 2 1                         D. 2 1 3 4
	            
	         
	         */
	    
	    
	    
	        
	        /*
	             10. Which statement is true about Java byte code?
	                  A.  it can run on any platform.
	            
	                  B. it can run on any platform only if it was compiled for that platform.
	            
	   (correct)=>   C. It can run on any platform that has the Java Runtime Environment.
	            
	                  D. It can run on any platform that has a Java compiler.
	                  
	         
	         */
	
	
	
	
	
	
	
	}

}
