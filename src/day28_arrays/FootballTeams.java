package day28_arrays;

import java.util.Arrays;

public class FootballTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[][] teams=new String[2][6];//2 arrays with 6 players
	
	
	teams[0][0]="Irina";
	teams[0][1]="Zarif";
	teams[0][2]="Cihan";
	teams[0][3]="Habib";
	teams[0][4]="Adel";
	teams[0][5]="Bojan";
	
	teams[1][0]="Olimjon";
	teams[1][1]="Mirshod";
	teams[1][2]="Usman";
	teams[1][3]="Nursultan";
	teams[1][4]="Roman";
	teams[1][5]="Dmitriy";
	
	
	
	System.out.println("First player of 1st team : "+teams[0][0]);
	System.out.println("First player of 1st team : "+teams[0][3]);
	System.out.println("First player of 1st team : "+teams[1][5]);
	System.out.println("First player of 1st team : "+teams[0][5]);
	
	
	
	
	//print how many rows/teas/arrays
	System.out.println("Nuber of rows: " +teams.length);
	System.out.println("People of in first Team: "+ teams[0].length);
	System.out.println("People of in the second Team: "+ teams[1].length);
	
	System.out.println(Arrays.deepToString(teams));//dlya multiarrays 
	
	
	
	
	int[][] cities= new int[3][4];//3 arrays, 4 rows
	
	
	cities[0][0]=100;
	cities[0][1]=34534;
	cities[0][2]=343242;
	cities[0][3]=77242;
	
	cities[1][0]=256;
	cities[1][1]=64545;
	cities[1][2]=65757;
	cities[1][3]=1087;
	
	cities[2][0]=1022;
	cities[2][1]=275;
	cities[2][2]=9782;
	
	cities[2][3]=1262;
	// print all arrays  
   System.out.println( "Population of the cities: "+ Arrays.deepToString(cities));

// print only first array
System.out.println(Arrays.toString(cities[0]));
	

	
	
   int [][] scores= {{ 3,5,10} ,   {6,4,2,10}};//2 arrays
   System.out.println("Days played/Number of arrays: "+scores.length);//nuber of arrAYS
	System.out.println("Number of values in 1: "+scores[0].length);
	System.out.println("Number of values in 2: "+scores[1].length);
	
	
	
	
	//can tell how any arrays but you can skip nums of values
	int[][] values= new int[4][];
	
	values[0]= new int[] {34,23,5};
	values[1]= new int [] {34,45,452,6,45,2,2,65,657,3};
	
	values[2]=new int[2];//2 values
	values[2][0]=55;//assign this numbers
	values[2][1]=88;//same
	
	values[3]=new int[] {5,2,45,77,34};
	
	System.out.println(Arrays.deepToString(values));
	
	System.out.println("****************");
	
	int[][] nums= {{1,13,6},
			       {6,17,8}};
	
	
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


