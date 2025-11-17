package com.Practice;

import java.util.Arrays;

public class MeargSort {

	public static void divide(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			divide(arr, left, mid);
			divide(arr, mid + 1, right);

			mearg(arr, left, mid, right);
		}
	}

	public static void mearg(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int[] larr = new int[n1];
		int[] rarr = new int[n2];
		for (int i = 0; i < n1; i++) {
			larr[i] = arr[left + i];
		}
		for (int j = 0; j < n2; j++) {
			rarr[j] = arr[mid + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = left;

		while (i < n1 && j < n2) {
			if (larr[i] < rarr[j]) {
				arr[k] = larr[i];
				i++;
			} else {
				arr[k] = rarr[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = larr[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = rarr[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 8, 1, 2, 3, 5, 4, 6, 7, 9 };
		int left = 0;
		int right = arr.length - 1;
		System.out.println(Arrays.toString(arr));
		divide(arr, left, right);
		System.out.println(Arrays.toString(arr));
	}

}
