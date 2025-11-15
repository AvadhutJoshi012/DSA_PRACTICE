package com.PracticeTree;

public class Example01 {

	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	class BinaryTree {
		Node root;

		BinaryTree() {
			root = null;
		}

		public void insert(int data) {
			root = insertRec(root, data);
		}

		private Node insertRec(Node root, int data) {

			if (root == null) {
				root = new Node(data);
				return root;
			}

			if (data < root.data) {
				root.left = insertRec(root.left, data);
			} else if (data > root.data) {
				root.right = insertRec(root.right, data);
			}

			return root;
		}

		public void inorderTraversal() {
			inorderRec(root);
		}

		private void inorderRec(Node root) {
			if (root != null) {
				inorderRec(root.left);
				System.out.println(root.data + " ");
				inorderRec(root.right);
			}
		}

	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
	}

}
