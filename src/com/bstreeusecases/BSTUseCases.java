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

	// inOrder
	public void inOrder(Node<T> root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	// preOrder
	public void preOrder(Node<T> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		inOrder(root.left);
		inOrder(root.right);
	}

	// postOrder
	public void postOrder(Node<T> root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.data + " ");
	}

	// get size of BST -uc2
	public int getSize(Node<T> root) {
		return getSizeRecursively(root);
	}

	private int getSizeRecursively(Node<T> root) {
		return root == null ? 0 : (1 + getSizeRecursively(root.left) + getSizeRecursively(root.right));
	}

	// searchNode in BST -uc3
	public boolean searchNode(Node<T> root, T val) {
		if (root == null) {
			return true;
		}
		if (root.data.compareTo(val) < 0)
			return searchNode(root.left, val);
		else if (root.data.compareTo(val) == 0)
			return true;
		else if (root.data.compareTo(val) > 0)
			return searchNode(root.right, val);
		return false;
	}

	public static void main(String[] args) {
		BSTUseCases<Integer> bstUseCases = new BSTUseCases<>();
		Node<Integer> root = null;
		root = bstUseCases.insertNode(root, 56);
		root = bstUseCases.insertNode(root, 30);
		root = bstUseCases.insertNode(root, 70);
		root = bstUseCases.insertNode(root, 22);
		root = bstUseCases.insertNode(root, 40);
		root = bstUseCases.insertNode(root, 60);
		root = bstUseCases.insertNode(root, 95);
		root = bstUseCases.insertNode(root, 11);
		root = bstUseCases.insertNode(root, 65);
		root = bstUseCases.insertNode(root, 3);
		root = bstUseCases.insertNode(root, 16);
		root = bstUseCases.insertNode(root, 63);
		root = bstUseCases.insertNode(root, 67);
		System.out.print("InOrder BST :");
		bstUseCases.inOrder(root); // InOrder BST : 3 11 16 22 30 40 56 60 63 65 67 70 95
		System.out.println(" ");
		System.out.print("PreOrder BST : ");
		bstUseCases.preOrder(root); // PreOrder BST : 56 3 11 16 22 30 40 60 63 65 67 70 95
		System.out.println(" ");
		System.out.print("PostOrder BST :");
		bstUseCases.postOrder(root); // PostOrder BST :3 11 16 22 30 40 60 63 65 67 70 95 56
		System.out.println(" ");
		System.out.println("Size of BST : " + bstUseCases.getSize(root)); // 13
		System.out.println("Searching for element 63 : " + bstUseCases.searchNode(root, 63)); //true
	}
}
