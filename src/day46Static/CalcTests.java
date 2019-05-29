package day46Static;

public class CalcTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	double result=Calculator.plus(55, 7);
	System.out.println("result: "+result);
	
	
	
	result=Calculator.minus(44, 14);
	System.out.println("result of minus: "+result);
	
	
	
	Calculator c= new Calculator();
	System.out.println(c.multiply(4, 2));
	
	
	
	//static=calling directly from the class name,not depending on the object
	int i=Integer.parseInt("33");
	
	Character.isAlphabetic(i);
	Character.isDigit('5');
	
	//system-class name/out-variable/println-method
	System.out.println();
	
	
	
	
	
	
	}

}
