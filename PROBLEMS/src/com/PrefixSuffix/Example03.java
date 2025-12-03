package com.PrefixSuffix;


public class Example03 {

	public static void sum(int[] arr) {
		int l = 1;
		int r = 3;
		int sum = 0;
		for (int i = l; i <= r; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10 };
		sum(arr);

	}

}
