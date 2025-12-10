package com.Questions;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static int fs(int num) {
		if(num<0) {
			System.out.println("Enter Valid Number.");
		}
		if(num==0) {
			return 0;
		}
		if(num==1) {
			return 1;
		}
		
		for(int i=1;i<=num;i++) {
			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
		fs(num);
	}

}
