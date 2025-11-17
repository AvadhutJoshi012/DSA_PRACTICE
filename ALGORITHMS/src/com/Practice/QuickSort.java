package com.Practice;

import java.util.Arrays;

public class QuickSort {

	public static void sort(int[] arr, int left, int right) {
		if (left < right) {

			int parIndex = partation(arr, left, right);

			sort(arr, left, parIndex - 1);
			sort(arr, parIndex + 1, right);
		}
	}

	public static int partation(int[] arr, int left, int right) {

		int pivot = arr[right];
		int i = left - 1;

		for (int j = left; j < right; j++) {

			if (arr[j] < pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[right];
		arr[right] = temp;

		return i + 1;

	}

	public static void main(String[] args) {
		int[] arr = { 9, 5, 4, 6, 8, 7, 1, 2, 3 };
		int left = 0;
		int right = arr.length - 1;
		System.out.println(Arrays.toString(arr));
		sort(arr, left, right);
		System.out.println(Arrays.toString(arr));
	}

}
