package com.java2.design.pattern.factoy;

import com.java2.design.pattern.OS;
import com.java2.design.pattern.phone.Android;
import com.java2.design.pattern.phone.IOS;
import com.java2.design.pattern.phone.Windows;

public class OperatingSystemFactory {

	public OS getOsInstance(String osType){
		if(osType.equals("OPen"))
			return new Android();
		else if(osType.equals("Closed"))
			return new IOS();
		else 
			return new Windows();
	}
}
