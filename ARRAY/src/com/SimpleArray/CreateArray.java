package com.SimpleArray;

import java.util.Arrays;
import java.util.Random;

public class CreateArray {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = ran.nextInt(5);
		}

		System.out.println(Arrays.toString(num));

	}

}
