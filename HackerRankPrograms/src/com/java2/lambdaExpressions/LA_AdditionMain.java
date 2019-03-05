package com.java2.lambdaExpressions;

public class LA_AdditionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LA_AdditionOfTwoNumbers lambdaAddition = (int x, int y) -> x + y;
		System.out.println(lambdaAddition.add(12, 8));
	}

}
