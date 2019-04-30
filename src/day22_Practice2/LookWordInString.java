package day22_Practice2;

public class LookWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence="He said hi, then she replied hi.hi guys!";
		
	 
		int count=0;
		for(int i=0;i<sentence.length()-1;i++) {
		String temp=sentence.substring(i,i+2);
			
			if (temp.equals("hi")) {
				count++;
			}
		}System.out.println(count);
		
		
		
		
		String str="mycatyourcat ";
		
		int count2=0;
		for(int i=0; i<str.length()-3;i++) {
			String temp2=str.substring(i, i+3);
			if(temp2.equals("cat")) {
				count2++;
			}
		}
		System.out.println(count2);
		
		
		
		
		
		
		

	}

}
