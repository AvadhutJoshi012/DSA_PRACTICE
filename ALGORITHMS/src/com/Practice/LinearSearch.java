package com.Practice;

import java.util.Scanner;

public class LinearSearch {

	public static void search(int[] arr, int value) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("Fount Element at Index: " + i);
				return;
			}

		}
		System.out.println("Not Found! Try again..");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements are: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Enter Value to find: ");
		int value = sc.nextInt();
		search(arr, value);
	}

}
