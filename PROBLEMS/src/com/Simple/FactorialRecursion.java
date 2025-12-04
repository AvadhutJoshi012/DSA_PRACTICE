package com.Simple;

public class FactorialRecursion {

	public static int calFact(int num) {
		if (num == 0) {
			return 1;
		}
		int res = num * calFact(num - 1);
		return res;
	}

	public static void main(String[] args) {

		int num = 20;
		int res = calFact(num);
		System.out.println(res);
	}

}
