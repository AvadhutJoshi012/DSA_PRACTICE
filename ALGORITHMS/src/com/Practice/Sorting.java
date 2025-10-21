package com.Practice;

public class Sorting {

	public static void bubbleSort(int[] arr) {
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
	

	public static void main(String[] args) {

		int[] arr = { 9, 5, 4, 3, 6, 8, 7, 2, 1 };
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		bubbleSort(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
