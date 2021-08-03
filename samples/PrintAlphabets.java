package com.practise;

public class PrintAlphabets {
	
	public static void main(String[] args) {
		for (int i = 65; i <= 90; i++) {
			System.out.println((char)i);
		}
		
		int alphabet = 65;
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(alphabet+j)+ " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(alphabet+j)+ " ");
			}
			System.out.println();
			if(i==5) {
				for (int k = 5; k >= 0; k--) {
					for (int j = 0; j < k; j++) {
						System.out.print((char)(alphabet+j) + " ");
					}
					System.out.println();
				}
			}
		}
		
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(alphabet+j)+ " ");
			}
			System.out.println();
			if(i==0) {
				for (int k = 0; k <= 5; k++) {
					for (int j = 0; j <= k; j++) {
						System.out.print((char)(alphabet+j) + " ");
					}
					System.out.println();
				}
			}
		}
	}

}
