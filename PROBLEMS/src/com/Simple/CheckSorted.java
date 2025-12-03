package com.Simple;

public class CheckSorted {

	public static boolean check(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 10,20,30,40,50};
		boolean res = check(arr);
		if (res == false) {
			System.out.println("Not Sorted.");
		} else {
			System.out.println("Sorted.");
		}
	}

}
