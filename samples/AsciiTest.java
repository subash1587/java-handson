package com.practise;

import java.util.Iterator;

public class AsciiTest {
	public static void main(String[] args) {
		int[] numbers = {1,5,22,6,54,0,8,6};
		for (int i = 0; i < numbers.length-1; i++) {
			if(numbers[i] > numbers[i+1]) {
				int temp = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
				i=-1;
			}
		}
		for(int num:numbers) {
			System.out.println(num);
		}
		
		int len = numbers.length;
		for (int i = 0; i < len-1; i++) {
			for (int j = 0; j < len-i-1; j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		for(int num:numbers) {
			System.out.println(num);
		}
		
	}
}
