package com.Stack;

public class Example01 {

	int[] arr;
	int capacity;
	int top;

	public Example01(int size) {
		this.arr = new int[size];
		this.capacity = size;
		this.top = -1;
	}

	public void push(int value) {
		if (top == capacity - 1) {
			System.out.println("Stack is Full/OverFlow.");
			return;
		}
		arr[++top] = value;
		System.out.println(value + " Pushed");
		System.out.println();
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is Empty/UnderFlow");
			return;
		}
		System.out.println(arr[top--] + " Poped");
		System.out.println();
//		int res=arr[top--];
//		System.out.println(res+" Poped");
	}

	public void peek() {
		if (top == -1) {
			System.out.println("Stack is Empty/UnderFlow");
			return;
		}
		System.out.println(arr[top] + " Peek");
		System.out.println();
	}

	public void display() {
		if (top == -1) {
			System.out.println("Stack is Empty/UnderFlow");
			return;
		}
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Example01 s = new Example01(5);

		s.push(10);
		s.push(20);
		s.display();
		s.push(30);
		s.display();
		s.peek();
		s.pop();
		s.peek();
		s.display();
	}
}
