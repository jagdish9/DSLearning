package com.java2.tree;

public class SearchElementInBinaryTree {

	public boolean findInBinaryTree(BinaryTreeNode root, int searchData){
		if(root ==null)
			return false;
		if(root.getData() == searchData)
			return true;
		
		return findInBinaryTree(root.getLeft(), searchData) || findInBinaryTree(root.getRight(), searchData);
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
				
				System.out.println(new SearchElementInBinaryTree().findInBinaryTree(btn, 7));
	}

}
