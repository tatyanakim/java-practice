package day41;

public class BankAccount {


double balance;
String accountHolder;
long accountNum;





public void deposit(double amount) {
	System.out.println("Depositing $"+amount+ " to "+accountNum);
	balance+=amount;
}

public void withdraw(double amount) {
	System.out.println("Withdrawing $"+amount+ " from "+accountNum);
	if(balance<0) {
		balance-=35;
	}
	balance-=amount;

}public void showBalance() {
	System.out.println("Accounholder: "+accountHolder);
	System.out.println("Account numbder: "+accountNum);
	System.out.println("Total balance: "+balance);
}
public void charge(double price,String item) {
	if(price>balance) {
		
		System.out.println("Sorry, you have incificient funds for "+item);
		System.out.println("Total balance: "+balance+ " "+item+" cost: "+price);
	}else {
		System.out.println("Its yours");
		balance-=price;
		System.out.println("Total balance: "+balance);
	}
	
}

}
