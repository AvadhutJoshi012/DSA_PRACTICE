package com.Practice;

import java.util.Arrays;

public class Example02 {

	public static void selectionSort(int[] arr) {
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
		int[] arr = { 5, 6, 8, 4, 9, 7, 2, 3, 1 };
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
