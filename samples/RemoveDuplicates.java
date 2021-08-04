package com.practise;

public class RemoveDuplicates {
	
		
	public static void main(String[] args) {
		int[] numbers = {54,23,87,23,40,53,40,15,35,40};
		int[] result = new int[numbers.length];
		int[] duplicate = new int[numbers.length];
		int k =0, m =0;
		for (int i = 0; i < numbers.length; i++) {
			int count = 0;
			for (int j = i+1; j <= numbers.length; j++) {
				if(j<numbers.length &&(numbers[i] == numbers[j])) {
					count++;
					if(count == 1)
						duplicate[m++] = numbers[i];
				}
			}
			if(count == 0) {
				result[k++] = numbers[i];
			}
			
		}
		for (int i : duplicate) {
			System.out.println("Duplicates : "+i);
		}
		for (int i : result) {
			System.out.println("Unique array : "+i);
		}
		
	}

}
