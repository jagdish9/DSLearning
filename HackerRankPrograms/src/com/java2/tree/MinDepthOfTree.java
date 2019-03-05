package com.java2.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepthOfTree {

	public int minDepthTree(BinaryTreeNode root){
		if(root == null) return 0;
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		queue.offer(null);
		int count = 0;
		
		while(!queue.isEmpty()){
			BinaryTreeNode currentNode = queue.poll();
			if(currentNode != null){
				if(currentNode.left == null && currentNode.right == null){
					return count;
				}
				
				if(currentNode.left != null)
					queue.offer(currentNode.left);
				
				if(currentNode.right != null)
					queue.offer(currentNode.right);
			}
			else{
				if(!queue.isEmpty()){
					count++;
					queue.offer(null);
				}
			}
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
				
				System.out.println("Min Depth of Tree "+ new MinDepthOfTree().minDepthTree(btn));
				
				
	}

}
