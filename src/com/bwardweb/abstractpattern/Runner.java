package com.bwardweb.abstractpattern;

import com.bwardweb.abstractpattern.model.IrishPlug;
import com.bwardweb.abstractpattern.model.ThreePinAdapter;
import com.bwardweb.abstractpattern.model.ThreePinPlug;
import com.bwardweb.abstractpattern.model.TwoPinPlug;
import com.bwardweb.abstractpattern.model.USPlug;

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
