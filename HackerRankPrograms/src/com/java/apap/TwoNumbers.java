package com.java.apap;

import java.util.ArrayList;
import java.util.List;

public class TwoNumbers {

	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String changeScript = "aclConfig";
		if(changeScript.contains("set aclConfig \"$aclConfig$expect_out(0,string)\"") ) {
            System.out.println("Success");
        }else System.out.println("Failed");
		
		if("set aclConfig \"$aclConfig$expect_out(0,string)\"".contains(changeScript) ) {
            System.out.println("Success");
        }else System.out.println("Failed");
	}

}
