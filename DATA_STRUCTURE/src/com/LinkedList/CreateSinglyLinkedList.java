package com.LinkedList;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}

public class CreateSinglyLinkedList {
	
	public static void main(String[] args) {
		
		Node start=new Node(10);
		
		start.next=new Node(20);
		start.next.next=new Node(30);
		start.next.next.next=new Node(30);
		
		while(start!=null) {
			System.out.print(start.data+"->");
			start=start.next;
		}
	}

}
