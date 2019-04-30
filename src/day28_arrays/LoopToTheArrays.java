package day28_arrays;

import java.util.Arrays;

public class LoopToTheArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String[][] pizzas= {
			{"pineapple", "pepperoni"},//array 1
			{"anchovies","mushroom","olives"},//array2
			{"chicken","tomatoes","jalapenos","onion"},//array3
			{"green peppers","zuccini","brocolli","spinach","shrimp"}};//array4
			
	
	
	
	System.out.println(Arrays.deepToString(pizzas[0]));
	
	//for each loop
	for(String[] pizza:pizzas) {
		System.out.print(pizza.length+"-"); //dlinna kajdogo arraya
		System.out.println(Arrays.deepToString(pizza));
	
	}
	System.out.println("+++++++++++++++++++");
	//for loop
	for(int i=0;i<pizzas.length;i++) {
		System.out.println(Arrays.toString(pizzas[i]));
	}
	
	for(String topping:pizzas[2]) {//entering speific array for its elements
		System.out.println(topping);
	}
	
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	
	int[][]students= {{4,5,6},
			          {2,5,7},
			          {23,55,3,12}
			          };
	//Print all the numbers of all arrays
	//outer loop will take each group;
	//inner loop will take each vALUE/studentsID
	for(int[]group: students) {//accessing all arrays
		for(int studentId: group) {//accessing the values in each array
	
		System.out.print(studentId+", ");
		}
	
	System.out.println();
	}
	
	
	
	
	int[][]nums= {
			{10,20},                      //0
			{20,30,40,50},               //1
			
			{100,200,400},              //2
			{555,333,111,444,666,78},   //3
	
	};
	//Print all the nums from all arrays thru loops
	for(int i=0;i<nums.length;i++) { 
		for(int j=0;j<nums[i].length;j++) {//going inside the array one by one
			System.out.print(nums[i][j]+" ");
		}System.out.println();
	}
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


