package com.java2.list;

import java.util.HashSet;

public class RemoveDuplicatesFromUnsortedLinkedlist {

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
	
	public void removeDuplicatesByTwoLoops(){
		 IntegerNode ptr1 = null;
		 IntegerNode ptr2 = null, dup = null; 
	        ptr1 = head; 
	  
	        /* Pick elements one by one */
	        while (ptr1 != null && ptr1.next != null) { 
	            ptr2 = ptr1; 
	  
	            /* Compare the picked element with rest 
	                of the elements */
	            while (ptr2.next != null) { 
	  
	                /* If duplicate then delete it */
	                if (ptr1.data == ptr2.next.data) { 
	  
	                    /* sequence of steps is important here */
	                    dup = ptr2.next; 
	                    ptr2.next = ptr2.next.next; 
	                    System.gc(); 
	                } else /* This is tricky */ { 
	                    ptr2 = ptr2.next; 
	                } 
	            } 
	            ptr1 = ptr1.next; 
	        } 
	}
	
	public void removeDuplicatesByHashing(){
		HashSet<Integer> set = new HashSet<Integer>();
		IntegerNode current = head;
		IntegerNode prev = null;
		while(current != null){
			if(set.contains(current.data)){
				prev.next = current.next;
			}else{
				set.add(current.data);
				prev = current;
			}
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDuplicatesFromUnsortedLinkedlist ls = new RemoveDuplicatesFromUnsortedLinkedlist();
		ls.insertAtLast(12);
		ls.insertAtLast(11);
		ls.insertAtLast(12);
		ls.insertAtLast(21);
		ls.insertAtLast(41);
		ls.insertAtLast(43);
		ls.insertAtLast(21);
		
		ls.printList();
		
		ls.removeDuplicatesByTwoLoops();
		ls.removeDuplicatesByHashing();
		System.out.println("\nAfter removing duplicates");
		ls.printList();
		
	}

}
