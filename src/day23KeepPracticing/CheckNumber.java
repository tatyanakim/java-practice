package day23KeepPracticing;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 100; i++) {
			if (i % 2 > 0) {
				continue;
			}
			System.out.println("Number " + i);
		}

		for (int i = 1; i <= 20; i++) {
			// System.out.println(i);
			if (i >= 5 && i <= 10) {
				continue;
			}
			System.out.println(i);
		}

		String str = "java";

		for (int i = 0; i <= str.length() - 1; i++) {

			if (str.substring(i, i + 1).equals("a")) {
				continue;
			}
			System.out.println(str.substring(i, i + 1));

			// ++++++++++++++++CALCULATE SUM OF NUMBERS IGNORE 0 or less than 0 numbers
			System.out.println("++++++++++++++++++++++++++++++++++++++++++");

			Scanner scan = new Scanner(System.in);

			int sum = 0;
			for (int n = 0; n < 6; n++) {
				System.out.println("Enter a num: ");
				int num = scan.nextInt();
				if (num <= 0) {
					continue;
				}
				sum += num;

			}
			System.out.println("Total sum:" + sum);

		}

	}

}
