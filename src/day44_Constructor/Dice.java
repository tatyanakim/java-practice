package day44_Constructor;
import java.util.ArrayList;
import java.util.*;
public class Dice {
public static void main(String[]args) {
	

Job job1=new Job( );//calling a constructor
Job job2=new Job("Java Developer");
Job job3=new Job( "Sdet","Amazon",130000);

System.out.println(job1);
System.out.println(job2);
System.out.println(job3);

//create a 5 job list
List<Job> jobL=new ArrayList<>();
jobL.add(job3);
jobL.add(new Job("Scrum Master","Google",90000));
jobL.add(new Job("SDET","Amazon",120000));
jobL.add(new Job("BA","Capital One",150000));
jobL.add(new Job("Developer","Leidos",100000));

//look at @override method at Job class
System.out.println(jobL.toString());


//find the highest job
double maxSalary=0.0;
int index=-1;
for(int i=0;i<jobL.size();i++) {
	if(jobL.get(i).getAnnualSalary()>maxSalary) {
		maxSalary=jobL.get(i).getAnnualSalary();
		index=i;
	}
	
//System.out.println(jobL.get(index));//print the whole job object




}Job bestJob=jobL.get(index);
System.out.println(bestJob);}


}
