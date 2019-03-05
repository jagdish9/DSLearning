package com.java2.accolite;

import java.util.HashMap;
import java.util.Map;

class Employee{
	private int empid;
	private String name;
	private String location;
	
	public Employee(int empid, String name, String location){
		this.empid = empid;
		this.name = name;
		this.location = location;
	}
	
	public int getEmpid(){
		return empid;
	}
	
	public String getName(){
		return name;
	}
	
	public String getLocation(){
		return location;
	}
}

public class CustomClassAsKey {

	private static Map<Employee, String> map = new HashMap<Employee, String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
