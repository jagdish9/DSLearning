package com.java2.accolite;

public class OverloadingA {

	public void m1(){
		System.out.println("m1");
	}
	
	public void m1(int a){
		System.out.println("m1 with 1 argument");
	}
	
	public int m1(String s){
		System.out.println("m1 with string arguments");
		return 0;
	}
	
	public static void main(String[] args){
		OverloadingA objA = new OverloadingA();
		objA.m1();
		objA.m1(12);
		objA.m1("Hello");
	}
}
