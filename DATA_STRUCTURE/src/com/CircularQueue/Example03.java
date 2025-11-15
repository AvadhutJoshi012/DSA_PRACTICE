package com.CircularQueue;

public class Example03 {

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
			newNode.next = front;
		} else {
			rear.next = newNode;
			rear = newNode;
			rear.next = front;
		}
		System.out.println(data + " inserted.");
	}

	public void dequeue() {
		if (front == null) {
			System.out.println("Queue is empty.");
			return;
		}

		if (front == rear) {
			System.out.println(front.data + " deleted");
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
		System.out.println(front.data + " First Element");
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

			if (temp == front) {
				break;
			}
			
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Example03 cq = new Example03();

		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		cq.display();
		cq.dequeue();
		cq.peek();
	}

}
