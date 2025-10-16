package com.MethodsInJava;

import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintName pn = new PrintName();
		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();
//		PrintName.printName(name);
		pn.printName(name);

	}

	public void printName(String name) {
		System.out.println("Your Name Is: " + name);
	}

}
