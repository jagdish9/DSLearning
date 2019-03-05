package com.java2.tree;

public class DepthOfBinaryTree {

	public int maxDepthOfBinaryTree(BinaryTreeNode root){
		if(root == null)
			return 0;
		
		int leftDepth = maxDepthOfBinaryTree(root.left);
		int rightDepth = maxDepthOfBinaryTree(root.right);
		return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
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
		
		System.out.println("Max Depth of Binary Tree "+ new DepthOfBinaryTree().maxDepthOfBinaryTree(btn));
	}

}
