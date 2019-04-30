package day23KeepPracticing;

public class NestedLoopsAlphabetBackwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 for (int j = 1; j <= 5; j++) { for (int i = 1; i <= 10; i++) {
		  System.out.print(i + " "); }
		  
		 System.out.println();
		  
		  }
		 
		
		
		System.out.println("+++++++++++++++PRINT BACKWARDS++++++++++++++++++++");
		 
		  
	
		  
		  for (int i = 1; i <= 10; i++) { if(i%2==0) { for (char p = 'a'; p <= 'z';
		 p++) { System.out.print(p ); } }else { for (char p = 'z'; p >= 'a'; p--) {
		 System.out.print(p); }
		 
		 }System.out.println(); System.out.println("*******TRIANGLE*******");
		 

		for(int j=1;j<=10;j++) {

		for(int i1=1;i1<=j;i1++) {
		 System.out.print(i1+" ");
		 }
		 System.out.println();
		}

		/*for(int j=10; j>=1;j--) {

		// for(int i=j; i>=1;i--) {
		// System.out.print(i+" ");
		// }
		// System.out.println();
		// }

		for (char i2 = 'a'; i2 <= 'e'; i2++) {

			for (char ch = 'a'; ch <= 'e'; ch++) {
				 
				System.out.println(i2);
				System.out.print(ch);
                
			}
			
			}*/
			
			
			
		
		
		/*for (int j = 1; j <= 2; j++) {

				for (char ch2 = 'a'; ch2 <= 'e'; ch2++) {
					
					System.out.print(ch2);

				}
			
			System.out.println();
			System.out.println("&&&&&&&&&&&&&&&&&&&");
			}

		}*/

		  }
	}

}