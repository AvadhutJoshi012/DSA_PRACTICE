package com.Basic.LL;

public class InsertAtBegining {

	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void insertNodeStart(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void deleteEndNode() {
		if (head == null) {
			System.out.println("List is Empty can't delete.");
		} else if (head.next == null) {
			head = null;
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}

	}

	public void deleteStartNode() {
		if (head == null) {
			System.out.println("List is Empty Can't Delete");
		} else if (head.next == null) {
			head = null;
		} else {
			head = head.next;
		}
	}

	public void displayNode() {
		if (head == null) {
			System.out.println("List is Empty.");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println("Null");
		}
	}

	public static void main(String[] args) {
		InsertAtBegining ll = new InsertAtBegining();
		ll.displayNode();
		ll.insertNode(10);
		ll.insertNode(20);
		ll.insertNode(30);
		ll.displayNode();
		ll.insertNodeStart(11);
		ll.displayNode();
		ll.insertNode(40);
		ll.insertNode(50);
		ll.insertNodeStart(12);
		ll.displayNode();
		ll.deleteEndNode();
		ll.displayNode();
		ll.deleteStartNode();
		ll.displayNode();
	}

}
