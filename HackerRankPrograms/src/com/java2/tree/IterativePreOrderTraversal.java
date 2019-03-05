package com.java2.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreOrderTraversal {

	public List<Integer> preOrderTraversal(BinaryTreeNode root){
	        List<Integer>	res = new ArrayList<Integer>();
	        if(root == null)
	        	return res;
	        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
	        s.push(root);
	        while(!s.isEmpty()){
	        	BinaryTreeNode temp = s.pop();
	        	res.add(temp.data);
	        	
	        	if(temp.right !=null);
	        		s.push(temp.right);
	        	if(temp.left != null)
	        		s.push(temp.left);
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
				
				List<Integer> preOrderResult = new IterativePreOrderTraversal().preOrderTraversal(btn);
				System.out.println("Pre Order Traversal by iterative");
				for(Integer result : preOrderResult){
					System.out.print(result+" ");
				}
	}

}
