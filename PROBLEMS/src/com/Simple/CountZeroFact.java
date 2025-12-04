package com.Simple;

public class CountZeroFact {

	public static int calFact(int num) {
		int res = 1;
		for (int i = 1; i <= num; i++) {
			res = res * i;
		}
		int count = 0;
		while (res % 10 == 0) {
			count++;
			res = res / 10;
		}
		return count;
	}

	public static void main(String[] args) {

		int num = 20;
		int res = calFact(num);
		System.out.println(res);

	}

}
