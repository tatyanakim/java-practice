package VAsiliySessions;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Employee emp1=new Employee();
	//first employee
	emp1.firstName="Jack";
	emp1.lastName="Dowson";
	
	emp1.generatedEmail();
	emp1.printEmail();
	
	emp1.setJobTitle("developer");
	emp1.printInfo();
	//second employee
	
	
	Employee emp2=new Employee();
	
	emp2.firstName="Rose";
	emp2.lastName="Dowson";
	
	emp1.employee_id=1912;
	emp1.age=24;
	emp1.hourlyRate=75;
	emp1.gender='M';
	emp1.isInsured=true;
	
	
	
	
	
	
	
	}

}
