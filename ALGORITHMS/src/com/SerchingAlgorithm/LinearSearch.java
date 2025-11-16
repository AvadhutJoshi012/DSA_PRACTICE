package com.SerchingAlgorithm;

public class LinearSearch {

	public static void search(int[] arr, int value) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("Found at: " + i + " Index.");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int value = 40;
		search(arr, value);

	}

}
