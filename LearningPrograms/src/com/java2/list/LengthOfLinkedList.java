package com.java2.list;

class Node{
	Node next;
	int data;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class LengthOfLinkedList {
	
	 Node head;
	
	//insert every node in front
	public void push(int new_data){
		Node newNode = new Node(new_data);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAtLast(int newNode){
		Node temp = head;
		Node newTempNode = new Node(newNode);
		while(temp != null){
			temp = temp.next;
		}
		temp = newTempNode;
	}
	
	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	//iterative count of Nodes
	public int noOfNodes(){
		Node temp = head;
		int c = 0;
		while(temp != null){
			temp = temp.next;
			c++;
		}

		return c;
	}
	
	/* Returns count of nodes in linked list (recursive mode)*/
    public int getCountRec(Node node) 
    { 
        // Base case 
        if (node == null) 
            return 0; 
  
        // Count is this node plus rest of the list 
        return 1 + getCountRec(node.next); 
    } 
  
    /* Wrapper over getCountRec() */
    public int getCount() 
    { 
        return getCountRec(head); 
    } 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LengthOfLinkedList ls = new LengthOfLinkedList();
		ls.push(50);
		ls.push(40);
		ls.push(30);
		ls.push(20);
		ls.push(10);
		
		ls.insertAtLast(45);
		
		ls.printList();
		
		System.out.println("\nNo of Nodes by iterative methods");
		System.out.println(ls.noOfNodes());
		
		System.out.println("No of Nodes by recursive methods");
		System.out.println(ls.getCount());
		
	}

}
