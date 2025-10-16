package com.ArrayPractice;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Array Elements are: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Reverse Order of Array: ");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
