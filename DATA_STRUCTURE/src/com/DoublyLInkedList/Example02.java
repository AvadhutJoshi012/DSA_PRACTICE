package com.DoublyLInkedList;

public class Example02 {

	Node head;

	public class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public void insertStart(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head.prev = newNode;
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
		newNode.prev = temp;
	}

	public void deleteStart() {
		if (head == null) {
			System.out.println("It is Empty, Insert Element.");
			return;
		}

		head = head.next;

		if (head != null) {
			head.prev = null;
		}

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
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.prev.next = null;

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "<=>");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		Example02 dll = new Example02();

		dll.insertEnd(10);
		dll.insertEnd(20);
		dll.display();
		dll.insertStart(100);
		dll.insertStart(200);
		dll.display();
		
		dll.deleteEnd();
		dll.display();
		
		dll.deleteStart();
		dll.display();

	}

}
