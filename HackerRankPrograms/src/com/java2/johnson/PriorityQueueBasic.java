package com.java2.johnson;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q = new PriorityQueue<String>();
		q.add("Zoro");
		q.add("Simba");
		q.add("Aamir");
		q.add("Horse");
		q.add("Bemetra");
		q.add("Sandeep");
		q.add("Mithun");
		q.add("Zainendra");
		q.add("James. Gosling");
		q.add("_Ramjane");
		q.add("01_Sanam");
		
		for(String str : q){
			System.out.print("'"+str+"' ");
		}
		
		System.out.println();
		System.out.println("--- After Sorting ---");
		Arrays.sort(q.toArray());
		for(String str : q){
			System.out.print("'"+str+"' ");
		}
		
		System.out.println();
		System.out.println("Peek() "+q.peek());
		System.out.println("Element() "+q.element());
		
		System.out.println();
		while(!q.isEmpty())
			System.out.print(q.poll()+" ");
		
		q.add("Zoro");
		q.add("Simba");
		q.add("Aamir");
		q.add("Horse");
		q.add("Bemetra");
		q.add("Sandeep");
		q.add("Mithun");
		q.add("Zainendra");
		q.add("James. Gosling");
		q.add("_Ramjane");
		q.add("01_Sanam");
		
		System.out.println();
		while(!q.isEmpty()){
			System.out.println(q);
			System.out.println("Removed: "+q.poll());
			//System.out.println(q);
		}
	}

}
