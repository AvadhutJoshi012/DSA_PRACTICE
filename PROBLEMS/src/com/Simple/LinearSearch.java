package com.Simple;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int find = 30;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				System.out.println("Found at " + i + " index.");
				return;
			}
		}
		System.out.println("Not Found.");

	}

}
