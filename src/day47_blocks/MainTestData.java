package day47_blocks;

public class MainTestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//by static
	System.out.println(TestData.url);
	System.out.println(TestData.email);
	System.out.println(TestData.password);
	String briteERPUrl=TestData.url;//storing data
	System.out.println(briteERPUrl);
	
	
	//by object
	TestData email=new TestData();
	System.out.println(email.email);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
