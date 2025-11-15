package com.Recursion;

public class ReverseNumber {

	public static int revNum(int num, int res) {
		if (num == 0) {
			return res;
		}
		return revNum(num / 10, res * 10 + num % 10);
	}

	public static void main(String[] args) {

		int num = 12345;
		int res = 0;
		int rev = revNum(num, res);
		System.out.println(rev);

	}

}
