package day40_OOP;

public class BestBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		CellPhone cell=new CellPhone();
		System.out.println(cell.brand);
		System.out.println(cell.screenSize);
		
		cell.brand="Nokia 6300";
		cell.screenSize=2.0;
		cell.color="silver";
		cell.averagePrice=76.60;
		System.out.println("Brand: "+cell.brand);
		System.out.println("screenSize: : "+cell.screenSize);
		System.out.println("Color: "+cell.color);
		System.out.println("Price: "+cell.averagePrice);
		cell.color="black";
	System.out.println("Color: "+cell.color);
	
	
	System.out.println("######################################");
	
	CellPhone cell2=new CellPhone();
	cell2.brand="Siemens";
	cell2.color="blue";
	cell2.averagePrice=39.22;
	
	System.out.println("Brand: "+cell2.brand);
	System.out.println("screenSize: : "+cell2.screenSize);
	System.out.println("Color: "+cell2.color);
	System.out.println("Price: "+cell2.averagePrice);
	
	System.out.println("#####CALLING METHODS############");
	cell.call();
	cell.message();
	cell.takeaPhoto();
	
	cell2.call();
	cell2.message();
	
	}

}
