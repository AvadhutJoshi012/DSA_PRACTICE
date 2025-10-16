package com.Array2D;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size: ");
		int rs = sc.nextInt();
		System.out.println("Enter column size: ");
		int cs = sc.nextInt();
		int[][] arr = new int[rs][cs];
		System.out.println("Enter elements: ");
		for (int i = 0; i < rs; i++) {
			for (int j = 0; j < cs; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements of Array: ");
		for (int i = 0; i < rs; i++) {
			for (int j = 0; j < cs; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter Number to know indices: ");
		int num = sc.nextInt();
		for (int i = 0; i < rs; i++) {
			for (int j = 0; j < cs; j++) {
				if (arr[i][j] == num) {
					System.out.println("Found At: " + i + j);
				} 
			}
		}
	}

}
