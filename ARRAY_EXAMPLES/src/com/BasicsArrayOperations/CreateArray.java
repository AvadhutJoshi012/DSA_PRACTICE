package com.BasicsArrayOperations;

import java.util.Scanner;

public class CreateArray {

	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 1;
		arr[1] = 2;

		System.out.println(arr[0]);
		
		//USER INPUT
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr1=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=sc.nextInt();
		}
			
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
