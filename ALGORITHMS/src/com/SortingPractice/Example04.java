package com.SortingPractice;

import java.util.Arrays;

public class Example04 {

	public static void sort(int[] arr, int left, int right) {
		if (left < right) {
			int partitionIndex = partition(arr, left, right);
			sort(arr, left, partitionIndex - 1);
			sort(arr, partitionIndex + 1, right);

		}
	}

	public static int partition(int[] arr, int left, int right) {

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
		int[] arr = { 5, 6, 8, 4, 9, 7, 2, 3, 1 };
		System.out.println(Arrays.toString(arr));
		int left = 0;
		int right = arr.length - 1;
		sort(arr, left, right);
		System.out.println(Arrays.toString(arr));
	}

}
