package day26;

import java.util.Arrays;
import java.util.Random;

public class WarmUpNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 String[] names= {"James","Mary","John","Patricia","Robert","Jennifer","Michael","Linda","William","Elizabeth",
		"David","Barbara","Richard","Susan","Joseph","Jessica","Thomas","Sarah","Charles","Margaret","Christopher","Karen","Daniel","Nancy",
		"Matthew","Lisa","Anthony","Betty","Donald","Dorothy","Mark","Sandra","Paul","Ashley","Steven","Kimberly","Andrew","Donna",
		"Kenneth","Emily","George","Carol","Joshua","Michelle","Kevin","Amanda","Brian","Melissa","Edward","Deborah","Ronald","Stephanie",
		"Timothy","Rebecca","Jason","Laura","Jeffrey","Helen","Ryan","Sharon","Jacob","Cynthia","Gary","Kathleen","Nicholas","Amy",
		"Eric","Shirley","Stephen","Angela","Jonathan","Anna","Larry","Ruth","Justin","Brenda","Scott","Pamela","Brandon","Nicole","Frank","Katherine",
		"Benjamin","Samantha","Gregory","Christine","Raymond","Catherine","Samuel","Virginia","Patrick","Debra","Alexander","Rachel","Jack","Janet",
		"Dennis","Emma","Jerry","Carolyn","Tyler","Maria","Aaron","Heather","Henry","Diane","Jose","Julie","Douglas","Joyce","Peter","Evelyn",
		"Adam","Joan","Nathan","Victoria","Zachary","Kelly","Walter","Christina","Kyle","Lauren","Harold","Frances",
		"Carl","Martha","Jeremy","Judith","Gerald","Cheryl","Keith","Megan","Roger","Andrea","Arthur","Olivia","Terry","Ann","Lawrence","Jean",
		"Sean","Alice","Christian","Jacqueline","Ethan","Hannah","Austin","Doris","Joe","Kathryn","Albert","Gloria","Jesse","Teresa","Willie","Sara","Billy","Janice","Bryan","Marie",
		"Bruce","Julia","Noah","Grace","Jordan","Judy","Dylan","Theresa","Ralph","Madison","Roy","Beverly","Alan","Denise","Wayne","Marilyn","Eugene","Amber",
		"Juan","Danielle","Gabriel","Rose","Louis","Brittany","Russell","Diana","Randy","Abigail","Vincent","Natalie","Philip","Jane","Logan","Lori",
		"Bobby","Alexis","Harry","Tiffany","Johnny","Kayla"};
		
	System.out.println("number of names: " +names.length);
	System.out.println(Arrays.deepToString(names));
	  
	//print 2 names at a line
	  for(int i=0;i<names.length;i+=2) {
		  
		  System.out.println(names[i]+" "+names[i+1]);
		
	}// print only male
	for(int n=0;n<names.length;n++) {
		if(n%2!=0) {
			continue;
		}System.out.print(names[n]+", ");
	
	
	}// print only  female
	System.out.println();
	for(int n2=0;n2<names.length;n2++) {
		if(n2%2==0) {
			continue;
			
		}if(n2==names.length-1) {
			System.out.println(names[n2]);
		}else {
		System.out.print(names[n2]+", ");
	
	
	}
	
	}
	
	// print Random numbers 
	System.out.println(names[2]);
	
	Random random=new Random();
	int r=random.nextInt(names.length);
	System.out.println("Random name: "+names[r]);
	
	
	//print all names that are up to 4 in Uppercase in same line
	
	for(int m=0;m<names.length;m++) {
		if(names[m].length()<=4) {
			System.out.print(names[m].toUpperCase()+", ");
		}	
		
	}
		//
		
		String names3to4 ="";
		String names5to6="";
		String names7ormore="";
	
		
		
		
		for (String name:names) {
		if(name.length()<=4)	{
			names3to4+=name+", ";
			
		
		}else if(name.length()==5||name.length()==6)	{
			names5to6+=name+", ";
		
		}else  {
			names7ormore+=name+", ";
		
		}
		
		}System.out.println("names 3 to 4: " +names3to4);
		System.out.println("names 5 to 6: " +names5to6);
		System.out.println("names 7 or more: " +names7ormore);
		
		
		
		System.out.println(Arrays.deepToString(names));
		
		
		
		
		
		
		
		//ladies first my version
		
		for(int p=0;p<names.length;p+=2) {
			if(p==0) {
				System.out.print(names[p+1]+", ");
					
			}else {
			System.out.print(", "+ names[p+1]+", ");
			}
		System.out.print(names[p]);
		}
		
		
		
		
		
		
		
		System.out.println();
		
		//Murodil version
		
		
		for(int i5 = 0; i5 < names.length; i5+=2) {
			String temp = names[i5];
			names[i5] = names[i5+1];
			names[i5+1] = temp;	
		}
		System.out.println(Arrays.toString(names));
		
		
		String str1 = "first word";
		String str2 = "second word";
		
		String temp = str1;
		str1 = str2;
		str2 = temp;
		
		System.out.println("str1 - " + str1);
		System.out.println("str2 - " + str2);
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
