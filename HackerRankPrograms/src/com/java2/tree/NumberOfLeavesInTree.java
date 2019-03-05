package com.java2.tree;

import java.util.Queue;
import java.util.LinkedList;

public class NumberOfLeavesInTree {

	public int getNumberOfLeavesInTree(BinaryTreeNode root){
		if(root == null) return 0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		int count = 0;
		while(!q.isEmpty()){
			BinaryTreeNode currentNode = q.poll();
			if(currentNode.getLeft() == null && currentNode.getRight() == null)
				count++;
					
			if(currentNode.getLeft() != null)
				q.offer(currentNode.getLeft());
			
			if(currentNode.getRight() != null)
				q.offer(currentNode.getRight());
		}
		
		return count;
	}
	
	public int getNumberOfFullNodesInTree(BinaryTreeNode root){
		if(root == null) return 0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		int count = 0;
		while(!q.isEmpty()){
			BinaryTreeNode currentNode = q.poll();
			if(currentNode.getLeft() != null && currentNode.getRight() != null)
				count++;
					
			if(currentNode.getLeft() != null)
				q.offer(currentNode.getLeft());
			
			if(currentNode.getRight() != null)
				q.offer(currentNode.getRight());
		}
		
		return count;
	}
	
	public int getNumberOfNodeswithOnlyOneChild(BinaryTreeNode root){
		if(root == null) return 0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		int count = 0;
		while(!q.isEmpty()){
			BinaryTreeNode currentNode = q.poll();
			if(currentNode.getLeft() != null && currentNode.getRight() == null || currentNode.getLeft() == null && currentNode.getRight() != null)
				count++;
					
			if(currentNode.getLeft() != null)
				q.offer(currentNode.getLeft());
			
			if(currentNode.getRight() != null)
				q.offer(currentNode.getRight());
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//form the binary tree
		BinaryTreeNode btn = new BinaryTreeNode(1);
		btn.left = new BinaryTreeNode(2);
		btn.right = new BinaryTreeNode(3);
		btn.left.left = new BinaryTreeNode(4);
		btn.left.right = new BinaryTreeNode(5);
		btn.right.left = new BinaryTreeNode(6);
		btn.right.right = new BinaryTreeNode(7);
		btn.right.right.right = new BinaryTreeNode(8);
		
		System.out.println("Number Of leaves in Tree "+ new NumberOfLeavesInTree().getNumberOfLeavesInTree(btn));
		System.out.println("Number Of Full Nodes in Tree "+ new NumberOfLeavesInTree().getNumberOfFullNodesInTree(btn));
		System.out.println("Number Of Nodes with only one child "+ new NumberOfLeavesInTree().getNumberOfNodeswithOnlyOneChild(btn));
	}
}
