package com.MethodsInJava;

import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
//		printSum(a, b);
		int sum = printSum(a, b);
		System.out.println("The Addition Is: " + sum);

		System.out.println("The Multiplication is: " + printMul(a, b));
	}

	public static int printSum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int printMul(int a, int b) {
		return a * b;
	}

}
