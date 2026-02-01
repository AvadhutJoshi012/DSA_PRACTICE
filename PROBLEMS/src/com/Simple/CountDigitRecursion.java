package com.Simple;

public class CountDigitRecursion {

	public static int count(int num) {
		if (num == 0) {
			return 0;
		}

		return 1 + count(num / 10);
	}

	public static void main(String[] args) {
		int num = 12553;

		System.out.println(count(num));
	}

}
