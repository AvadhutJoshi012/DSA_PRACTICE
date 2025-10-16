package com.BasicNumberPrinting;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Print Multiplictioan Table: ");
		int num = sc.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}

}
