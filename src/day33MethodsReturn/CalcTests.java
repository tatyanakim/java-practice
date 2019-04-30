package day33MethodsReturn;


public class CalcTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println( Calculator2.add2(3,1));
System.out.println( Calculator2.divide(3,1));
System.out.println( Calculator2.minus(3,1));
System.out.println( Calculator2.multiply(3,1));	
	
	
	int addResult=Calculator2.add2(21, 41);
     double mResult=Calculator2.multiply(21, 41);
     double miResult=Calculator2.minus(21, 41);
	double dResult=Calculator2.divide(21, 41);
	
	
	System.out.println(addResult);
	System.out.println(mResult);
	System.out.println(miResult);
	System.out.println(dResult);
	
	
	
	double a=10.0, b=5.0;
	double myResult=Calculator2.minus(a,b);
	System.out.println(myResult);
	
	
	double[] dNums= {2.0,4.0};
	double result2=Calculator2.multiply(dNums[0], dNums[1]);
	System.out.println(result2);
	
	
	if(Calculator2.add2(10,16)==26) {
		System.out.println("Add2 unit test passed");
	}else{
		System.out.println("Failed");
	}
	
	}

}
