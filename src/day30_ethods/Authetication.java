package day30_ethods;

public class Authetication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Login( "mentoring@cybertekschool.com","entor001");
	
	}






public static void Login(String userName,String validPassword) {
	if (userName.equalsIgnoreCase("mentoring@cybertekschool.com")&&validPassword.equals("mentor001")) {
		System.out.println("Login successfully!Welcome to Okta");
	}else {
		System.out.println("Sign in failed!");
	}
	
		
	
	
}









}
