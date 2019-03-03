package com.java2.list;

import java.util.Stack;

class StringLinkedList{
	
	StringLinkedList next;
	String data;
	
	StringLinkedList(String data){
		this.data = data;
		this.next = null;
	}
	
}

public class CheckSingleListPalindrome {

   StringLinkedList head;
	
	public void insertAtLast(String data){
		StringLinkedList newNode = new StringLinkedList(data);
		if(head == null){
			head = new StringLinkedList(data);
			return;
		}
		
		StringLinkedList last = head;
		while(last.next != null){
			last = last.next;
		}
		
		last.next = newNode;
		return;
	}
	
	public void printList(){
		StringLinkedList st = head;
		while(st != null){
			System.out.print(st.data+" ");
			st = st.next;
		}
	}
	
	public boolean isGivenListIsPalindromeUsingStack(StringLinkedList node){
		Stack<String> _stack = new Stack<String>();
		StringLinkedList visit1 = node;
		while(visit1 != null){
			_stack.push(visit1.data);
			visit1 = visit1.next;
		}
		
		StringLinkedList visit2 = node;
		while(visit2 != null){
			if(!visit2.data.equals(_stack.pop())){
				return false;
			}
			visit2 = visit2.next;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckSingleListPalindrome sl = new CheckSingleListPalindrome();
		sl.insertAtLast("R");
		sl.insertAtLast("A");
		sl.insertAtLast("D");
		sl.insertAtLast("A");
		sl.insertAtLast("R");
		//sl.insertAtLast("Z");
		
		sl.printList();
		
		System.out.println("\nLinked list is palindrome: "+sl.isGivenListIsPalindromeUsingStack(sl.head));
	}

}
