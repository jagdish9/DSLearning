package com.java2.accolite;

public class LargestSumOfContagiousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2, 3, 6, 7, 8, 13, 14, 16, 18, 6};
		int intermediateValue = 0;
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			int value = arr[i];
			for(int j = i+1; j < arr.length; j++){
				value = value + arr[j];
				if(value > intermediateValue)
					intermediateValue = value;
			}
			if(value > sum)
				sum = value;
		}
		
		int largestSum = 0;
		if(sum > intermediateValue)
			largestSum = sum;
		else
			largestSum = intermediateValue;
		
		System.out.println(largestSum);
	}

}
