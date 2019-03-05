package com.java2.linkedlist;

public class ReverseLinkedList {

	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	private Node reverse(Node head){
	    Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = prev;
		return head;
	}
	
	private void printList(Node head){
	       while(head != null){
	    	   System.out.print(head.data+" ");
	    	   head = head.next;
	       }
	}
	
	public static void main(String[] args){
		ReverseLinkedList ls = new ReverseLinkedList();
		ls.head = new Node(14);
		ls.head.next = new Node(28);
		ls.head.next.next = new Node(42);
		ls.head.next.next.next = new Node(54);
		
		System.out.println("Linked List");
		ls.printList(head);
		
		System.out.println();
		System.out.println("Reverse Linked List");
		head = ls.reverse(head);
		ls.printList(head);
	}
}
