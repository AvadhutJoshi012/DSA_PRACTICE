package com.StringExample;

public class ConcatString {

	public static void main(String[] args) {
		String s1 = "Avadhut";
		String s2 = "Joshi";
		String s3 = s1 + " " + s2;
		System.out.println(s3);
		System.out.println(s3.length());

		for (int i = 0; i < s3.length(); i++) {
			System.out.println(s3.charAt(i));
		}
	}

}
