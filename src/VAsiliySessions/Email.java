package VAsiliySessions;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(generateEmail("James","Bark"));
	System.out.println(generateEmail2("James","Bark","hotmail"));
	
	
	
	String[]characters= {"Velma Griffin", "Veronica Cooper", "Milly Fitzpatrick"};

	for(String str:characters) {
		String name=str.split(" ")[0];
		String lastName=str.split(" ")[1];
		System.out.println(generateEmail(name,lastName));
	}
	
	
}

// this method takes only 2 parameters
  public static String generateEmail(String fName,String lName) {
	  
	  return fName.toLowerCase()+"_"+lName.toLowerCase()+"@gmail.com";
	  
	  
	  
	}

//this  method takes 3 parameters
  
 public static String generateEmail2(String name,String lname, String domain) {
	  
	  return name.toLowerCase()+"_"+lname.toLowerCase()+"@"+domain+".com";
	  

}
}