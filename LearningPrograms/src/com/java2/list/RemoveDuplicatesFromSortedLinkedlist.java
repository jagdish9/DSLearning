package com.java2.list;

class IntegerNode{

	IntegerNode next;
	int data;
	
	public IntegerNode(int data){
		this.data = data;
		this.next = null;
	}
}

public class RemoveDuplicatesFromSortedLinkedlist {

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
	
	public void removeDuplicates(){
		IntegerNode current = head;
		while(current.next != null){
			if(current.data == current.next.data){
				IntegerNode next_node = current.next.next;
				current.next = null;
				current.next = next_node;
			}
			else {
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDuplicatesFromSortedLinkedlist list = new RemoveDuplicatesFromSortedLinkedlist();
		list.insertAtLast(11);
		list.insertAtLast(11);
		list.insertAtLast(11);
		list.insertAtLast(21);
		list.insertAtLast(43);
		list.insertAtLast(43);
		list.insertAtLast(60);
		
		list.printList();
		
		list.removeDuplicates();
		System.out.println("\nAfter removing duplicates");
		list.printList();
	}

}
