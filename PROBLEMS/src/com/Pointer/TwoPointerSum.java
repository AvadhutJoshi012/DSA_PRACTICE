package com.Pointer;

public class TwoPointerSum {

	public static void doSum(int[] arr, int target) {
		int L = 0;
		int R = arr.length - 1;
		while (L < R) {
			int sum = arr[L] + arr[R];
			if (sum == target) {
				System.out.println(L + " " + R);
				return;
			} else if (sum < target) {
				L++;
			} else {
				R--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int target = 90;
		doSum(arr, target);
	}

}
