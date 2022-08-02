package com.bstreeusecases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBST {

	@Test
	public void given3NumbersWhenAddedToBSTShouldReturnSize3() {
		BSTUseCases<Integer> bst = new BSTUseCases<Integer>();
		Node<Integer> root = null;
		root = bst.insertNode(root, 56);
		root = bst.insertNode(root, 30);
		root = bst.insertNode(root, 70);
		int size = bst.getSize(root);
		assertEquals(3, size);
	}
}
