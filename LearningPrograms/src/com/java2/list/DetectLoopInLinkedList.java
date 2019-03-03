package com.java2.list;

import java.util.HashSet;

public class DetectLoopInLinkedList {

    Node head;
	
	public void push(int new_data){
		Node newNode = new Node(new_data);
		newNode.next = head;
		head = newNode;
	}
	
	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public boolean detectLoop(Node searchedNode){
		HashSet<Node> set = new HashSet<Node>();
		
		while(searchedNode != null){
		if(set.contains(searchedNode))
			return true;
		
		  set.add(searchedNode);
		  
		  searchedNode = searchedNode.next;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DetectLoopInLinkedList ls = new DetectLoopInLinkedList();
		ls.push(50);
		ls.push(40);
		ls.push(30);
		ls.push(20);
		ls.push(10);
		
		ls.printList();
		
		ls.head.next.next.next.next.next = ls.head;
		
		System.out.println("\nLoop Found: "+ls.detectLoop(ls.head));
	}

}
