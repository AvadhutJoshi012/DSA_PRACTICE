package com.BitManipulation;

public class GetBit {
	
	public static void main(String[] args) {
		int n=5;
		int pos=3;
		int bitMask=1<<pos;
		if((bitMask&n)==0) {
			System.out.println("Bit is Zero");
		}else {
			System.out.println("Bit is One");
		}
	}

}
