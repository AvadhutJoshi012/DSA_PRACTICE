package com.PracticeLinkedList;

public class Example03 {

	Node head;

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertBegin(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;

		head = newNode;
	}

	public void insertLast(int data) {
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

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		Example03 ll = new Example03();

		ll.insertBegin(10);
		ll.insertBegin(20);
		ll.display();
		ll.insertLast(100);
		ll.insertLast(200);
		ll.display();
		ll.insertBegin(300);
		ll.display();
		ll.insertLast(500);
		ll.display();

	}

}
