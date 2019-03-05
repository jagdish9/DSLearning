package com.java2.tree;

public class TreeTraversal {

	public void preOrderTraversal(BinaryTreeNode root){
		if(root != null){
			System.out.print(root.data+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
    public void inOrderTraversal(BinaryTreeNode root){
		if(root != null){
			inOrderTraversal(root.left);
			System.out.print(root.data+" ");
			inOrderTraversal(root.right);
		}
	}

    public void postOrderTraversal(BinaryTreeNode root){
		if(root != null){
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data+" ");
		}
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
		
		TreeTraversal ttr = new TreeTraversal();
		System.out.println("Pre Order Traversal: ");
		ttr.preOrderTraversal(btn);
		System.out.println("In Order Traversal: ");
		ttr.inOrderTraversal(btn);
		System.out.println("Post Order Traversal: ");
		ttr.postOrderTraversal(btn);
	}

}
