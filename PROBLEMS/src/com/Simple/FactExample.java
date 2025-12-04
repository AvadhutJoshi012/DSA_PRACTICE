package com.Simple;

public class FactExample {

	public static int calFact(int num) {
		int res = 0;
		for (int i = 5; i < num; i = i * 5) {
			res = res + num / i;
		}
		return res;
	}

	public static void main(String[] args) {
		int num = 10;
		int res = calFact(num);

		System.out.println(res);
	}

}
