package com.MethodsInJava;

import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Print Factorial: ");
		int num = sc.nextInt();
		System.out.println("The Factorial of " + num + " is: " + printFactorial(num));

	}

	public static int printFactorial(int num) {
		int fact = 1;
//		for (int i =1; i <=num; i++) {
//			fact = fact*i;
//		}
		for (int i =num; i >=1; i--) {
			fact = fact*i;
		}

		return fact;
	}

}
