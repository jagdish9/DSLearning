package com.java2.withImranDiscussion;

import java.util.Scanner;

public class ParseIntImplementation {

	public boolean parseIntConversion(String input){
		for(char ch ='a'; ch<='z'; ch++){
			for(int i = 0; i < input.length(); i++){
				if(input.charAt(i) == ch) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to convert into integer:");
		String inputStr = scan.nextLine();
		boolean flag = new ParseIntImplementation().parseIntConversion(inputStr);
		if(flag)
		   System.out.println("String conversion is successsful.");
		else
			System.out.println("Passed string contains character between [a-zA-Z] OR special characters.");
		scan.close();
	}

}
