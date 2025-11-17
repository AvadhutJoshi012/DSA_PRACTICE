package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

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
		Scanner sc = new Scanner(System.in);

		System.out.println("Size of Array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		sort(arr);
//		System.out.println(Arrays.toString(arr));
	}

}
