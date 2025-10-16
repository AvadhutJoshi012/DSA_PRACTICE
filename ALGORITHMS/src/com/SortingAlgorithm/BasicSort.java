package com.SortingAlgorithm;

public class BasicSort {

	public static void main(String[] args) {

		int[] arr = { 9, 8, 5, 1, 2, 3, 6, 4, 7 };
		System.out.println("Before");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("After");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println();
		selectionSort(arr);
		System.out.println("After");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	public static void bubbleSort(int arr[]) {

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

	public static void selectionSort(int arr[]) {
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

}
