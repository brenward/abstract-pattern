package main.java.model;

public class ThreePinAdapter implements ThreePinPlug{
	private TwoPinPlug twoPinPlug;
	
	public ThreePinAdapter(TwoPinPlug twoPinPlug){
		this.twoPinPlug = twoPinPlug;
	}
	
	public void deliverPower() {
		
		twoPinPlug.deliverPower();		
	}

	public void plugIn() {
		System.out.println("Plugging into socket using 3 pins");
	}

}
