package com.Practice;

import java.util.Scanner;

public class BinarySearch {

	public static int search(int[] arr, int value) {
		int left = 0;
		int right = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			int mid = (left + right) / 2;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[mid] == value) {
					return mid;
				} else if (arr[mid] < value) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Insert Array Elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements Are: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Enter value to find");
		int value = sc.nextInt();
		int res = search(arr, value);

		if (res != -1) {
			System.out.println("Found at: " + res);
		} else {
			System.out.println("Not Found.");
		}
	}

}
