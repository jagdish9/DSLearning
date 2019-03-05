package com.java.string;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2)
	{
		if(emp1.getSalary() > emp2.getSalary())
		{
			return 1;
		}
		else if(emp1.getSalary() == emp2.getSalary())
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
}
