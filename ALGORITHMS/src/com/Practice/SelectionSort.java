package com.Practice;

public class SelectionSort {

	public static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 9, 4, 5, 6, 8, 7, 2, 3, 1 };
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		sort(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
