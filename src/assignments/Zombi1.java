package assignments;

import java.util.Arrays;

public class Zombi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		          int[]ar={3, 6, 0, 4, 3, 2, 7, 1};
		          
			         //  [3, 6, 0, 4, 3, 2, 7, 1]
		               //[1, 3, 0, 2, 1, 1, 3, 0]
		        	   //[0, 1, 0, 1, 0, 0, 1, 0]
	  		
		          Arrays.sort(ar);
		      	
		  		int	counter=0;
		  		int[] temp = new int[ar.length];
		  		do {
		  		
		  				counter=0;
		  			for (int i = 0; i < ar.length; i++) {

		  				
		  				if (ar[i] <= 1) {
		  					ar[i] = 0;

		  				} else if (ar[i] % 2 == 0) {
		  					ar[i] = (ar[i]) / 2;

		  				} else if (ar[i] % 2 != 0) {
		  					ar[i] = (ar[i] - 1) / 2;

		  				}
		  				counter+=ar[i];
		  			}
		  		
		  			System.out.println(Arrays.toString(ar));

		  		} while (counter>0);
	}
}