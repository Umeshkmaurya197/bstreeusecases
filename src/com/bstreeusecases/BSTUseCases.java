package com.bstreeusecases;

public class BSTUseCases<T extends Comparable<T>> {
	
	// insert Node in BST -uc1
	public Node<T> insertNode(Node<T> root, T val) {
		if (root == null) {
			root = new Node<T>(val);
			return root;
		}
		if (root.data.compareTo(val) > 0)
			root.left = insertNode(root.left, val);
		if (root.data.compareTo(val) < 0)
			root.right = insertNode(root.right, val);
		return root;
	}
	//inOrder
	public void inOrder(Node<T> root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		BSTUseCases<Integer> bstUseCases = new BSTUseCases<>();
		Node<Integer> root = null ;
		root = bstUseCases.insertNode(root, 56);
		root = bstUseCases.insertNode(root, 30);
		root = bstUseCases.insertNode(root, 70);
		bstUseCases.inOrder(root); // 30 56 70
		System.out.println(" ");
	}
}
