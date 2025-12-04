package com.Simple;

public class PalindromeNumber {

	public static int checkPalindrome(int num) {

		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;

	}

	public static void main(String[] args) {
		int num = 123210;
		int rev = checkPalindrome(num);

		if (rev == num) {
			System.out.println("it is Palindrome.");
		} else {
			System.out.println("Not Palindrome.");
		}
	}

}
