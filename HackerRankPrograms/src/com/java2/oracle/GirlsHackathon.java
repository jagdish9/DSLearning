package com.java2.oracle;

import java.util.Scanner;

public class GirlsHackathon {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int participant = scan.nextInt();
		int[] extraTime = new int[participant];
		int[] tmp = extraTime;
		for(int i = 0; i < participant; i++){
			extraTime[i] = scan.nextInt();
		}
		
		for(int j = 0 ; j < participant; j++){
			if(tmp[j] == 0){
				for(int k = j+1; k < participant; k++){
					tmp[k] = tmp[k]-1;
				}
			}
		}
		scan.close();

	}

}
