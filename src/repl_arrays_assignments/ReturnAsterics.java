package repl_arrays_assignments;

public class ReturnAsterics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(asterics("apple"));
	
	}
	
	
	
	
	
	public static String asterics(String str) {
		
		
	    String w="";
		String l="";
		
		for(int i=0;i<str.length()-1;i++) {
			String s=str.substring(i,i+1);
			if(s.equals(s+i)) {
			str=str.replace(s, "*");
		 
			
			   
			
			}
		}
		return str;
	}

}
