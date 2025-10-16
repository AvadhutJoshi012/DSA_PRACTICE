package com.Sorting;

public class InsertionSortEx {

	public static void main(String[] args) {
		int[] arr = { 9, 1, 8, 2, 7, 3, 5, 4, 6 };
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		sortInsertion(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	public static void sortInsertion(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

}
