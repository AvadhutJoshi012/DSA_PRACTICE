package com.CircularLinkedList;

public class Example01 {

	Node head;
	Node tail;

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
			tail = newNode;
			newNode.next = head;
		}
		newNode.next = head;
		head = newNode;
		tail.next = head;

	}

	public void insertEnd(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}

		tail.next = newNode;
		tail = newNode;
		tail.next = head;
	}

	public void deleteStart() {
		if (head == null) {
			System.out.println("It is Empry.");
			return;
		}

		if (head == tail) {
			System.out.println("Deleted: " + head.data);
			head = null;
			tail = null;
			return;
		}

		System.out.println("Deleted: " + head.data);
		head = head.next;
		tail.next = head;

	}

	public void deleteEnd() {
		if (head == null) {
			System.out.println("It is Empty.");
			return;
		}

		if (head == tail) {
			System.out.println("Deleted:" + head.data);
			head = null;
			tail = null;
			return;
		}

		Node temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		System.out.println("Deleted:" + tail.data);
		temp.next = head;
		tail = temp;
	}

	public void display() {
		if (head == null) {
			System.out.println("IT is Empty.");
			return;
		}

		Node temp = head;
		do {
			System.out.print(temp.data + "->");
			temp = temp.next;
		} while (temp != head);
		System.out.println("Head Node");
	}

	public static void main(String[] args) {
		Example01 cll = new Example01();

		cll.insertEnd(10);
		cll.insertEnd(20);
		cll.display();

		cll.insertStart(100);
		cll.insertStart(200);
		cll.display();
		
		cll.deleteStart();
		cll.display();
		cll.deleteEnd();
		cll.display();

	}

}
