package day41;

public class CapitalOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	BankAccount acc=new BankAccount();
	acc.accountHolder="Jack Walton";
	acc.accountNum=12345;
	acc.deposit(300);
	acc.withdraw(100);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	acc.showBalance();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	acc.charge(300, "bag");
	
	
	
	}

}
