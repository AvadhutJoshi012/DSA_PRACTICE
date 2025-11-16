package com.Stack;

public class StackLInkedList {

	Node top;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);

		newNode.next = top;
		top = newNode;
		System.out.println(top.data + " Pushed");
	}

	public void pop() {
		if (top == null) {
			System.out.println("Stack is UnderFlow");
			return;
		}
		System.out.println(top.data + " Poped");
		top=top.next;
	}

	public void peek() {
		if (top == null) {
			System.out.println("Stack is UnderFlow");
			return;
		}
		System.out.println(top.data + " Peek");
	}

	public void display() {
		if (top == null) {
			System.out.println("Stack is UnderFlow");
			return;
		}

		Node temp = top;
		while (temp != null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		StackLInkedList sll = new StackLInkedList();

		sll.push(10);
		sll.push(20);
		sll.push(30);
		sll.display();
		sll.peek();
		sll.display();
		sll.pop();
		sll.display();
	}

}
