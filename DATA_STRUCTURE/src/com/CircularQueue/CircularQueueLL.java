package com.CircularQueue;

public class CircularQueueLL {

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
			System.out.println(front.data + " inserted");
		} else {
			rear.next = newNode;
			rear = newNode;
			System.out.println(front.data + " inserted");
		}
	}

	public void dequeue() {
		if (front == null) {
			System.out.println("Queue is Empty");
			return;
		}

		if (front == rear) {
			System.out.println(front.data + " deleted.");
			front = rear = null;
		} else {
			System.out.println(front.data + " deleted");
			front = front.next;
			rear.next = front;
		}

	}

	public void peek() {
		if (front == null) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println(front.data + " First Element.");
	}

	public void display() {
		if (front == null) {
			System.out.println("Queue is Empty");
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
		CircularQueueLL cq = new CircularQueueLL();

		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		cq.display();
		cq.dequeue();

	}

}
