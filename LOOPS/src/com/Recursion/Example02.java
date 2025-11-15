package com.Recursion;

public class Example02 {

	public static void printNum(int n) {
		if (n == 6) {
			return;
		}
		System.out.println(n);	// SWAP THE PRINT STATEMENT AND METHOD CALL TO PRINT THE OUTPUT IN
		printNum(n + 1); 		// REVERSE ORDER.

	}

	public static void main(String[] args) {
		int n = 1;
		printNum(n);
	}

}
