package day45;

public class EtsyDotCom {

	
		public static void main(String[] args) {
			EtsyAccount acct1 = new EtsyAccount();
			System.out.println(acct1.toString());
			acct1.setEmail("pumev@mrmail.info");
			acct1.setFirstName("Pumev");
			acct1.setPassword("bulgaria123");
			
			System.out.println(acct1.toString());
			
			EtsyAccount acct2 = new EtsyAccount();
			acct2.setEmail("helirevaroyalhost.info");
			acct2.setFirstName("helireva123");
			acct2.setPassword("abc12");
			System.out.println(acct2.toString());
			
			EtsyAccount acct3 = new EtsyAccount( "Helireva","helireva@royalhost.info", 
					                      "royal234");
			System.out.println(acct3.toString());
			
			
			EtsyAccount acct4=new EtsyAccount("woodenspoon@gmail.com","Vika");
			System.out.println(acct4.toString());
		}
	
	
	
	}


