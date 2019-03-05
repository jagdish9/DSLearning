package com.java2.filesComparision;

import java.util.Scanner;

public class Test2 {

	public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); 
        String[] splt = str.split(" ");
        int[] arr = new int[splt.length];
        for(int a = 0; a < splt.length; a++){
            arr[a] = Integer.parseInt(splt[a]);
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[j] < arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            for(int k = 0; k < arr.length; k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
	}
}
