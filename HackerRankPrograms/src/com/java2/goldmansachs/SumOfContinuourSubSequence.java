package com.java2.goldmansachs;

import java.util.ArrayList;
import java.util.List;

public class SumOfContinuourSubSequence {

	  static int countSubSequence(List<Integer> inputSeq, int targetSum) {

          int[] arr = new int[inputSeq.size()];
          int i = 0;
           for(Integer insq : inputSeq){
               arr[i] = insq;
               i++;
           }

          i = 0;
           /*for(int j = 0; j < arr.length; j++){
               for(int k = j+1; k < arr.length; k++){
                   if (arr[j] + arr[k] == targetSum){
                       i++;
                   }
               }
               if(j == arr.length - 1){
                   if(arr[arr.length-1] == targetSum) i++;
               }
           }*/
          
          /*for(int j = 0; j < arr.length; j++){
              if(j == arr.length-1){
                  if(arr[j] == targetSum) i++;
              }
              else{
                  if (arr[j] + arr[j + 1] == targetSum) i++;
              }
          }*/
          
          /*for(int j = 0; j < arr.length; j++){
                 if(j != arr.length - 1) {
                	 if (arr[j] + arr[j + 1] == targetSum) i++;
                 }
          }*/
          
          int len = arr.length;
          for(int j = 0; j < len; j++){
                 if(j != arr.length - 1) {
                  if (arr[j] + arr[j + 1] == targetSum) i++;
              }
              if(arr[j] == targetSum){
                  i++;
              }
          }
           return i;
  }
	  
	  public static int requiredAmountAtStart(List<Integer> netSaving) {

          int[] arr = new int[netSaving.size()];
          int i = 0;
          for(Integer nS : netSaving){
              arr[i] = nS;
              i++;
          }

         i = 0;
          for(int j = 0; j < arr.length; j++){
            i = i + arr[j];
          }
          for(int k = 0; k < arr.length; k++){
              if(arr[k] < 0){
                  i = i + arr[k];
              }
          }

          return i;
   }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(2);
		ls.add(4);
		ls.add(1);
		ls.add(5);
		ls.add(6);
		//System.out.println(countSubSequence(ls, 6));
		
		List<Integer> ls1 = new ArrayList<Integer>();
		ls1.add(4); ls1.add(2); ls1.add(-3);
		System.out.println(requiredAmountAtStart(ls1));
	}

}
