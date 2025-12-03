package com.PrefixSuffix;

public class Example03 {

	public static void sum(int[] arr, int l, int r) {

		int n = arr.length;
		int[] prefix = new int[n];
		prefix[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}
		int sum;
		if (l == 0) {
			sum = prefix[r];
		} else {
			sum = prefix[r] - prefix[l - 1];
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10 };
		int l = 1;
		int r = 3;
		sum(arr, l, r);

	}

}
