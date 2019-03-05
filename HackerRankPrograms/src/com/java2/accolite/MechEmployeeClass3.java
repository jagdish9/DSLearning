package com.java2.accolite;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

final class MechEmployees {
    private final long id;
    private final String name;
    private final Date dateOfBirth;
    private final BigDecimal salary;
    public MechEmployees(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.id;
        this.name = employeeBuilder.name;
        this.dateOfBirth = employeeBuilder.dateOfBirth;
        this.salary = employeeBuilder.salary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MechEmployees employee = (MechEmployees) o;
        if (id != employee.id) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(employee.dateOfBirth) : employee.dateOfBirth != null)
            return false;
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
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", salary=" + salary +
                '}';
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getDateOfBirth() {
        return (Date) dateOfBirth.clone();
    }
    public BigDecimal getSalary() {
        return salary;
    }
    
    public static final class EmployeeBuilder {
        private long id;
        private String name;
        private Date dateOfBirth;
        private BigDecimal salary;
        private EmployeeBuilder() {
        }
        public static EmployeeBuilder anEmployee() {
            return new EmployeeBuilder();
        }
        public static EmployeeBuilder anEmployee(MechEmployees employee) {
            return anEmployee().withId(employee.getId()).withName(employee.getName()).withDateOfBirth(employee.getDateOfBirth()).withSalary(employee.getSalary());
        }
        public EmployeeBuilder withId(long id) {
            this.id = id;
            return this;
        }
        public EmployeeBuilder withName(String name) {
            this.name = name;
            return this;
        }
        public EmployeeBuilder withDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public EmployeeBuilder withSalary(BigDecimal salary) {
            this.salary = salary;
            return this;
        }
        public MechEmployees build() {
            return new MechEmployees(this);
        }
    }
}

/*Make the Key object immutable so that mutation of the key will not affect the key element of the HashMap,
so the HashMap will be consistent. Below is the implementation of an immutable Employee class via with Builder pattern.
*/

public class MechEmployeeClass3{
	
	public static void main(String[] args){
		HashMap<MechEmployees,String> employeeMap = new HashMap<MechEmployees,String>();
	    MechEmployees employee1 = MechEmployees.EmployeeBuilder.anEmployee().withId(1)
	                                .withName("Sachin")
	                                .withDateOfBirth(new Date(1987, 2, 1))
	                                .withSalary(new BigDecimal(100000))
	                                .build();
	    employeeMap.put(employee1,"India");
	    for (Map.Entry<MechEmployees, String> employeeStringEntry : employeeMap.entrySet()) {
	        System.out.println(employeeStringEntry.getKey().hashCode());
	    }
	    MechEmployees immutableUpdatedEmployee1 = MechEmployees.EmployeeBuilder.anEmployee(employee1).withName("Rahul").build();
	    for (Map.Entry<MechEmployees, String> employeeStringEntry : employeeMap.entrySet()) {
	        System.out.println(employeeStringEntry.getKey().hashCode());
	    }
	    System.out.println(employeeMap.get(immutableUpdatedEmployee1));
	    // Returns null
	    MechEmployees employee2 = MechEmployees.EmployeeBuilder.anEmployee().withId(1)
	            .withName("Sachin")
	            .withDateOfBirth(new Date(1987, 2, 1))
	            .withSalary(new BigDecimal(100000))
	            .build();
	    System.out.println(employee2.hashCode());
	    System.out.println(employeeMap.get(employee2));
	    // Now this works fine and it shall return  the correct object from the HashMap
	}
}

//Now update the code of the test to see if the HashMap works consistently: