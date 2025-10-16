package com.Sorting;

public class SelectionSortEx {

	public static void main(String[] args) {

		int[] arr = { 8, 6, 4, 9, 7, 2, 3, 1, 5 };

		for (int a : arr) {
			System.out.print(a + " ");
		}
		SelectionSortEx.sort(arr);
		System.out.println();
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	public static void sort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
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

}
