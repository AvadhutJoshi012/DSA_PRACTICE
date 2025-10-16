package com.BinarySerach;

public class BinarySearchExample {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int tar = 9;
		int result = printElement(arr, tar);

		if (result == -1) {
			System.out.println("Element Not Found.");
		} else {
			System.out.println("Element Found At Index: " + result);
		}

	}

	public static int printElement(int arr[], int tar) {

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
