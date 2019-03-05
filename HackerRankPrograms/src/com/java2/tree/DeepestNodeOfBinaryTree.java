package com.java2.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNodeOfBinaryTree {

	public BinaryTreeNode deepestNodeOfTree(BinaryTreeNode root){
		BinaryTreeNode tmp = null;
		if(root == null)
			return null;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		
		while(!q.isEmpty()){
			tmp = q.poll();
			if(tmp.getLeft() != null)
				q.offer(tmp.getLeft());
			
			if(tmp.getRight() != null)
				q.offer(tmp.getRight());
				
		}
		
		return tmp;
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
				btn.right.right.right.right = new BinaryTreeNode(9);
				
				System.out.println("Deepest Node of Binary Tree "+ new DeepestNodeOfBinaryTree().deepestNodeOfTree(btn).getData());
	}

}
