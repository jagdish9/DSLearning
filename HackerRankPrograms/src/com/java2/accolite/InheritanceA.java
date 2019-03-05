package com.java2.accolite;

class ObjectA{

	public void m1(){
		System.out.println("m1 of ObjectA");
	}
}

public class InheritanceA extends ObjectA {

	public void m1(){
		System.out.println("m1 of child class");
	}
	
	public static void main(String[] args){
		ObjectA objA = new InheritanceA();
		objA.m1();
	}
}
