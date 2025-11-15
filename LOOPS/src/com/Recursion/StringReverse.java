package com.Recursion;

public class StringReverse {

	public static void printStr(String str, int idx) {

		if (idx == 0) {
			System.out.println(str.charAt(idx));
			return;
		}
		System.out.print(str.charAt(idx)+" ");
		printStr(str, idx - 1);

	}

	public static void main(String[] args) {
		String str = "Avadhut";
		printStr(str, str.length() - 1);

	}

}
