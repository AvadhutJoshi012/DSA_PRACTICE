package com.Recursion;

public class Factorial {

	public static int calFactorial(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		int fact = calFactorial(n - 1);
		int factNum = n * fact;
		return factNum;
	}

	public static void main(String[] args) {
		int n = 5;
		int res = calFactorial(n);
		System.out.println(res);
	}

}
