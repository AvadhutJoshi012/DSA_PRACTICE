package com.BinarySerach;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 3, 8, 15, 23, 42, 56, 78, 91, 100 };
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("Enter Element Form Above: ");
		int tar = sc.nextInt();

		int result = findElement(arr, tar);
		if (result == -1) {
			System.out.println("Element Not found.");
		} else {
			System.out.println("Element Found at Index: " + result);
		}

	}

	public static int findElement(int arr[], int tar) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (tar == arr[mid]) {
				return mid;
			} else if (tar > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
