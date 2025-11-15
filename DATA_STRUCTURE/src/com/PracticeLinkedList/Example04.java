package com.PracticeLinkedList;

public class Example04 {

	Node head;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
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

		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		Example04 ll = new Example04();

		ll.insertLast(10);
		ll.display();
		
		ll.insertBegin(100);
		ll.insertBegin(200);
		ll.display();
		
		
	}

}
