package com.Simple;

public class ArrayFrequency {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 6, 1, 2, 3, 8, 5 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int count = 1;

			boolean visit = false;
			for (int k = 0; k < i; k++) {
				if (arr[k] == arr[i]) {
					visit = true;
					break;
				}
			}
			if (visit)
				continue;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] == arr[i]) {
					count++;
				}
			}
			System.out.println(arr[i] + " --> " + count);
		}

	}

}
