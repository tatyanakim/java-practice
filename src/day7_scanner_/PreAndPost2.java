package day7_scanner_;

public class PreAndPost2 {
	public static void main(String[]args) {
//		int messages= 10;
//		messages++;//11
//		++messages;//12
//		System.out.println(messages);//12
//		
//		int readMessages=--messages;//11
//		System.out.println(readMessages);//11
//		System.out.println(messages);//11
//		
//		
//		int unreadMessages= readMessages--;
//		System.out.println(unreadMessages);//11
//		System.out.println(readMessages);//10
////		
//		int total=unreadMessages++ -readMessages--;
//		System.out.println(unreadMessages);//12
//		System.out.println(readMessages);//9
//		
//		System.out.println(total);//1
		
		
		int count=20;
		int count2=10;
		int totalCount=++count + --count2;
		System.out.println(count);//21
		System.out.println(count2);//9
		System.out.println(totalCount);//30
		            
		int myCount= count++ + ++count;
		System.out.println(myCount);//44
		
		double balance=150.0;
		boolean broke= balance<=0.0;
		
		System.out.println(broke);
		
		double transaction= 155.5;
		boolean broke2 =(balance-transaction)<0;
		System.out.println(broke2);
		
		
		
		
	}

}
