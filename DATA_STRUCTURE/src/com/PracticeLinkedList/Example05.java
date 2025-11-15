package com.PracticeLinkedList;

public class Example05 {

	Node head;

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertAtLast(int data) {
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

	public void insertAtBegining(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

	public void deleteAtBegining() {

		if (head == null) {
			System.out.println("It is Empty, Insert Element");
			return;
		}
		head=head.next;
	}

	public void deleteAtEnd() {

		if (head == null) {
			System.out.println("It is Empty, Insert Element");
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
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		Example05 ll = new Example05();

		ll.insertAtLast(10);
		ll.insertAtLast(20);
		ll.display();
		
		ll.insertAtBegining(100);
		ll.insertAtBegining(200);
		ll.display();
		
		ll.deleteAtBegining();
		ll.display();
		
		ll.deleteAtEnd();
		ll.display();
		
	}

}
