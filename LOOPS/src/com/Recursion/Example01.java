package com.Recursion;

public class Example01 {

	public static void printNum(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);	// SWAP THE PRINT STATEMENT AND METHOD CALL TO PRINT THE OUTPUT IN 
		printNum(n - 1);		// IN REVERSE ORDER.
		
	}

	public static void main(String[] args) {
		int n = 5;
		printNum(n);
	}

}
