package com.java2.oracle;

/* IMPORTANT: Multiple classes and nested static classes are supported */


//import for Scanner and other utility classes
import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class ChallengingTrack3WithLong {
  

    private static long[] getShrinkArray(long[] intArr, long elem){
    	long[] newArr = null;

        for(int i = 0; i < intArr.length; i++){
            if(intArr[i] == elem){
               newArr = new long[intArr.length - 1];
               for(int index = 0; index < i; index++){
                   newArr[index] = intArr[index];
               }
               for(int j = i; j < intArr.length - 1; j++){
                   newArr[j] = intArr[j+1];
               }
               break;
            }
        }
        
        return newArr;
    }
	
    public static void main(String args[] ) throws Exception {
    	Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int z = 0; z < T; z++){
     	    long N = scan.nextLong();
            long P = scan.nextLong();
            scan.nextLine();
            long[] heightOfHardles = new long[(int) N];
            for(int i = 0; i < heightOfHardles.length; i++){
                heightOfHardles[i] = scan.nextInt();
            }
                 for(int j = 0; j < N; j++){
                     P = P - heightOfHardles[0];
                     if(P > 0){
                     heightOfHardles = getShrinkArray(heightOfHardles, heightOfHardles[0]);
                     for(int t = 0; t < heightOfHardles.length; t++){
                         if(j % 2 == 0 && heightOfHardles[t] % 2 == 0 || j == 0  && heightOfHardles[t] % 2 == 0){
                             heightOfHardles[t] = heightOfHardles[t] - 1;
                         }else if(j % 2 != 0 && heightOfHardles[t] % 2 != 0){
                             heightOfHardles[t] = heightOfHardles[t] - 1;
                         }
                       }
                     }
                 }
             if(P >= 0) System.out.println("Yes"+" "+P);
             else System.out.println("No");
        }
        
        scan.close();
    }
}

