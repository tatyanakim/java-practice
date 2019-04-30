package repl_arrays_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array reversed done
//        int[]nums = { 4, 3, 2, 44, 1, 100, 55};
//        int arr1[]=new int[nums.length];
//		int count=0;
//        for(int j=nums.length-1;j>=0;j--) {
//		//sozdali count chtobi v new array klal s nachala,t.e s nulya,a ne s konca	
//		 arr1[count]=nums[j];
//			count++;
//		 
//		 
//		 }
//        System.out.print(Arrays.toString(arr1));

		// done find sum and average of the array

		/*
		 * double[] temps = { 80, 88, 88, 84, 82, 78, 60, 68 };
		 * 
		 * double total = 0; double avgTemp = 0; for (int n = 0; n < temps.length; n++)
		 * {
		 * 
		 * total += temps[n]; } System.out.println(total); System.out.println(avgTemp =
		 * total / temps.length);
		 */

		// 10 find the not pair
		// int[] arr = { 3, 4, 1, 2, 3, 1, 2 };
		/*
		 * int[] ar= {44,44,12,12,32,32,10}; Arrays.sort(ar);
		 * System.out.println(Arrays.toString(ar)); int []n=new int[ar.length]; int
		 * coun=0; for (int i2 = 0; i2 < ar.length; i2++) { if(ar[i2]!=n[coun]) {
		 * n[coun]=ar[i2]; coun++; }
		 * 
		 * 
		 * 
		 * 
		 * }System.out.println(n[coun]);
		 */

		// Print shortest word in array done

		
//		 String[] str= {"java", "cable", "red", "vivid", "remedy", "grace"}; 
//		 String temp=str[0]; System.out.println(Arrays.toString(str)); 
//		 for(int i=0;i<str.length;i++) { 
//			 if(temp.length()>=str[i].length()) { 
//				 temp=str[i]; }
//		 
//		 
//		  
//		  }System.out.println(temp);
		 

//		 1)Split String 2)Find shortest words 3)Sort array 4)Print thru
//		 arrays.tostring

		String str = "olive, fish, hot pursuit, old, warning, python, java, coffee, cat, ray";
        String[] arr = str.split(",");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
      
       /* }int counter=0;
        for (int i2 = 0; i2 < arr.length; i2++) {
        	String[] temp=new String[c];
        	
            if(temp[0].length()<=arr[i2].length()) {
        temp[counter]=arr[i2];
        counter++;
            }
        
        System.out.println(Arrays.toString(temp));*/
        
		/*
		 * String str =
		 * "olive, fish, hot pursuit, old, warning, python, java, coffee, cat, ray"; str
		 * = str.replace(" ", "");
		 * 
		 * String[] arr = str.split(",");
		 * 
		 * String temp = " "; Arrays.sort(arr); for (int i = 0; i < arr.length; i++) {
		 * 
		 * for (int j = i + 1; j < arr.length; j++) {
		 * 
		 * if (arr[i].length() > arr[j].length()) { temp = arr[j]; arr[j] = arr[i];
		 * arr[i] = temp;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * for (int k = 0; k < arr.length; k++) {
		 * 
		 * if (arr[k].length() != arr[k + 1].length()) { System.out.println(arr[k]);
		 * break;
		 * 
		 * } else {
		 * 
		 * for (int z = k + 1; z < arr.length; z++) { if (arr[k].length() ==
		 * arr[z].length()) {
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * System.out.print(arr[k]); }
		 * 
		 * }
		 */

		// Find words with"e". Put in empty array with exact spaces for it. done

		/*
		 * String[] st = { "e", "hey", "bye", "furey", "spoon" }; 
		 * int count1 = 0; 
		 * for (int j = 0; j < st.length; j++) { 
		 * if (st[j].contains("e")) { 
		 * count1++; } }
		 * 
		 * int count2 = 0;
		 *  String[] fewValues = new String[count1]; 
		 *  for (int j = 0; j < st.length; j++) { 
		 *  if (st[j].contains("e")) { 
		 *  fewValues[count2] = st[j];      //why"=", not "+="cuz its changing indexes/boxes by count2,not a string with whol 1space 
		 *  count2++;
		 * 
		 * } else { continue; }
		 * 
		 * } System.out.println(Arrays.toString(fewValues));
		 */

        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
}
