package com.LinkedList;

import java.util.LinkedList;

public class InbuiltLinkedList {

//	public static class Node {
//		int data;
//		Node next;			WHEN WE ARE USING THE INBUILD METHODS THAT TIME THERE IS NO NEED OF 
//							CREATING THE NODE CLASS
//
//		Node(int data) {
//			this.data = data;
//		}
//	}

	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>();
		al.add("Avadhut");
		al.add("Soham");
		al.addFirst("Ram");
		al.addLast("Ravan");
		System.out.print("List of Name: " + al);
		System.out.println();
		System.out.println("Fist Name is: " + al.getFirst());
		System.out.println("Last Name is: " + al.getLast());

		al.removeLast();
		System.out.print(al);
		al.remove("Avadhut");

		System.out.print(al);

	}

}
