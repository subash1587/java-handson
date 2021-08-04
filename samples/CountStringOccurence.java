package com.practise;

public class CountStringOccurence {
	
	static int countOccurence(String[] inputString, String findWord) {
		int count = 0;
		for (int i = 0; i < inputString.length; i++) {
			if(inputString[i].equalsIgnoreCase(findWord)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		String[] inputString = {"this","that","this","of","the","of"};
		String findWord = "that";
		System.out.println(countOccurence(inputString, findWord));
	}

}
