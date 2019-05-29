package day42_Encapsulation;
import java.util.Scanner;
public class StringShoesToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//create Shoes object and assign the data from the String data
	String data="Bruno Magli,9.5";
	
	String[] arrData=data.split(",");
	//create shoes object
	Shoes shoes =new Shoes();            //converting String to double 
    shoes.setShoesData(arrData[0],Double.parseDouble(arrData[1]));//
	System.out.println(shoes.getShoesData());
	//2 variant
	shoes.brand=arrData[0];
	shoes.size=Double.parseDouble(arrData[1]);
	System.out.println(shoes.getShoesData());
	
	
	
	
	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("What shoes brand ?");
	String brand =scan.nextLine();
	System.out.println("Whats your size?");
	double size=scan.nextDouble();
	//create object using data from Scanner
    Shoes sh=new Shoes ();
    sh.setShoesData(brand,size);
    System.out.println(sh.getShoesData());
	
	
	
	
	
	
	
	
	
	
	}

}
