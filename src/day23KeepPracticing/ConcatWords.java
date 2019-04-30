package day23KeepPracticing;

import java.util.Scanner;

public class ConcatWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		/*
		 * String sum=""; for(int i=0;i<6;i++) { System.out.println("enter word: ");
		 * String word=scan.next(); if(word.contains("java")) { continue;
		 * 
		 * } sum+=word+",";
		 * 
		 * }System.out.println(sum.substring(0,sum.length()-1));
		 * 
		 * 
		 * System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * 
		 * String expectedUserName = "admin"; String expectedPassword = "admin123";
		 * String username = ""; String password = ""; int attempts = 5;
		 * 
		 * do { if(attempts == 0) {
		 * System.out.println("You have exceeded number ot attampts");
		 * System.out.println("This user has bee deactivated for 30 minutes"); return; }
		 * attempts--; System.out.println("Please enter user name"); username =
		 * scan.next(); if(!username.equals(expectedUserName)) {
		 * System.out.println("Wrong user name");
		 * System.out.println("Attempts left: "+attempts); continue; }
		 * System.out.println("Please enter password"); password = scan.next();
		 * if(!password.equals(expectedPassword)) {
		 * System.out.println("Wrong password");
		 * System.out.println("Attempts left: "+attempts); continue; }
		 * }while(!username.equals(expectedUserName) ||
		 * !password.equals(expectedPassword));
		 * 
		 * System.out.println("Login successful!");
		 */

		System.out.println("+++++++++++++++++++++++++++++++++");

		for (int i = 1; i <= 50; i++) {
			if (i % 20 == 0) {
				break;

			}
			if (i % 5 == 0) {
				continue;
			}
			System.out.println(i + "");
		}

	}

}
