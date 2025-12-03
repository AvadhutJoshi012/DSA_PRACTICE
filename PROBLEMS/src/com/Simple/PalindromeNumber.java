//package com.Simple;
//
//public class PalindromeNumber {
//
//	public static int checkPalindrome(int num) {
//
//		int temp = num;
//		int rem;
//		int res;
//		while (temp > 0) {
//			rem = temp % 10;
//			res = res * rem;
//			temp = temp / 10;
//		}
//		return res;
//	}
//
//	public static void main(String[] args) {
//		int num = 123;
//		int res = checkPalindrome(num);
//
//		if (res == num) {
//			System.out.println("It is Palindrome");
//		} else {
//			System.out.println("Not an Palindrome.");
//		}
//	}
//
//}
