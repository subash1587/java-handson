package com.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNumbers {

	public static void main(String[] args) {
		int[] numbers = {54,23,87,53,40,15,35,40};
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		System.out.println("Before Sorting:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Collections.sort(list);
		
		System.out.println("After Sorting:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
