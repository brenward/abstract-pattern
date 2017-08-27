package main.java;

import main.java.model.IrishPlug;
import main.java.model.ThreePinAdapter;
import main.java.model.ThreePinPlug;
import main.java.model.TwoPinPlug;
import main.java.model.USPlug;

public class Runner {

	public static void main(String[] args) {

		ThreePinPlug irishPlug = new IrishPlug();
		TwoPinPlug usPlug = new USPlug();
		
		ThreePinAdapter usPlugInIreland = new ThreePinAdapter(usPlug);
		
		System.out.println("------------------------------------------");
		System.out.println("Irish and American devices working at home");
		System.out.println("------------------------------------------");
		
		irishPlug.plugIn();
		irishPlug.deliverPower();
		
		usPlug.plugIn();
		usPlug.deliverPower();
		
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("American device on holidays");
		System.out.println("------------------------------------------");
		
		usPlugInIreland.plugIn();
		usPlugInIreland.deliverPower();

	}

}
