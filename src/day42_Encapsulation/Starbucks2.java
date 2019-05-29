package day42_Encapsulation;

public class Starbucks2 {

public static void main(String[]args) {
	

//declare an array that can store 2 coffee objects
	//int [] nums=new int[2]


WarmUpCoffee[] coffeeArray=new WarmUpCoffee[2];//creating an array of 2 objects

coffeeArray[0]=new WarmUpCoffee();//putting an object in a first arrays

coffeeArray[0].setCofInfo("Mocha", "Tall", 5.25, 170);//
coffeeArray[0].getCoffeeInfo();


//second variant
WarmUpCoffee late=new WarmUpCoffee();//assign name first 
late.setCofInfo("CAfe latte","Grande",3.68,190);
coffeeArray[1]=late;//assign name to arrays position


//print data from object in index 1
coffeeArray[1].getCoffeeInfo();




}





}
