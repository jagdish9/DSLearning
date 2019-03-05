package com.java2.linkedlist;
import com.java2.linkedlist.Linkedlist;

public class LinkedListOperations {

	public static Linkedlist head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		head = new Linkedlist(10);
		head.next = new Linkedlist(20);
		
		printList();
		
		System.out.println("Inserted at the beginning");
		insertAtBegin(new Linkedlist(30));
		printList();
		
		System.out.println("Inserted at the last");
		insertAtLast(new Linkedlist(40));
		printList();
		
		System.out.println("Inserted at the given position");
		insertAtGivenPosition(new Linkedlist(35), 3);
		printList();
		
		System.out.println("Reverse the list");
		reverseList();
		printList();
		
		System.out.println("Delete first node");
		deleteFirstNode();
		printList();
		
		System.out.println("Delete last node");
		deleteLastNode();
		printList();
		
		System.out.println("New list");
		insertAtLast(new Linkedlist(60));
		insertAtLast(new Linkedlist(70));
		printList();
		
		System.out.println("Delete node from the given position");
		deleteNodeFromTheGivenPosition(3);
		printList();
	}
	
	public static void printList(){
		Linkedlist tmp = head;
		while(tmp != null){
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
		System.out.println();
	}

	// insert at the beginning
	public static void insertAtBegin(Linkedlist node){
		node.next = head;
		head = node;
	}
	
	//insert at the last
	public static void insertAtLast(Linkedlist node){
		Linkedlist tmp = head;
		while(tmp.next != null){
			tmp = tmp.next;
		}
		
		tmp.next = node; 
	}
	
	//insert at the given position/at the middle
	public static void insertAtGivenPosition(Linkedlist node, int position){
		Linkedlist tmp = head;
		int count = 1;
		
		while(tmp != null && count < position){
			tmp = tmp.next;
			count++;
		}
		
		node.next = tmp.next;
		tmp.next = node;
	}
	
	//reverse the linked list
	public static void reverseList(){
		Linkedlist tmp = head;
		Linkedlist prev = null;
		Linkedlist current = tmp;
		Linkedlist next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = prev;
	}
	
	//delete first node
	public static void deleteFirstNode(){
	      Linkedlist tmp = head;
	      head = head.next;
	      tmp = null;
	}
	
	//delete last node
	public static void deleteLastNode(){
		Linkedlist tmp = head;
		Linkedlist prev = null;
		while(tmp.next != null){
			prev = tmp;
			tmp = tmp.next;
		}
		
		prev.next = null;
		tmp = null;
		
	}
	
	//delete node from the given position
	public static void deleteNodeFromTheGivenPosition(int position){
		Linkedlist tmp = head;
		Linkedlist prev = null;
		int count = 1;
		while(tmp != null && count != position){
			prev = tmp;
			tmp = tmp.next;
			count++;
		}
		
		prev.next = tmp.next;
		tmp = null;
	}
	
}
