package MurodilSessions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileToList {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("products.txt");
		Scanner scan = new Scanner (file);
	//	System.out.println(scan.nextLine());
		
		ArrayList<String> data=new ArrayList<>();
		//hasNextLinewill be true if there is line of data
		while(scan.hasNextLine()) {
		//it reads a libe and swithches to the next line
			String line=scan.nextLine();
			System.out.println(line);
		    data.add(line);
		
		
		
		
	}
		
		System.out.println("Number of products: "+data.size());
		System.out.println(data.toString());
		
		
		
		
}}