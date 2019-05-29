package VAsiliySessions;

public class Employee {
//instance variable
String firstName;
String lastName;
int employee_id;
int age;
float hourlyRate;
char gender;
boolean isInsured;
String title;
String email;

 String[]titles= {"developer","scrum master","SDET","PO","QA Analist", "BA", "HR"};
//instance method
      public void printInfo() {
    	  System.out.println("First name: " + firstName + ", Last name: " + lastName + ", Employee id: " + employee_id
  				+ ", Age: " + age + ", Hourly rate: " + hourlyRate + "$, Gender: " + gender + ", Insured? " + isInsured
  				+ ", Title: " + title+", Email: "+email);

}public String generatedEmail() {
     String newEmail= firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@mail.com";
     email=newEmail;
     return newEmail;
}
public void setEmail(String e) {
	if(e.contains("@")) {
		email=e;
	}else {
		System.out.println("Invalid email");
	}
	
	
}
public void printEmail() {
	System.out.println("Email of "+firstName+" "+lastName+": "+email);
}
//this method will validate title before setting it
public void setJobTitle(String str) {
	boolean isValid=false;
	for(String t:titles) {
		if(t.equals(str)){
			title=str;
			isValid=true;
		}
		}if (isValid) {
			System.out.println("Title has set successfully");
	}else {
		System.out.println("Invalid title");
	}
}













}