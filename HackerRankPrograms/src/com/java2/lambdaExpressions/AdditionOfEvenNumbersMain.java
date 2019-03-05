package com.java2.lambdaExpressions;

import java.util.Scanner;

public class AdditionOfEvenNumbersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size.");
		int aSize = scan.nextInt();
		int[] arr = new int[aSize];
		System.out.println("Enter array values.");
		for(int i = 0; i < aSize; i++){
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		SumOfEvenNumbers sumResults = (int[] ar) -> {
			int sum = 0;
			for(int j = 0; j < ar.length; j++){
				if(ar[j] % 2 == 0){
					sum = sum + ar[j];
				}
			}
			return sum;
		};
		
		System.out.println(sumResults.sum(arr)/3);
	}

}

interface SumOfEvenNumbers{
	public int sum(int[] arr);
}
