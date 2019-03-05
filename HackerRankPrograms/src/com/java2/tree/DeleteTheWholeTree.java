package com.java2.tree;

public class DeleteTheWholeTree {

	private static void deleteBinaryTree(BinaryTreeNode root){
		root = null;  // In Java, it will taken care by garbage collector
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
		
		deleteBinaryTree(btn);
		
		System.out.println("Tree deleted successfully");
	}

}

//For deleting any tree we will use post order traversal because first it will children then parent
