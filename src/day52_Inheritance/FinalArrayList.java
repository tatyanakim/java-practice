package day52_Inheritance;
import java.util.ArrayList;
public class FinalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	final ArrayList<String> COLORS=new ArrayList<>();
	COLORS.add("Orange");
	COLORS.add("Grey");
	COLORS.add("White");
	COLORS.add("Blue");
	System.out.println(COLORS);
	
	COLORS.add("Black");
	System.out.println(COLORS);
//	COLORS=new ArrayList<>(); not gonna compile cuz ArrayList is final
	System.out.println(COLORS);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
