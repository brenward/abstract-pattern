package main.java.model;

public class IrishPlug implements ThreePinPlug{

	public void deliverPower() {
		System.out.println("Delivering power using 3 pins");		
	}

	public void plugIn() {
		System.out.println("Plugging into socket using 3 pins");		
	}

}
