package com.QueueDS;

public class Example02 {

	int size = 5;
	int[] arr = new int[size];
	int front = -1;
	int rear = -1;

	public void enqueue(int data) {
		if (rear == size - 1) {
			System.out.println("Queue is Full.");
			return;
		}

		if (front == -1)
			front = 0;

		rear++;
		arr[rear] = data;
		System.out.println(data+" Inserted.");
	}

	public void dequeue() {
		if (front == -1 || front > rear) {
			System.out.println("Queue is Empty.");
			return;
		}
		
		System.out.println(front + " removed");
		front++;
	}
	
	public void display() {
		if(front==-1 || front>rear) {
			System.out.println("Queue is Empty.");
			return;
		}
		
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+"<-");
		}
		
		if(rear==size-1) {
			System.out.print("X");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Example02 q=new Example02();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		
	}

}
