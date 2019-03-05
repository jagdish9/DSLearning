package com.java2.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLeveleOrderLeftToRight {

	private static void levelOrderTraversalReverse(BinaryTreeNode root){
		
		if(root == null)
			return;
		
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		
		queue.offer(root);
		
		while(!queue.isEmpty()){
			BinaryTreeNode tmp = queue.poll();
			
			if(tmp.getRight() != null)
				queue.offer(tmp.getRight());
			
			if(tmp.getLeft() != null)
				queue.offer(tmp.getLeft());
			
			stack.push(tmp);
		}
		
		while(!stack.isEmpty())
			System.out.print(stack.pop().getData()+" ");
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
		
		levelOrderTraversalReverse(btn);
	}

}/*
1
/  \
2    3
/ \  / \
4   5 6  7

This is revrese level order traversal from left to right
output : 4 5 6 7 2 3 1
*/

