package com.java2.accolite;

final class ImmutableStudent {

	final String name; 
    final int regNo; 
  
    public ImmutableStudent(String name, int regNo) 
    { 
        this.name = name; 
        this.regNo = regNo; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
    } 
}

public class ImmutableClass01{
	
	public static void main(String[] args){
		ImmutableStudent is = new ImmutableStudent("ZCX", 24);
		System.out.println(is.getName());
		System.out.println(is.getRegNo());
	}
}
