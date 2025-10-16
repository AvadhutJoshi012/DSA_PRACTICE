package com.Sorting;

public class BubbleSortEx {

	public static void main(String[] args) {

		int[] arr = { 9, 4, 8, 7, 6, 5, 2, 3, 1 };
		System.out.println("Before: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		BubbleSortEx.sort(arr);
		System.out.println();
		System.out.println("After: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	public static void sort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}
