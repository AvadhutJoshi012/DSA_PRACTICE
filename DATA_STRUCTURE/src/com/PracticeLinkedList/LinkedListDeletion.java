package com.PracticeLinkedList;

public class LinkedListDeletion {

	Node head;

	public class Node {
		int data;
		Node next;

		Node(int data) {
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
			System.out.println("It is Empty, Insert Element.");
			return;
		}
		head = head.next;
	}

	public void deleteEnd() {
		if (head == null) {
			System.out.println("It is Empty, Insert Element.");
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
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {

		LinkedListDeletion ll = new LinkedListDeletion();

		ll.insertEnd(10);
		ll.insertEnd(20);
		ll.insertEnd(30);
		ll.display();

		ll.insertStart(100);
		ll.insertStart(200);
		ll.insertStart(300);
		ll.display();

		ll.deleteEnd();
		ll.display();

		ll.deleteStart();
		ll.display();

	}

}
