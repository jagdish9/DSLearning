package com.java.apap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] arr = {2, 7, 11, 15};
		int target = 25;
		int index1 = 0, index2 = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i]+arr[j] == target){
					index1 = i+1;
					index2 = j+1;
					break;
				}
			}
		}
		System.out.println("Index1= "+index1+" | Index2= "+index2);
	}

}
