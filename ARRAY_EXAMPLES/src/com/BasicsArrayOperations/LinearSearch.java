package com.BasicsArrayOperations;

public class LinearSearch {

	public static void main(String[] args) {

		int key = 50;

		int[] arr = { 10, 20, 30, 40 };
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				found = true;
				break;
			}
		}
		System.out.println(found ? "Found" : "Not Found");
	}

}
