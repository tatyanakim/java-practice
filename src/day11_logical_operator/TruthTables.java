package day11_logical_operator;

public class TruthTables {
	public static void main(String[] args) {
		System.out.println("####%TRUTH TABLE FOR && OPERATOR####");
		
		System.out.println("When true and true- result is "+(true && true));//true
		System.out.println("When true && false-result is "+(true&& false));//false
		System.out.println("When false && true- result is "+(false&& true));//false
		System.out.println("When false && false-result is "+(false&&false));//false
	
	   System.out.println();//add empty line            boolean
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
	  System.out.println("#####TRUTH TABLE FOR || OPERATOR#####");
	
	System.out.println("When true OR true- result is "+(true || true));//true
	System.out.println("When true OR false- result is "+(true|| false));//true
	System.out.println("When false and true- result is "+(false || true));//true
	System.out.println("When fasle and false- result is "+(false ||false));//false
	
	System.out.println();
	
	System.out.println("#######TRUTH TABLE FOR ! (NOT) OPERATOR#####");
	System.out.println("When !true - result is "+(!true));//false
	System.out.println("When !false- result is "+(!false));//true
	}

}
