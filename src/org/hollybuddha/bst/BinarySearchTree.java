package org.hollybuddha.bst;

import java.util.Objects;

public class BinarySearchTree {

	public Node root;

	public BinarySearchTree insert(int Value) {
		Node node = new Node<>(Value);
		// No Root node available so added it to root
		if (root == null) {
			root = node;
			return this;
		}

		insertRec(root, node);
		return this;

	}

	private void insertRec(Node lattestRoot, Node node) {

		if (lattestRoot.Value > node.Value) {
			// node should be in the left side

			if ( lattestRoot.left == null) {
				// / Root node without left node so insert
				lattestRoot.left = node;
				return;
			} else {
				// Alread there is a node in the left.
				// so let is get added in the next node
				insertRec(lattestRoot.left, node);
			}
		} else { // / Value is larger than the node so right side
			if (lattestRoot.right == null) {
				// Simple if not avalable then add and return;
				lattestRoot.right = node;
				return;
			} else {
				// resursive
				insertRec(lattestRoot.right, node);

			}

		}
	}

	public int findMinimum() {
		// As per BST the minimum value should be in the extreme left.
		if (root == null) {
			return 0;
		}
		Node curNode = root;
		while (curNode.left != null) {
			curNode = curNode.left;
		}
		return curNode.Value;
	}

	public int findMaximum() {
		// As per BST the maximum value should be in the extreme right.
		if (root == null) {
			return 0;
		}
		Node curNode = root;
		while (curNode.right != null) {
			curNode = curNode.right;
		}
		return curNode.Value;
	}

	public void printInorder() {
		System.out.println("Print Inorder Traverse");
		printInorderRec(root);
		System.out.println("");
	}

	private void printInorderRec(Node curRoot) {
		if (curRoot == null) {
			return;
		}
		printInorderRec(curRoot.left);
		System.out.print(curRoot.Value + " , ");
		printInorderRec(curRoot.right);

	}

	public void printPreorder() {
		System.out.println("Print Inorder Traverse");
		printPreorderRec(root);
		System.out.println("");
	}

	private void printPreorderRec(Node curRoot) {
		if (curRoot == null) {
			return;
		}
		System.out.print(curRoot.Value + " , ");
		printInorderRec(curRoot.left);
		printInorderRec(curRoot.right);

	}

	public void printPostorder() {
		System.out.println("Print Postorder Traverse");
		printPostorderRec(root);
		System.out.println("");
	}

	private void printPostorderRec(Node curRoot) {
		if (curRoot == null) {
			return;
		}
		printPostorderRec(curRoot.left);
		printPostorderRec(curRoot.right);
		System.out.print(curRoot.Value + " , ");

	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(40).insert(25).insert(78).insert(10).insert(32);

		bst.insert(10);

		System.out.println("Inorder traversal");
		bst.printInorder();
		System.out.println("Preorder traversal");
		bst.printPreorder();

		System.out.println("Preorder traversal");
		bst.printPostorder();

		System.out
				.println("The minimum value in the BST: " + bst.findMinimum());
		System.out
				.println("The maximum value in the BST: " + bst.findMaximum());

	}

}
