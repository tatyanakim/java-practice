
public class CreatePeopleHere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//When we use constructor certain actions are 
		//being taken during the process of creating the object
		
	Person john=new Person( "01/01/2016");
	john.setFirstName("John");
	
	john.setLastName("Doe");
	
	
	
	System.out.println(john.getFirstName());
	System.out.println(john.getLastName());
	System.out.println(john.getBirthday());
	
	
	
	
	john.setLastName("Smith");
	
	
	
	
	
	
	
	
	}

}
