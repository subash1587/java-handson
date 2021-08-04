package com.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNumbers2 implements Comparator<Person>{
	
	public int compare(Person p1, Person p2) {
		return p2.age - p1.age;
	}

		public static void main(String[] args) {
			int[] numbers = {54,23,87,53,40,15,35,40};
			List<Person> list = new ArrayList<>();
			for (int i = 0; i < numbers.length; i++) {
				list.add(new Person(numbers[i]));
			}
			System.out.println("Before Sorting:");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).age);
			}
			
			Collections.sort(list, new SortNumbers2());
			
			System.out.println("After Sorting:");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).age);
			}
		}
}
