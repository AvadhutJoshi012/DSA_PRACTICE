package com.SortingPractice;

public class InsertionSort {

	public static void sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > value) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = value;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 7, 5 };
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
