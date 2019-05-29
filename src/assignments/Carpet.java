package assignments;

public class Carpet {
	 public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;



public Carpet() {
	this.width=300.00;
	this.length=300.00;
	this.unitPrice=0.00;
	this.totalPrice=200.00;
	this.isPersian=false;
}
public Carpet(double width,double length,double unitPrice,boolean isPersian) {
	totalPrice=(width+length)*unitPrice;
	if (isPersian==true) {
		totalPrice+=200;
		this.isPersian=isPersian;
	}
	this.width=width;
	this.length=length;
	this.unitPrice=unitPrice;
	
}







}