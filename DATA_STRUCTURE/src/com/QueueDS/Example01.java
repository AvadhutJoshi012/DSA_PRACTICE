package com.QueueDS;

public class Example01 {

	int size = 4;
	int[] arr = new int[size];
	int front = -1;
	int rear = -1;

	public void enqueue(int data) {
		if (rear == size - 1) {
			System.out.println("Queue is Full, Cannot Insert Element");
			return;
		}

		if (front == -1)
			front = 0;

		rear++;
		arr[rear] = data;
		System.out.println(data + " Inserted.");
	}

	public void display() {
		if (front == -1 || front > rear) {
			System.out.println("Queue is Empty, Insert Element.");
			return;
		}

		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + "<-");
		}
		
		if(rear==size-1) {
			System.out.print("X");
		}
	}
	
	public static void main(String[] args) {
		Example01 q=new Example01();
		q.enqueue(100);
		q.enqueue(200);
		q.enqueue(300);
		q.enqueue(400);
		q.enqueue(500);
		q.display();
	}

}
