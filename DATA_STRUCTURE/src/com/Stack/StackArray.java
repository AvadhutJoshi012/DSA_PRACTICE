package com.Stack;

public class StackArray {

	int[] arr;
	int capacity;
	int top;

	public StackArray(int size) {
		this.arr = new int[size];
		this.capacity = size;
		this.top = -1;
	}

	public void push(int value) {
		if (top == capacity - 1) {
			System.out.println("Stack is OverFlow");
			return;
		}
		arr[++top] = value;
		System.out.println(value + " <-Push");
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is UnderFlow");
			return;
		}
		System.out.println(arr[top--] + " ->pop");
		System.out.println();
	}

	public void peek() {
		if (top == -1) {
			System.out.println("Stack is UnderFlow");
			return;
		}
		System.out.println(arr[top] + " <-Peek");
		System.out.println();
	}

	public void display() {
		if (top == -1) {
			System.out.println("Stack is UnderFlow");
			return;
		}
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StackArray sa = new StackArray(5);

		sa.push(10);
		sa.push(20);
		sa.push(30);
		sa.push(40);
		sa.display();
		sa.peek();
		sa.display();
		sa.pop();
		sa.display();
		sa.push(50);
		sa.push(60);
		sa.display();
		sa.push(70);
		sa.display();
		sa.pop();
		sa.pop();
		sa.pop();
		sa.pop();
		sa.pop();
		sa.peek();
		sa.display();
	}

}
