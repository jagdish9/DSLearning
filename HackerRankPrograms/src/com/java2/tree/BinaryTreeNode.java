package com.java2.tree;

public class BinaryTreeNode {

	public int data;
	public BinaryTreeNode left, right;
	
	public BinaryTreeNode(int data){
		this.data = data;
		left = null;
		right = null;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return data;
	}
	
	public void setLeft(BinaryTreeNode left){
		this.left = left;
	}
	
	public BinaryTreeNode getLeft(){
		return left;
	}
	
	public void setRight(BinaryTreeNode right){
		this.right = right;
	}
	
	public BinaryTreeNode getRight(){
		return right;
	}
}
