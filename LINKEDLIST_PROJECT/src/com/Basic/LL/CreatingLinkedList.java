package com.Basic.LL;

public class CreatingLinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void checkLength() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp=temp.next;
		}
		System.out.println("Length of LinkedList: " + count);
	}

	public static void main(String[] args) {
		Node First = new Node(10);
		Node Second = new Node(20);
		Node Third = new Node(30);

		First.next = Second;
		Second.next = Third;
		head = First;

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("Null");

		checkLength();
	}

}
