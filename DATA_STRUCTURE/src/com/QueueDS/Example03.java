package com.QueueDS;

public class Example03 {

	int size = 5;
	int[] arr = new int[size];
	int front = -1;
	int rear = -1;

	public void enqueue(int data) {
		if (rear == size - 1) {
			System.out.println("Queue is Full");
			return;
		}

		if (front == -1)
			front = 0;

		rear++;
		arr[rear] = data;
		System.out.println(data + " inserted");
	}

	public void dequeue() {
		if (front == -1 || front > rear) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println(arr[front] + " deleted");
		front++;
	}

	public void peek() {
		if (front == -1 || front > rear) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println(arr[front] + " Fists Element");
	}

	public void display() {
		if (front == -1 || front > rear) {
			System.out.println("Queue is Empty");
			return;
		}
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + "<-");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Example03 q = new Example03();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		q.peek();
		q.dequeue();
		q.display();
		q.peek();

	}

}
