package com.BasicNumberPrinting;

public class ReverseNumber {

	public static int reverseNum(int num) {
		int res = 0;
		while (num != 0) {
			int rem = num % 10;
			res = (res * 10) + rem;
			num = num / 10;
		}
		return res;
	}

	public static void main(String[] args) {
		int num = 123456;
		int rev = reverseNum(num);
		System.out.print(rev);
	}

}
