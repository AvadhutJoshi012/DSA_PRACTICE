package com.Simple;

public class Factorial {

	public static int calFact(int num) {
		int res=1;
		for (int i = 1; i <= num; i++) {
			res = res * i;
//			System.out.print(res+" ");
		}
		return res;
	}

	public static void main(String[] args) {
		int num = 5;
		int res = calFact(num);
		System.out.println(res);
	}

}
