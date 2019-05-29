package day42_Encapsulation;

public class WarmUpCoffee {

	


String type;
int cal;
String size;
double price;

public void  getCoffeeInfo() {
	String info ="YOUR ORDER: ~"+ type.toUpperCase()+"~  "+size.toUpperCase()+"~ $" +price+"~ "+cal+" CAL";
	System.out.println(info);
}
public void setType(String newType) {
	type=newType;
	
}public void setSize(String newSize) {
	if (newSize.equalsIgnoreCase("TALL")||
	newSize.equalsIgnoreCase("grande") ||
	newSize.equalsIgnoreCase("venti")) {
		size=newSize;
		
	}else {
		System.out.println("ERROR: Invalid Size - " + newSize);
		size = "unknown";
	}



}public void setPrice(double newPrice) {
	price=newPrice;


}public void setCal(int newCal) {
	cal=newCal;
}
public void setCofInfo(String newType,String newSize ,double newPrice,int newCal ) {
	type=newType;
	setSize(newSize);
	price=newPrice;
	cal=newCal;
	
	
	
	
}

}