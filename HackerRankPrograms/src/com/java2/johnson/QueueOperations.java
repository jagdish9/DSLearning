package com.java2.johnson;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(3);
		q.add(2);
		q.add(1);
		
		System.out.print(q.poll());
		System.out.print(q.peek());
		System.out.print(q.peek());
	}

}
