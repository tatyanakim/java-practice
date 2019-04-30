package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime=true;
		if(isBreakTime==true) {
			System.out.println("Break till 8.35");
		}else {
			System.out.println("Learn Java");
		}
	
	////////////SECOND VERSION
		
		boolean isBreakTime2=true;
		if(isBreakTime2) {
			System.out.println("Break till 8.35");
		}else {
			System.out.println("Learn Java");
		}
	boolean classTime=true;
	if(classTime) {
		System.out.println("Study");
		System.out.println("Stay on break");
	    System.out.println("Java");
	}else
		System.out.println("Relax");
	
	
	boolean qualify=false;
	if(qualify!=true) {//== false
		System.out.println("Send notification");
	}
		
	
	boolean isNiceWeather=true;
	
	if(!isNiceWeather) {//true=false
		System.out.println("Dont go out for running");
	}else {
		System.out.println("Lets go out");
	}
		
	
	
	//++++++++++++++++++++++++++++++++++++
	
	boolean found=false;
	if(!found) {
		System.out.println("True");
	}else {
		System.out.println("Error: nit found");
	}
	
	//++++++++++++++++++++++++++++++++++++
	double price=100.0;
	boolean b=price>200.0;//false
	boolean b2=!(price>200.0);//true less than 200.0
	
	
	
	
	
	
	}

}
