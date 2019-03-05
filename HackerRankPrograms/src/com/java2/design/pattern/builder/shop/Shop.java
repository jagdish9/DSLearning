package com.java2.design.pattern.builder.shop;

import com.java2.design.pattern.builder.Phone;
import com.java2.design.pattern.builder.PhoneBuilder;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Phone p = new Phone("Android", 2, "Qualcomm", 5.5, 310);
		
		Phone p = new PhoneBuilder().setOs("Android").setProcessor("Core i3").getPhone();
		System.out.println(p);
	}

}
