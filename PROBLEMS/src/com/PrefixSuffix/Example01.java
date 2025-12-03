package com.PrefixSuffix;

import java.util.Arrays;

public class Example01 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		System.out.println(Arrays.toString(arr));
		int[] prefix = new int[arr.length];
		prefix[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}
		System.out.println(Arrays.toString(prefix));
	}

}
