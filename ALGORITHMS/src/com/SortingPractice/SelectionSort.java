package com.SortingPractice;

public class SelectionSort {

	public static void sort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 3, 1, 5, 9, 4 };
		System.out.println("Before Sorting: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		sort(arr);
		System.out.println("After Sorting: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
