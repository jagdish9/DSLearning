package com.java2.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class RemoveDuplicateNodes {

	 static class SinglyLinkedListNode {
	        public int data;
	        public SinglyLinkedListNode next;

	        public SinglyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	        }
	    }

	    static class SinglyLinkedList {
	        public SinglyLinkedListNode head;
	        public SinglyLinkedListNode tail;

	        public SinglyLinkedList() {
	            this.head = null;
	            this.tail = null;
	        }

	        public void insertNode(int nodeData) {
	            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

	            if (this.head == null) {
	                this.head = node;
	            } else {
	                this.tail.next = node;
	            }

	           this.tail = node;
	        }
	    }

	    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
	        while (node != null) {
	            System.out.print(node.data);
	            node = node.next;
	        }
	    }

	    // Complete the removeDuplicates function below.

	   
	   /*  SinglyLinkedListNode {
	         int data;
	          SinglyLinkedListNode next;
	      }*/
	     
	     
	    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

	          SinglyLinkedListNode tmp = head;
	          while(tmp != null){
	              int data = tmp.data;
	              SinglyLinkedListNode itr = tmp.next;
	              while(itr != null){
	                  int itrData = itr.data;
	                  if(itrData == data){
	                      tmp.next = itr.next;
	                  }
	              }
	          }
	      return tmp;
	    }

	   
	    public static void main(String[] args) throws IOException {
	        Scanner scanner = new Scanner(System.in);

	        int t = scanner.nextInt();

	        for (int tItr = 0; tItr < t; tItr++) {
	            SinglyLinkedList llist = new SinglyLinkedList();

	            int llistCount = scanner.nextInt();

	            for (int i = 0; i < llistCount; i++) {
	                int llistItem = scanner.nextInt();

	                llist.insertNode(llistItem);
	            }

	            SinglyLinkedListNode llist1 = removeDuplicates(llist.head);

	            printSinglyLinkedList(llist1);
	        }

	        scanner.close();
	    }
}
