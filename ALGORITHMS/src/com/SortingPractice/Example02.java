package com.SortingPractice;

public class Example02 {

	public static void insertionSort(int[] arr) {

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
		int[] arr = { 5, 6, 4, 8, 2, 3, 1 };
		System.out.println("Before Sorting: ");
		for (int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		insertionSort(arr);
		System.out.println("After Sorting: ");
		for (int a : arr) {
			System.out.print(a+" ");
		}
	}

}
