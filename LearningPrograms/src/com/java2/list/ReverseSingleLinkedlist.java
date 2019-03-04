package com.java2.list;

public class ReverseSingleLinkedlist {

	IntegerNode head;
	
	public void insertAtLast(int data){
		IntegerNode newNode = new IntegerNode(data);
		
		if(head == null){
			head = new IntegerNode(data);
			return;
		}
		
		IntegerNode last = head;
		
		while(last.next != null){
			last = last.next;
		}
		
		last.next = newNode;
		return;
	}
	
	public void printList(){
		IntegerNode tmp = head;
		while(tmp != null){
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
	}
	
	public void reverseList(){
		IntegerNode current = head;
		IntegerNode prev = null;
		IntegerNode next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseSingleLinkedlist ls = new ReverseSingleLinkedlist();
		ls.insertAtLast(12);
		ls.insertAtLast(56);
		ls.insertAtLast(35);
		ls.insertAtLast(90);
		ls.insertAtLast(51);
		ls.insertAtLast(20);
		
		ls.printList();
		System.out.println("\nReverse the list");
		ls.reverseList();
		ls.printList();
	}

}
