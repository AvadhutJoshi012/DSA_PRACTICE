package com.SortingPractice;

import java.util.Arrays;

public class Example01 {

	public static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int[] arr = { 55, 44, 10, 20, 7 };
		sort(arr);
	}

}
