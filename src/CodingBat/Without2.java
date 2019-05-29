package CodingBat;

public class Without2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str="xxx";
	String s="";
	if(str.length()==0) {
		s="";
		
	}else if(str.substring(0,2).equals(str.substring(str.length()-2))) {
		s=str.substring(2);
	}else {
		s=str;
	}
	System.out.println(s);
	
	
	
	
	
	
	
	
	}

}
