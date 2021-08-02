package com.practise;

public class StringChange {
	
	public static String changeString(String text) {
		String newString = "";
		for (int i = 0; i < text.length(); i++) {
			char x = text.charAt(i);
			if(x != 'i' && x != 'r' && x != 'n') {
				newString = newString+x;
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		
		String exp = "Altimetrik is hiring";
		System.out.println("Input: "+exp);
		System.out.println("Output:"+changeString(exp));
		
	}
}
