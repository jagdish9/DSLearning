package com.java2.accolite;

import java.util.Map;
import java.util.HashMap;

class CivilEmployee{
     private int id;
     private String name;
     private String location;
     
     public CivilEmployee(int id, String name, String location){
    	 this.id = id;
    	 this.name = name;
    	 this.location = location;
     }
     
     public int getId(){
    	 return id;
     }
     
     public String getName(){
    	 return name;
     }
     
     public String getLocation(){
    	 return location;
     }
     
     @Override
     public String toString(){
    	 return "CivilEmployee [Id =" +id+", name=" +name+", location="+location+ "]";
     }
     
     @Override
     public boolean equals(Object o){
    	 return true;
     }
     
     @Override
     public int hashCode(){
    	 return 1;
     }
}

public class CivilEmployeeClass {

	private static Map<CivilEmployee, String> civilEmp = new HashMap<CivilEmployee, String>();
	
	public static void main(String[] args){
		CivilEmployee e1 = new CivilEmployee(10, "Dutt", "Odissa");
		CivilEmployee e2 = new CivilEmployee(11, "Dutt", "Odissa");
		CivilEmployee e3 = new CivilEmployee(12, "Dutt", "Odissa");
		
		civilEmp.put(e1, "India");
		civilEmp.put(e2, "India");
		civilEmp.put(e3, "India");
		
		System.out.println(civilEmp);
		System.out.println(civilEmp.size());
		
		System.out.println(civilEmp.get(e1));
		System.out.println(civilEmp.get(e2));
		System.out.println(civilEmp.get(e3));
	}
}
