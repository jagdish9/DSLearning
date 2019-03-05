package com.java2.accolite;

import java.util.HashMap;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Map;

public class EmployeeClass2 {

	public static void main(String[] args) {    
	    HashMap<ITEmployee,String> employeeMap = new HashMap<ITEmployee,String>();  
	    ITEmployee employee1 = new ITEmployee();   
	    employee1.setId(1);   
	    employee1.setName("Sachin");   
	    employee1.setDateOfBirth(new Date(1987,2,1));   
	    employee1.setSalary(new BigDecimal(100000));
	    // Step 1
	    employeeMap.put(employee1,"India");   
	    for (Map.Entry<ITEmployee, String> employeeStringEntry : employeeMap.entrySet()) {
	        System.out.println(employeeStringEntry.getKey().hashCode());   
	    }
	    // Step 2
	    // Mutating the Employee Object
	    employee1.setName("Rahul");    
	    for (Map.Entry<ITEmployee, String> employeeStringEntry : employeeMap.entrySet()) {
	        System.out.println(employeeStringEntry.getKey().hashCode());    
	    }
	    // The HashMap key is mutated and in the wrong bucket for that hashcode. 
	    // Step 3
	    System.out.println(employeeMap.get(employee1));    
	    // Returns null    
	    ITEmployee employee2 = new ITEmployee();   
	    employee2.setId(1);   
	    employee2.setName("Sachin");   
	    employee2.setDateOfBirth(new Date(1987,2,1));   
	    employee2.setSalary(new BigDecimal(100000));
	    System.out.println(employeeMap.get(employee2)); 
	    // Returns null
	}
}

//Employee is a mutable object. That will create problems with a HashMap. Let's look at the code below:
/*Once the Employee Object is mutated, the hashcode of that object is going to change.
Now, if we try to retrieve it in step 3 (with the different hashcode), 
it will go to a different bucket and not be able to get the value. 
Now, the object placed in the HashMap is lost forever.*/