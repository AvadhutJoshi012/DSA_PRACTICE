package com.SortingPractice;

public class BubbleSort {

	public static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 5, 8, 4, 6, 2, 8, 7, 9, 1, 3 };
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
