package day20_forloop;

public class SumOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int sumOfOdds=0;
	int sumOfEvens=0;
	
	
	for(int num=1;num<=100;num++) {
		if(num%2==0) {
		sumOfEvens+=num;
		
		}else {
			sumOfOdds+=num;
			
		}
	}
	
	
	System.out.println(sumOfEvens);
	System.out.println(sumOfOdds);
	
	
	
	}

}
