package assignments;

public class TV {

private int channel=1;
private int volumeLevel=1;
private boolean on=false;
private String brand="undefined";



public TV() {
	System.out.println("Creating TV object using no Args- constructor");
}
public TV(String brand) {
	System.out.println("Creating TV object using 1 arg - constructor");
	setBrand( brand);
}

public int getChannel() {
	
	return channel;
}
public void setChannel(int channel) {
	if(channel==-1||channel>120) {
		System.out.println("ERROR: TV is either OFF or invalid Channel");
	}
	this.channel = channel;
}
public int getVolumeLevel() {
	
	return volumeLevel;
}
public void setVolumeLevel(int volumeLevel) {
	if(volumeLevel<1||volumeLevel>7) {
		System.out.println("ERROR: TV is either OFF or invalid Volume level");
	}
	this.volumeLevel = volumeLevel;
}
public boolean isOn() {
	if(on==true) {
		
}
	return on;
}
public void setOn(boolean on) {
	this.on = on;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}

public void channelUp() {
	channel++;
}
public void channelDown() {
	channel--;
}
public void  volumeUp() {
	volumeLevel++;
}
public void volumeDown() {
	volumeLevel--;
}public void  turnOn() {
	if(on==true) {
		System.out.println("TV is already ON");
	}
	
}public void turnOff() {
	if(on==false) {
		System.out.println("TV is already OFF");
	}
}







}
