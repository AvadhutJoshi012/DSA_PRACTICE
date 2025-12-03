package com.PrefixSuffix;

import java.util.Arrays;

public class Example02 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		int[] suffix = new int[arr.length];
		int n = suffix.length;
		suffix[n - 1] = arr[arr.length - 1];
		for (int i = n - 2; i >= 0; i--) {
			suffix[i] = suffix[i + 1] + arr[i];
		}
		System.out.println(Arrays.toString(suffix));
	}

}
