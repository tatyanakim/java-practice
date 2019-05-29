package day40_OOP;

public class ContactList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Contact con=new Contact();
	con.name="Risya";
	con.phoneNum="(787)-667-6767";
	con.email="risya.com";
	
	
	System.out.println(con.name);
	con.call();
	con.sendEmail();
	con.sendMesssage();
	
	System.out.println("########NEW CONTACT#######");
	Contact con2=new Contact();
	con2.name="Anara";
	con2.phoneNum="(322)-787-8989";
	con2.email="anara.capital.com";
	
	System.out.println(con2.name);
	con2.call();
	con2.sendEmail();
	con2.sendMesssage();
	
	
	
	
	}

}
