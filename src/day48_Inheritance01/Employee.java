package day48_Inheritance01;
//employee is a person
public class Employee extends Person{
String jobTitle;
public void work() {
	System.out.println(name+" is working as "+jobTitle);
}
@Override
public String toString() {
	return "\nEmployee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
}
	
	
	
	
	
	
	
	
}
