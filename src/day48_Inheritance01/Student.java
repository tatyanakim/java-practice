package day48_Inheritance01;

public class Student extends Person {

	int studentID;
	String className;


public void code(String lang) {
	System.out.println(name+" is coding "+lang);
}
public void attendClass() {
	System.out.println(name+" is attending "+className+" class");
}

}
