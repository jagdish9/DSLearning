package com.java2.oracle;

/* IMPORTANT: Multiple classes and nested static classes are supported */


//import for Scanner and other utility classes
import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class ChallengingTrack {
  

    private static Integer[] getShrinkArray(int index, Integer[] a, int element){
        if (index >= 0) {
 
			Integer b[] = new Integer[a.length - 1];
			System.arraycopy(a, 0, b, 0, element - 1);
			System.arraycopy(a, element, b, element - 1, a.length - element);
 
			a = new Integer[b.length];
			System.arraycopy(b, 0, a, 0, a.length);
        }
		return a;
    }
    
    private static int findIndexOfElement(Integer[] a, int element) {
		for (int j = 0; j < a.length; j++)
			for (int i = 0; i < a.length; i++) {
				if (a[i] == element) {
					return i;
				}
			}
		return -1;
	}
	
    public static void main(String args[] ) throws Exception {
       Scanner scan = new Scanner(System.in);
       int T = scan.nextInt();
       scan.nextLine();
       int N = scan.nextInt();
       int P = scan.nextInt();
       scan.nextLine();
       Integer[] heightOfHardles = new Integer[N];
       for(int i = 0; i < heightOfHardles.length; i++){
           heightOfHardles[i] = scan.nextInt();
       }
       for(int l = 0; l < T; l++){
            for(int k = 0; k < N; k++){
            for(int j = 0; j < heightOfHardles.length; j++){
                P = P - heightOfHardles[k];
                int index = findIndexOfElement(heightOfHardles, heightOfHardles[k]);
                heightOfHardles = getShrinkArray(index, heightOfHardles, k+1);
                if(j == 0 || j % 2 == 0){
                    heightOfHardles[j] = heightOfHardles[j] - 1;
                }else{
                    heightOfHardles[j] = heightOfHardles[j] - 1;
                }
            }
        }
        if(P == 0) System.out.println("Yes"+" "+P);
        else System.out.println("No");
       }
       scan.close();
    }
}

