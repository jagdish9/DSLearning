package com.java2.design.pattern.main;

import com.java2.design.pattern.OS;
import com.java2.design.pattern.factoy.OperatingSystemFactory;

public class FactoryDesign {

	public static void main(String[] args){
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getOsInstance("Open");
		obj.spec();
	}
}
