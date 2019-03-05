package com.java2.accolite;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;

class ITEmployee {       
    private long id;   
    private String name;   
    private Date dateOfBirth;    
    private BigDecimal salary;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "ITEmployee [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + "]";
	}   
    
	@Override    
    public boolean equals(Object o) {        
        if (this == o) return true;        
        if (o == null || getClass() != o.getClass()) return false;        
        ITEmployee employee = (ITEmployee) o;        
        if (id != employee.id) return false;        
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;        
        if (dateOfBirth != null ? !dateOfBirth.equals(employee.dateOfBirth) : employee.dateOfBirth != null) return false;        
        return salary != null ? salary.equals(employee.salary) : employee.salary == null;    
    }    
    @Override    
    public int hashCode() {        
        int result = (int) (id ^ (id >>> 32));        
        result = 31 * result + (name != null ? name.hashCode() : 0);        
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        return result;    
    } 
    
}

public class EmployeeClass {

	public static void main(String[] args){
		
		HashMap<ITEmployee, String> empMap = new HashMap<ITEmployee, String>();
	    
		ITEmployee itemp = new ITEmployee();
		itemp.setId(1);
		itemp.setName("Sachin");
		itemp.setDateOfBirth(new Date(1987, 2, 1));
		itemp.setSalary(new BigDecimal(100000));
		
		empMap.put(itemp, "India");
		
		ITEmployee itemp2 = new ITEmployee();
		itemp2.setId(1);
		itemp2.setName("Sachin");
		itemp2.setDateOfBirth(new Date(1987, 2, 1));
		itemp2.setSalary(new BigDecimal(100000));
		
		empMap.put(itemp2, "Japan");
		
		System.out.println(empMap);
		
	}
}
