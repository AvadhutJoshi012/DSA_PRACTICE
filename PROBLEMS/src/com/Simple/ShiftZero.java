package com.Simple;

import java.util.Arrays;

public class ShiftZero {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 5, 6 };
		int n = arr.length;
		System.out.println(Arrays.toString(arr));
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
