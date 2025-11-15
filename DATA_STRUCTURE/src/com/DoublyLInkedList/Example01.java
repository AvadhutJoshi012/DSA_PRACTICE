package com.DoublyLInkedList;

public class Example01 {

	Node head;

	public class Node {
		int data;
		Node next;
		Node pre;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.pre = null;
		}
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
		newNode.pre = temp;
	}

	public void insertStart(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head.pre = newNode;
		head = newNode;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "<->");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		Example01 ll = new Example01();

		ll.insertEnd(10);
		ll.insertEnd(20);
		ll.display();

		ll.insertStart(100);
		ll.insertStart(200);
		ll.display();
	}

}
