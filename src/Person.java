
public class Person {

private String firstName;
private String lastName;
private String birthday;

//the constructor takes an argument 
//in the body of the constructor we are assigning 
//the argument birthday 
//from now on whenever we want to create on
//object, we have to provide the constructor
public Person(String bday) {
	System.out.println("constructing...");
	birthday=bday;
}



public String getFirstName() {
	return firstName;
}
public void setFirstName(String person) {
	this.firstName = person;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getBirthday() {
	return birthday;
}

//people should not be able to change their birthdays

//public void setBirthday(String birthday) {
//	this.birthday = birthday;
//}
@Override
public String toString() {
	return "Person [person=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + "]";
}




}
