package com.java2.lambdaExpressions;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	StringLengthLambda sLengthLambda = (String s) -> s.length(); // this is correct
	//	StringLengthLambda sLengthLambda = (s) -> s.length();       // this is also correct
	//	StringLengthLambda sLengthLambda = s -> s.length();        // this is also correct
	//	System.out.println(sLengthLambda.getLength("Hello World!"));
		
		printStringLengthLambda(s -> s.length());
	}
	
	public static void printStringLengthLambda(StringLengthLambda sl){
		System.out.println(sl.getLength("Hello World!"));
	}

}

interface StringLengthLambda{
	int getLength(String s);
}
