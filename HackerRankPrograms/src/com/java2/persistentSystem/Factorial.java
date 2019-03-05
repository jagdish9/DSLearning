package com.java2.persistentSystem;

import java.util.Scanner;

public class Factorial {

	public static int fact(int n){
		int fact = 1;
		for(int i = n; i >= 1; i--){
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any numbet to get the factorial.");
		int n = scan.nextInt();
		System.out.println("Factorial of "+n+" is "+fact(n));
	}
	
}
