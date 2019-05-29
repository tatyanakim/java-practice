
public class WhatsApp {


private String toNum;
private String message;
private boolean delivered;




//constructor
public WhatsApp() {

	System.out.println("No args constructor");
}

public WhatsApp(String toNum,String message) {
	this();
	System.out.println("2 args constructor");
	this.message=message;
	this.toNum=toNum;
}



public WhatsApp(String toNum) {
	
	this(toNum,"Unknown");
	System.out.println("one arg constructor");
}









public String getToNum() {
	return toNum;
	}
public void setToNum(String toNum) {
	this.toNum = toNum;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public boolean isDelivered() {
	return delivered;
}
public void setDelivered(boolean delivered) {
	this.delivered = delivered;
}
@Override
public String toString() {
	return "WhatsApp [toNum=" + toNum + ", message=" + message + ", delivered=" + delivered + "]";
}






}
