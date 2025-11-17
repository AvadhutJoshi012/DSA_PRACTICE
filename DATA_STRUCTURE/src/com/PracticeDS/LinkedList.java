package com.PracticeDS;

public class LinkedList {

	Node head;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertStart(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void insertEnd(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void deleteStart() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		head = head.next;
	}

	public void deleteEnd() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		if (head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	public void display() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		ll.insertStart(10);
		ll.insertStart(20);
		ll.display();
		ll.insertEnd(50);
		ll.insertEnd(60);
		ll.display();
		ll.deleteEnd();
		ll.deleteStart();
		ll.display();
		
	}

}
