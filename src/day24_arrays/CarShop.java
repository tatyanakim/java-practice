package day24_arrays;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		//++++++++++++DO NOT PRINT IF WORD DOESN START WITH M++++++++++++++++++
		
		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };

	/*	for (String c : cars) {
			if (!c.startsWith("M")) {
			
				continue;//do not print
			}
			System.out.println(c);

		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println( );

		
		
		
		
	
	//+++++++IF WORDS DOESNT CONTAIN "r"=DO NOT PRINT
		
		for (String b : cars) {
			if (!b.toLowerCase().contains("r")) {// case sensetive
				continue;//DO NOT PRINT
			}
			System.out.println(b);

		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println( );

		
		
		
		
		
//++++++++++++++++++IF WORDS DOESNT ENDS WITH "a"=DO NOT PRINT+++++++++++++++++++++++
		
		for (String d : cars) {
			if (!d.endsWith("a")) {// case sensetive
				continue;//DO NOT PRINT
			}
			System.out.println(d);

		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println( );

		
		
		
		
//++++++++++++++PRINT WORDS THAT ARE 5 OR MORE LETTERS ONLY++++++++++++++++++++++		
		
	  for(String f: cars) {
			if(f.length()>=5) {
			System.out.println(f);	
		}
		//SAME JUST WITH FOR LOOP+++++++++++++++++++++++++++++++
		for(int i=0;i<cars.length;i++) {
			String car=cars[i];
			if(car.length()>=5) {
				System.out.println(car);
				
			}
		}*/
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println( );

		
		
	//++++++++++++++PRINT BACKWARDS ARRAY++++++++++++++++++++++++	
		
		for(int e=cars.length-1;e>=0;e--) {
			System.out.print(cars[e]+", ");
		
		}System.out.println(" ");
		System.out.println( " ");

		
		
		
		
		
		//++++++++++++++CHANGE FIRST AND LAST ELEMENTS+++++++++++++++++++++++++
		
		
       
		 String tem=cars[0];//polojili BMW v tem
		 System.out.println(tem);
		cars[0]=cars[cars.length-1]; //v eto mesto polojili s posledniy element s konca
		cars[cars.length-1]=tem;// 
		System.out.println(cars[cars.length-1]);
		System.out.println(Arrays.deepToString(cars));
		
	
	

		
	
	
	
	}

}
