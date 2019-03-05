package com.java2.johnson;

public class LoopWithObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] obj = {"One", "Two", "Three"};
		for(String s : (String[])obj){
			System.out.print(s+".");
		}
	}
}
