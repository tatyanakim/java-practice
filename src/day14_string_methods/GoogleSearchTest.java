package day14_string_methods;

public class GoogleSearchTest {
	public static void main(String[] args) {
		
		String item="java";
		String pageTitle=item+" -Google Search";
		
		if(pageTitle.startsWith(item)) {
			System.out.println("Pass");
		}else {
			System.out.println("Error");
		}
		
		if (pageTitle.endsWith("Google Search")) {
			System.out.println("Pass");
		}else {
			System.out.println("FAIL");
		}
		
		
		
		
		
		
		
		
	}
}
