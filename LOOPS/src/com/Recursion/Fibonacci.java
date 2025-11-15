package com.Recursion;

public class Fibonacci {

	public static void calFibo(int a, int b, int n) {
		if (n == 0) {
			return;
		}
		int c = a + b;
		System.out.println(c);
		calFibo(b, c, n - 1);
		
	}

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int n = 7;
		System.out.println(a);
		System.out.println(b);
		calFibo(a, b, n - 2);
	}

}
