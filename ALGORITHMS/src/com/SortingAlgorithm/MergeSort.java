package com.SortingAlgorithm;

public class MergeSort {

	public static void divide(int arr[], int first, int last) {

		if (first < last) {

			int mid = (first + last) / 2;
			divide(arr, first, mid);
			divide(arr, mid + 1, last);

		}

	}

	public static void merge(int arr[], int first, int mid, int last) {

		int n1 = mid - first + 1;
		int n2 = last - mid;

		int[] left = new int[n1];
		int[] right = new int[n2];

		for (int i = 0; i < n1; i++) {
			left[i] = arr[first + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = arr[mid + 1 + j];
		}

	}

	public static void main(String[] args) {

		int[] arr = { 5, 4, 6, 7, 9, 2, 1, 3, 8, 0 };
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();

		divide(arr, 0, arr.length - 1);
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
