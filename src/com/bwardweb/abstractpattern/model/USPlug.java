package com.bwardweb.abstractpattern.model;

public class USPlug implements TwoPinPlug	{

	public void deliverPower() {
		System.out.println("Delivering power using 2 pins");		
	}

	public void plugIn() {
		System.out.println("Plugging into socket using 2 pins");
	}

}
