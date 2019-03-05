package com.java2.oracle;

import java.util.Scanner;

public class NitikProblem {

	private static void toGetTheMaximumScore(int N, int A, int B, int X, int Y, int P, int Q){
		int GreaterMarks = 0;
		int lesserMarks = 0;
		int easyCount = 0;
		int totalMaximumMarks = 0;
		int maximumMarks = 0;
		if(A > B){
			GreaterMarks = A;
			lesserMarks = B;
		}else{
			GreaterMarks = B;
			lesserMarks = A;
		}
		
		for(int i = 1; i <= GreaterMarks; i++){
			easyCount++;
			if(A > B) maximumMarks = maximumMarks + X;
			else maximumMarks = maximumMarks + Y;
			int hardCount = 0;
			for(int j = 1; j <= lesserMarks; j++){
				hardCount++;
				if(A > B) maximumMarks = maximumMarks + Y;
				else maximumMarks = maximumMarks + X;
				if(maximumMarks > totalMaximumMarks){
					totalMaximumMarks = maximumMarks;
					int easyTimeTaken = 0;
					int hardTimeTaken = 0;
					if(A > B){
						easyTimeTaken = P * easyCount;
						hardTimeTaken = Q * hardCount;
					}else{
						easyTimeTaken = Q * easyCount;
						hardTimeTaken = P * hardCount;
					}
					if(N == easyTimeTaken + hardTimeTaken){
						System.out.println("Easy questions "+easyCount+" "+ "Hard Questions "+hardCount);
					}
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total time in minutes");
		int totalTime = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter marks for each questions");
		String str1 = scan.nextLine();
		String[] splitString1 = str1.split(" ");
		String easyMarks = splitString1[0];
		String hardMarks = splitString1[1];
		
		System.out.println("Enter no. of questions");
		String str2 = scan.nextLine();
		String[] splitString2 = str2.split(" ");
		String easyQuestion = splitString2[0];
		String hardQuestion = splitString2[1];
		
		System.out.println("Enter times for easy and hard questions respectively");
		String str3 = scan.nextLine();
		String[] splitString3 = str3.split(" ");
		String easyQuestionTimeTaken = splitString3[0];
		String hardQuestionTimeTaken = splitString3[1];
		
		toGetTheMaximumScore(totalTime, Integer.parseInt(easyMarks),Integer.parseInt(hardMarks),Integer.parseInt(easyQuestion),
				Integer.parseInt(hardQuestion),Integer.parseInt(easyQuestionTimeTaken),Integer.parseInt(hardQuestionTimeTaken));
		scan.close();
	}

}
