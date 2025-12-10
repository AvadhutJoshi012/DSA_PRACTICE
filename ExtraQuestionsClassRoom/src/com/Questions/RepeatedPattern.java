package com.Questions;

import java.util.Scanner;

public class RepeatedPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String s = sc.nextLine();

		System.out.println("Enter Pattern to Check Repeatation: ");
		String ptr = sc.nextLine();

		int count = 0;

		for (int i = 0; i <= s.length() - ptr.length(); i++) {
			if (s.substring(i, i + ptr.length()).equals(ptr)) {
				count++;
			}
		}
		System.out.println("Count of Repeatation is: " + count);
	}

}
