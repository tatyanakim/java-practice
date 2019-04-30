package day19_loop;
import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
       int count=0;
      System.out.println("Whats the current balance?:");
	   double balance=scan.nextDouble();
	   while(balance>=0) {
		   count++;
		   if(balance<=0) {
		    	System.out.println("Warning!");
		    	System.out.println("Remaining balance is: " +balance);
		    	return;
		    }
		   System.out.println("Whats transaction #"+count+ "amount?");
	   double  transactions=scan.nextDouble();
	    balance-=transactions;
	    if(transactions>balance) {
	    	System.out.println("Your balance is about to be negative due to this transaction");
	    }
	   }
	    System.out.println("You have insufficient funds: "+balance);
	    System.out.println("Total transaction count:"+count);
	   
	    
	    //MURODIL     VERSION++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	    
	    System.out.println("What is your current balance?");
		double balance2 = scan.nextDouble();
		int count2 = 0;
		
		while(balance2 > 0) {
			count2++;//increase transaction by 1
			System.out.println("What is transaction #"+count2+" amount?");
			double transaction2 = scan.nextDouble();
			//balance = balance - transaction;
			if(transaction2 > balance2) {
				System.out.println("You balance is about to be negative due to this transaction");
			}
			balance2 -= transaction2;
			System.out.println("Current balance: " + balance2);
		}
		
		System.out.println("You have insufficient funds for any more transactions, your balance is " + balance);
		System.out.println("Transactions total count:" + count2);
	}



       
       
	   
	
	
	
	
	
	
	
	
	
	
	}


