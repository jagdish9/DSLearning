package com.java2.list;

public class DetectLoopByFloydsCycle {

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
	
	public boolean detectLoop(){
		Node slow_p = head;
		Node fast_p = head;
		
		while(slow_p != null && fast_p != null && fast_p.next != null){
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if(slow_p == fast_p){
				System.out.println("\nFound loop ");
				return true;
			}
		}
		return false;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DetectLoopByFloydsCycle ls = new DetectLoopByFloydsCycle();
		ls.push(50);
		ls.push(40);
		ls.push(30);
		ls.push(20);
		ls.push(10);
		
		ls.printList();
		
		ls.head.next.next.next.next.next = ls.head;
		
		System.out.println(ls.detectLoop());
	}

}

/*Floyd’s Cycle-Finding Algorithm:
This is the fastest method. Traverse linked list using two pointers.  
Move one pointer by one and other pointer by two. 
If these pointers meet at same node then there is a loop.  
If pointers do not meet then linked list doesn’t have loop.*/
