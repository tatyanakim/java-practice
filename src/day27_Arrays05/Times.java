package day27_Arrays05;

import java.util.Scanner;

public class Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// hours:0-23 minutes:0-59

		int[] time1 = new int[2];// 0,0 by default

		int[] time2 = new int[2];// by default
		time1[0] = 10;
		time1[1] = 15;

		time2[0] = 16;
		time2[1] = 10;

		// Before comparing, check if both arrays have valid hour/minute
		// System.out.println("Please enter time and minutes: ");
		// time1=scan.nextInt();
		// time2=scan.nextInt();
		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time1 has nvalid hour");
			return;
		}
		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has nvalid minutes");
			return;
		}

		if (time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		} else if (time1[0] > time2[0]) {
			System.out.println("Time2 is earlier");
		} else {
			if (time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			} else if (time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			} else {
				System.out.println("Same time!");
			}
		}

	}

}
