package com.PracticeDS;

public class ExampleQ {

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
	}

	public void dequeue() {
		if (rear == -1) {
			System.out.println("Queue is Empty");
			return;
		}
		front++;
	}

	public void display() {
		if (front > rear || front == -1) {
			System.out.println("Queue is Empty");
			return;
		}

		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		ExampleQ q = new ExampleQ();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		q.dequeue();
		q.display();
	}

}
