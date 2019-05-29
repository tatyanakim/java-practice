package MurodilSessions;
import java.util.Scanner;
import java.util.*;
public class May7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    
		        Scanner scan = new Scanner(System.in);
		        List<String> inputs = new ArrayList<String>();
		        List<String> masked = new ArrayList<>();
		        List<Integer> lengthsList =new ArrayList<>();
		        
		        String answer="";
		        do {
		            System.out.println("Enter word");
		            String word = scan.next(); //hello
		            inputs.add(word);//hello
		            masked.add(maskWord(word));
		            lengthsList.add(word.length());
		            System.out.println("You want to add another word?");
		            answer = scan.next();
		        }while(answer.equalsIgnoreCase("y"));
		        
		        
		        
		        System.out.println(inputs.toString());
		        System.out.println(masked.toString());
		        System.out.println(lengthsList.toString());
		        
		        
		        
		    }
		    
		    /*
		     * maskWord
		     * return: String
		     * params: String word
		     * it will convert each character into * in the work and
		     * return. Length of word and * must match
		     */
		    public static String maskWord(String word) {
		        String stars ="";
		        for(int i = 1; i <= word.length(); i++) {
		            stars += "*";
		        }
		        return stars;
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		}
		



