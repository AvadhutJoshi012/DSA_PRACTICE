package com.QueueDS;

public class QueueUsingLL {

	Node front = null;
	Node rear = null;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void enqueue(int data) {
		Node newNode = new Node(data);

		if (front == null) {
			front = rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
		System.out.println(data + " added.");
	}

	public void dequeue() {
		if (front == null) {
			System.out.println("Queue is Empty.");
			return;
		}
		System.out.println(front.data + " deleted.");
		front = front.next;
	}

	public void peek() {
		if (front == null) {
			System.out.println("Queue is Empty.");
			return;
		}
		System.out.println(front.data + " First Element.");
	}

	public void display() {
		if (front == null) {
			System.out.println("Queue is Empty.");
			return;
		}

		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		QueueUsingLL ql = new QueueUsingLL();

		ql.enqueue(10);
		ql.enqueue(20);
		ql.enqueue(30);
		ql.display();
		ql.peek();
		ql.dequeue();
		ql.display();
		ql.peek();
	}

}
