package com.Practice;

import java.util.Arrays;

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
		int[] arr = { 5, 4, 6, 8, 9, 1, 2, 3, 7 };
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
