package day24_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for(int j=1;j<=10;j++) {
		 * 
		 * for(int i1=1;i1<=j;i1++) { System.out.print(i1+" "); } System.out.println();
		 * }
		 */

		int i = 1;
		int j = 1;
		int n = 5;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {// j<=i(chislo i eto skolko raz j budet run
				System.out.print("* ");
			}
			System.out.println();
		}

		// +++++++++First three letters of all elements in
		// Array+++++++++++++++++++++++++++++++++++++++++++

		String[] arr = { "apple", "banana" };

		for (int m = 0; m < arr.length; m++) {
			if (arr[m].length() >= 3) {
				String[] newArr = { arr[m].substring(0, 3) + " " };
			}
			System.out.println(arr[m].substring(0, 3));

		}

		// ++++++++FIRS AND LAST LETTER OF ALL ELEMENTS IN
		// ARRAY++++++++++++++++++++++++++++++

		// String[] words = { "apple", "banana" };

		// for (int f = 0; f < words.length; f++) {

		// if (words[f].length() >= 2) {
		// System.out.println(words[f].substring(0,
		// 1).concat(words[f].substring(words[f].length() - 1)));
		// }

		// }

		// ++++++++++++++SPLIT ARRAYS ONE STRING INTO ELEMENTS ,PRINT ARRAY
		// BACKWORDS++++++++++++++++++++++++
		String reversed = "";
		String sentence = "Java is fun";
		String[] word = sentence.split(" ");// razdelili na array elementi assign it to word array

		for (int c = word.length - 1; c >= 0; c--) { // delaem kak array
			reversed += word[c] + " ";
		}
		System.out.println(reversed);

		// 1 Done 5 next to 5 in Array find out
		int[] num = { 1, 5, 6, 1, 5 };
		String newNum = Arrays.toString(num);
		if (newNum.contains("5, 5")) {
			System.out.println("true");
		} else
			System.out.println(false);

		// 2 Done . print each word to next line

		String sentence2 = "java is fun";
		String newS = sentence2.replace(" ", " \n");

		System.out.println(newS);

		// 3 Done Calculate count all even nums in Array
		int count = 0;
		int[] nums2 = { 2, 1, 2, 3, 4 };
		// String newNum2=Arrays.toString(nums2);
		for (int i3 = 0; i3 < nums2.length; i3++) {
			if (nums2[i3] % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);

		// 4 Done . print first and last letter in [ ....]

		String[] words = { "hello", "why", "by", "apple", "note" };

		String newStr = " ";
		for (int p = 0; p < words.length; p++) {
			newStr += words[p].substring(0, 1).concat(words[p].substring(words[p].length() - 1) + ", ");

		}
		System.out.println("[" + newStr.substring(0, newStr.length() - 2).trim() + "]");
		// words[p];

		
		
		
		
		//5 Split array kogda length=1
		
		int count2 = 0;
		String email = "info@cybertekschool.com";
		

		String[]newEmail=email.split("@");//split pishesh bukvu otkuda split
		System.out.println(newEmail.length);
		for(int g=0;g<email.length()-1;g++) {
		String at=email.substring(g,g+1);
		if(at.contains("@")) {
			count2++;
		System.out.println(count2);
		}
		}
		 if(count2<1 ||count2>1) {
			System.out.println("invalid email");
		   return;
		}
			//String[]email2=email.split("@");
			//System.out.println(email2[0]);
			//System.out.println(email2[1]);
		 System.out.println("Email id: "+email.substring(0,email.indexOf("@")) );
		 System.out.println("Email domain: "+email.substring(email.indexOf("@")+1));
		
			
		
		
		
		
		
	// Done	
	 int n1=6;     
	int j1=0;
	String asterics=" ";
		
	do {
		asterics+="*"; 
	j1++;
	}while(j1<=n);

	System.out.println(asterics.trim());
		
		
		
		//7  print sum: 1*1+2*2......till 50   done
	int k = 1;
    int total = 0;
	
	do {
	
		total+=k*k;
		k++;
	}while(k<=50);	
		
		System.out.println(k);
	System.out.println(total);
	
	
	 
	
	//8 Asteriks  done
	for(int v=1;v<=97;v++){
	    System.out.print("*");
	 }
	
	
	
	//9 done
	for(int x=80;x>=20;x--) {
		if(x%2!=0) {
		continue;
		
		}System.out.print(x+" ");
	
	
	
	}
	System.out.println();
	
	
	
	
	
	
	
	}	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	


