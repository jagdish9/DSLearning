package com.java2.tree;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class LevelOrderTraversal {

	public List<ArrayList<Integer>> levelOrder(BinaryTreeNode root){
		List<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(root == null)
			return res;
		
		// Initialization
	   Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	   q.offer(root);
	   q.offer(null);
	   
	   ArrayList<Integer> curr = new ArrayList<Integer>();
	   while(!q.isEmpty()){
		   BinaryTreeNode tmp = q.poll();
		   if(tmp != null){
			   curr.add(tmp.data);
			   if(tmp.left != null)
				   q.offer(tmp.left);
			   if(tmp.right != null)
				   q.offer(tmp.right);
		   }
		   else{
			   ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
			   res.add(c_curr);
			   curr.clear(); // java will clear the reference, so have to new an ArrayList
			   
			   //completion of a level
			   if(!q.isEmpty())
				   q.offer(null);
		   }
	   }
	   
	   return res;
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
		
		List<ArrayList<Integer>> levelOrderResult = new LevelOrderTraversal().levelOrder(btn);
		System.out.println("Level Order Traversal");
		for(ArrayList<Integer> arrayList : levelOrderResult){
			for(Integer result : arrayList){
				System.out.print(result+" ");
			}
		}
	}

}

/*
 * visit the root
 * while traversing level 1, keep all the elements at level 1+1 in queue
 * Go to the next level and visit all the nodes at that level
 * Repeat this until all levels completed
 * */
