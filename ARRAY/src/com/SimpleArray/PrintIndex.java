package com.SimpleArray;

import java.util.Scanner;

public class PrintIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Elements of Array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Elements in Array is: ");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Enter number to find index: ");
		int fi = sc.nextInt();

		for (int i = 0; i < size; i++) {
			if (fi == arr[i]) {
				System.out.println("Index of " + fi + " is: " + i);
				return;
			}
		}
		System.out.println("Not found...");

	}

}
