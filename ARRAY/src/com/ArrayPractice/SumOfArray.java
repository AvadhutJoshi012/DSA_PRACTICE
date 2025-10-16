package com.ArrayPractice;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements of Array is: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Sum of Array Element: ");
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		System.out.println("Average of Array Element: ");
		int avg = 0;
		for (int i = 0; i < size; i++) {
			avg = sum / size;
		}
		System.out.println(avg);

	}

}
