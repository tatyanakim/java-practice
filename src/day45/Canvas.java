package day45;
import java.util.*;
public class Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Course  cors1=new Course();
	
	cors1.setName("JAVA PROGRAMMING");
	//List of teachers
	
	List<String> teachers =new ArrayList<>();
	
	teachers.add("Vasyl");
	teachers.add("Murodil");
	teachers.add("Muhtar");
	teachers.add("Maruf");
	cors1.setTeachers(teachers);
	System.out.println(cors1.toString());
	
	List<String> students=new ArrayList<>();
	students.add("Tanya");
	students.add("Anara");
	students.add("Prince");
	students.add("Valya");
	students.add("Fuad");
	cors1.setStudents(students);
	
	System.out.println(cors1.toString());
	
	cors1.addTeacher("Maria");
	cors1.addStudent("Orhan");
	
	System.out.println(cors1.toString());
	
	if(cors1.getTeachers().contains("Maria")) {
		System.out.println("MAria is added");
	}else {
		System.out.println("MAria didnt add");
	}
	
	if(cors1.getStudents().contains("Orhan")) {
		System.out.println("Student is added");
		
		
	}else {
		System.out.println("Student didnt add");
		
	
				
	}

	cors1.removeTeacher("Muhtar");
	cors1.removeStudent("Fuad");
	if(!cors1.getTeachers().contains("Muhtar")) {
	System.out.println("Muhtar been removed");
	}else {
		System.out.println("Teacher was not removed ");
	}
	if(!cors1.getStudents().contains("Fuad")) {
		System.out.println("Student has been removed");
	}else {
		System.out.println("Student was not removed successfully");
	}
	
	System.out.println(cors1.toString());

	}

}
