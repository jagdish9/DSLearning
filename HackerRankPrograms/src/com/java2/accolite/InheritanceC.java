package com.java2.accolite;

class ObjectC{
	
	public Number m1(){
		System.out.println("m1 of ObjectA");
		return 1f;
	}
	
}

public class InheritanceC extends ObjectC {

	public Double m1(){
		System.out.println("m1 of ObjectA");
		return 1.0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
