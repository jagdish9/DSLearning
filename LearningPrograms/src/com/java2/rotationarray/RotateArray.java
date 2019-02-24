package com.java2.rotationarray;

public class RotateArray {

	public void leftRotate(int[] arr, int d, int n){
		for(int i = 0; i < d; i++){
			leftRotateByOne(arr, n);
		}
	}
	
	public void leftRotateByOne(int[] arr, int n){
	       int i, temp;
	       temp = arr[0];
	       for(i = 0; i < n - 1; i++){
	    	   arr[i] = arr[i+1];
	       }
	       arr[i] = temp;
	}
	
	public void printArray(int[] arr){
		System.out.println("Rotational Array");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RotateArray rotate = new RotateArray();
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		rotate.leftRotate(arr, 4, arr.length);
		rotate.printArray(arr);
	}

}
