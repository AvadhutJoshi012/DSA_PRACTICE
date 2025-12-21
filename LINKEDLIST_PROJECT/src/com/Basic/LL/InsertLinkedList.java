package com.Basic.LL;

public class InsertLinkedList {

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

	public void displayNode() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
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
		InsertLinkedList ll = new InsertLinkedList();

		ll.insertNode(10);
		ll.insertNode(20);
		ll.insertNode(30);
		ll.displayNode();
	}

}
