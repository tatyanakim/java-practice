package day25_Arrays;

import java.util.Arrays;

public class Repl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			
			
			
		
			
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	/*	// 11 done find the longest word in array

		String temp = " ";
		String[] words = { "heya", "yolo", "YOOOOO", "super long", "ez", "jhgfd", "oooooooooooooo" };
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > temp.length()) {// sravnivaem s odnu dilnu s dlinnoi drugoi
				temp = words[i];// dlinnee assign

			}

		}
		System.out.println(temp);

		/*
		 * Done the utopian tree year 1 - growth 1 cm tree size: 1cm year 2 - growth 1
		 * cm tree size:2cm year 3 - growth 1 cm tree size:3cm year 4 - growth 2 cm tree
		 * size: 5cm year 5 - growth 2 cm tree size: 7cm year 6 - growth 2 cm tree size:
		 * 9cm ... until you reach year 10
		 */
		/*int growth = 0;
		int temp2 = 0;
		int[] tree = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int n = 0; n < tree.length; n++) {
			if (n <= 2) {
				temp2 += 1;
				growth = 1;
				// System.out.println("year " + (n + 1) + " - " + "growth " + temp2 + " cm");

			} else if (n > 2 && n <= 10) {
				temp2 += 2;
				growth = 2;

			}
			System.out.println("year " + (n + 1) + " - " + "growth " + growth + " cm");
			System.out.println("tree size: " + temp2 + " cm");
		}

		

		// print ABCD done

		String new2 = " ";// this is a new string with its length where we be pitting the char by char
		int count = 0;
		String str = "AAABBBBCCDD";
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != new2.charAt(count)) {// proveryaem char at index v oboih Stringah

				new2 += str.charAt(i);
				count++;// index
			} else
				continue;

		}
		System.out.println(new2);
	}*/
	
        String str="apprl";
        String  n="";
        for(int i=0;i<str.length()-1;i++) {
        	if(str.charAt(i)==str.charAt(i+1)) {
        	n+=str.charAt(i)+"";
        	
        	
        	}
        }System.out.println(str.replace(n, "*"));
	   
}	
		
		
}		
		