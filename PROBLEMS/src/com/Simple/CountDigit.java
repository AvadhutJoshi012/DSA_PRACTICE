package com.Simple;

public class CountDigit {

	public static void main(String[] args) {

		int num = 000;

		int res = 0;
		while (num > 0) {
			num = num / 10;
			res++;
		}
		System.out.println(res);

	}

}
