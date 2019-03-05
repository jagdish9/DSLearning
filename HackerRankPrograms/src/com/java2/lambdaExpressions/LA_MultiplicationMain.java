package com.java2.lambdaExpressions;

public class LA_MultiplicationMain {

	public static void main(String[] args){
		LA_AdditionOfTwoNumbers lambdaMultiplication = (int d, int f) -> d * f;
		LA_AdditionOfTwoNumbers lambdaDivision = (int d, int f) -> {
			if(f == 0) return 0;
			else return d / f;
		};
		System.out.println(lambdaMultiplication.add(12, 6));
		System.out.println(lambdaDivision.add(100, 10));
	}
}
