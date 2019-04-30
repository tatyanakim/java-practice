package day21_Practice;
import java.util.Scanner;
public class ConvertCharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter word :");
	String word=scan.next();
	String unique="";
	
	for(int i=0; i < word.length(); i++) {
	char ch=word.charAt(i);

	if(!unique.contains(""+ch)) {
		unique+=ch;
	 
	}
	}System.out.println(unique);
	
	return;
	//for(int i=0;i<word.length;i++){
	//System.out.println(i); 
	//System.out.println(Word.charAt(i));
	
/*	char ch='a';
	String str1=""+ch;
	System.out.println(str1);
	
	
	char ch2='v';
	String str2=Character.toString(ch2);
	*/
	
	
	
	}

}
