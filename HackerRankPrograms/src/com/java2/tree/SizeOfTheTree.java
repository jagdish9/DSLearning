package com.java2.tree;

public class SizeOfTheTree {

	public int size(BinaryTreeNode root){
		int leftCount = root.left == null ? 0 : size(root.left);
		int rightCount = root.right == null ? 0 : size(root.right);
		return 1 + leftCount + rightCount; 
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
		
		System.out.println("Size of the tree is: "+ new SizeOfTheTree().size(btn));
	}

}
