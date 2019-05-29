package day52_Inheritance;

public class FinalVariables {
	
final int ROADSTER_MAX_RANGE=610;	
public final int MODEL_3_MAX_SPEED	;
public final int MODEL_X_PASSENGERS;
public final String JAN="January";
public static final String COMPANY_NAME="Cybertek";
public static final String ADMIN_USERNAME;

static {
	ADMIN_USERNAME="admin.@gmail.com";
}

	//can assign thru the variable
public FinalVariables(int max) {
	MODEL_3_MAX_SPEED=max;
}
public FinalVariables() {
	MODEL_3_MAX_SPEED=180;
}
{//init block
MODEL_X_PASSENGERS=7;
}


public static void main(String []args) {
	
	final int MAX_PASSENGERS_COUNT=5;
	//MAX_PASSENGERS_COUNT=10;
	
    FinalVariables var=new FinalVariables();
	System.out.println( var.ROADSTER_MAX_RANGE);
	System.out.println();
	System.out.println(Integer.MAX_VALUE);
	System.out.println(FinalVariables.COMPANY_NAME);
	System.out.println(FinalVariables.ADMIN_USERNAME);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


















}
