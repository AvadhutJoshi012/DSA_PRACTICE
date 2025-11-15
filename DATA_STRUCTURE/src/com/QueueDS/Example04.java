package com.QueueDS;

public class Example04 {
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

		if (rear == null) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		System.out.println(data + " inserted");
	}

	public void dequeue() {
		if (front == null) {
			System.out.println("Queue is Empty.");
			return;
		}
		System.out.println(front.data + " deleted");
		front = front.next;
		if (front == null) {
			rear = null;
		}
	}

	public void peek() {
		if (front == null) {
			System.out.println("Queue is Empty.");
			return;
		}
		System.out.println(front.data + " Element at First");
	}

	public void display() {
		if (front == null) {
			System.out.println("Queue is Empty.");
			return;
		}

		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + "<-");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		Example04 q = new Example04();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.peek();
		q.display();
		q.enqueue(40);
		q.peek();
		q.display();
		q.dequeue();
		q.peek();
		q.display();

	}

}
