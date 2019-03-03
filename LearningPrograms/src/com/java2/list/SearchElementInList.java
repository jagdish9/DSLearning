package com.java2.list;

public class SearchElementInList {

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
	
	//search element by iterative method
	public boolean isElementPresent(int searchData){
	
		Node current = head;
		while(current != null){
			if(searchData == current.data){
				return true;
			}
			current = current.next;
		}
		
		return false;
	}
	
	public boolean isElementPresentByRecursive(Node head, int searchedData){
		
		if(head == null)
			return false;
		
		if(head.data == searchedData){
			return true;
		}
		 
		return isElementPresentByRecursive(head.next, searchedData);
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SearchElementInList ls = new SearchElementInList();
		ls.push(50);
		ls.push(40);
		ls.push(30);
		ls.push(20);
		ls.push(10);
		
		ls.printList();
		
		System.out.println("\n"+ls.isElementPresent(30));
		System.out.println(ls.isElementPresent(60));
		
		System.out.println("Search element by recursive method");
		System.out.println(ls.isElementPresentByRecursive(ls.head, 50));
		System.out.println(ls.isElementPresentByRecursive(ls.head, 70));
		System.out.println(ls.isElementPresentByRecursive(ls.head, 20));
	}

}
