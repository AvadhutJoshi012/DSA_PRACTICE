package com.BasicsArrayOperations;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Elements in Array are: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
