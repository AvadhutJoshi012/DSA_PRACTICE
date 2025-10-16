package com.LinkedList;

public class SinglyLL {
	Node head;
	private int size;

	public SinglyLL() {
		this.size = 0;
	}

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node curNode = head;
		while (curNode.next != null) {
			curNode = curNode.next;
		}
		curNode.next = newNode;
	}

	public void printNode() {
		if (head == null) {
			System.out.println("List is Empty.");
			return;
		}
		Node curNode = head;
		while (curNode != null) {
			System.out.print(curNode.data + "->");
			curNode = curNode.next;
		}
		System.out.println("null");
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is Empty.");
			return;
		}
		size--;
		head = head.next;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is Empty.");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}
		Node secLast = head;
		Node last = head.next;
		while (last.next != null) {
			last = last.next;
			secLast = secLast.next;
		}
		secLast.next = null;
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		SinglyLL sll = new SinglyLL();
		sll.addFirst(10);
		sll.addFirst(20);
		sll.printNode();

		sll.addLast(30);
		sll.printNode();

		sll.addFirst(40);
		sll.printNode();

		sll.deleteLast();
		sll.printNode();

		sll.deleteFirst();
		sll.printNode();

		System.out.println(sll.getSize());
	}

}
