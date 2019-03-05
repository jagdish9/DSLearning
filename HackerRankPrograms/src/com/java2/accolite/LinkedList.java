package com.java2.accolite;

import java.util.HashSet;

public class LinkedList {

	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	//Inserts new node at the front of the list
	public void insertAtTheFirst(int data){
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	//check list is cyclic or not
	private static boolean detectLoop(Node h){
		HashSet<Node> s = new HashSet<Node>();
		while(h != null){
			
			if(s.contains(h))
				return true;
			
			s.add(h);
			
			h = h.next;
		}
		
		return false;
	}
	
	private static void printList(){
	    Node tmp = head;
	    while(tmp != null){
	    	System.out.print(tmp.data+" ");
	    	tmp = tmp.next;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ls = new LinkedList();
		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		head.next.next.next.next = head.next;
		
		//head.next.next.next.next = new Node(50);
		
		if(detectLoop(head))
			System.out.println("list is cyclic");
		else
			System.out.println("list is not cyclic");
		
		printList();
	}

}
