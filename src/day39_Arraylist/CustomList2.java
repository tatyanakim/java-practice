package day39_Arraylist;
import java.util.Random;
import java.util.*;
import java.util.Arrays;
public class CustomList2 {

		public static void main(String[] args) {
			ArrayList<Integer> numsList = new ArrayList<>();//method1
			numsList.add(10);
			numsList.add(10);
			numsList.add(7);
			numsList.add(8);
			numsList.add(8);
			numsList.add(3);
			numsList.add(4);
			numsList.add(8);
			printList(numsList);

			List<Double> doubleList = new ArrayList<>();//method2
			doubleList.add(10.33);
			doubleList.add(10.22);
			doubleList.add(7.34);
			doubleList.add(8.99);
			doubleList.add(8.12);
			doubleList.add(3.55);
			doubleList.add(4.76);
			doubleList.add(8.80);
			
			System.out.println( sumList(doubleList) );
			double sum  = sumList(doubleList);
			System.out.println("Sum: " + sum);
			
			System.out.println(getList(10));
			ArrayList<Integer> list=getList(15);
			System.out.println(list.toString());
			//for(;;) {
			System.out.println(getRandomList(20));
			//}
			List<Integer> rList=getRandomList(10);
			Collections.sort(rList);
			System.out.println(rList);
			
			printList( (ArrayList<Integer>) getRandomList(7));
			
			
			System.out.println("****************************");
			List<String> strNums=new ArrayList<>();
			strNums.add("9");
			strNums.add("29");
			strNums.add("90");
			strNums.add("9000");
		
			List<Integer>converted=convertToIntList(strNums);
			System.out.print(converted);
			
			
			
			
		}

		public static void printList(ArrayList<Integer> nums) {
			for (Integer n : nums) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		public static double sumList(List<Double> dList) {
			double sum = 0.0;
			for (double d : dList) {
				sum += d;
			}
			return sum;
		}
		
		public static ArrayList<Integer> getList(int size) {
			ArrayList<Integer> newList = new ArrayList<>();
			for(int w = 1; w <= size; w++) {
				newList.add(w);
			}
			return newList;
		}
		
		public static List<Integer> getRandomList(int size) {
			Random r = new Random(); //object of Random class
			List<Integer> randomNums = new ArrayList<>();
			for(int i = 1; i <= size; i++) {
				randomNums.add(r.nextInt(101));
			}
			return randomNums; 
		
		}
		public static List<Integer> convertToIntList (List <String>strL){
			List<Integer> changed=new ArrayList<>();
		     
	       for(String s:strL) {
	    	   changed.add(Integer.valueOf(s));//new Integer.parseInt(s) also works
	    	   
			 
		}return changed;
		
	


}



}

