package day24_arrays;

public class DuckFarmDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] ducks = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5, 9 } };
		System.out.println(ducks.length);// 3 Length means groups
		System.out.println(ducks[0].length);// length of the first group
		System.out.println(ducks[0][4]);

		int nums[][] = new int[5][5];

		System.out.println("+++++++++++++++++++");
		for (char i = 'a'; i <= 'e'; i++) {

			for (char ch = 'a'; ch <= 'e'; ch++) {
				 
				System.out.println(i);
				System.out.print(ch);
                
			}
			
			}
			
			

		
		int i = 1;
		int j = 1;

		int n = 5;

		for (j = 1; j <=n; j++) {
			for (i = 1; i <= j; i++) {
				
			System.out.println("*");
			
			System.out.print("*");
			
			}
		
		}
		

	}

}
