package com.java2.tree;

public class MaximumElementInTree {

	public int maxInBinaryTree(BinaryTreeNode root){
		int maxValue = Integer.MIN_VALUE;
		if(root != null){
			int leftMax = maxInBinaryTree(root.left);
			int rightMax = maxInBinaryTree(root.right);
			
			if(leftMax > rightMax)
				maxValue = leftMax;
			else
				maxValue = rightMax;
			
			if(root.data > maxValue)
				maxValue = root.data;
		}
		
		return maxValue;
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
				
				System.out.println(new MaximumElementInTree().maxInBinaryTree(btn));
	}

}
