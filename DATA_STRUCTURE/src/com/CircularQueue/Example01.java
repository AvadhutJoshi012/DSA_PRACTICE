package com.CircularQueue;

public class Example01 {

	int size = 5;
	int[] arr = new int[size];
	int front = -1;
	int rear = -1;

	public void enqueue(int data) {

		if ((rear + 1) % size == front) {
			System.out.println("Queue is Empty.");
			return;
		}

		if (front == -1)
			front = 0;

		rear = (rear + 1) % size;
		arr[rear] = data;
		System.out.println(data + " inserted.");
	}

	public void display() {
		if (front == -1) {
			System.out.println("Queue is Empty");
			return;
		}

		int i = front;
		while (true) {
			System.out.print(arr[i] + " ");

			if (i == rear)
				break;

			i = (i + 1) % size;
		}
	}

	public static void main(String[] args) {
		Example01 cq = new Example01();

		cq.enqueue(10);
		cq.enqueue(20);
		cq.display();
	}

}
