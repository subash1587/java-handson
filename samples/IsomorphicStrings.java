package com.practise;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	public static boolean checkStrings(String string1, String string2) {
		
		Map<Character,Character> map = new HashMap<>();
		if(string1.length() != string2.length()) {
			return false;
		}
		for (int i = 0; i < string1.length(); i++) {
			char key = string1.charAt(i);
			char value = string2.charAt(i);
			if (map.isEmpty()) {
				map.put(key, value);
			}else if(map.containsKey(key)) {
				if(map.get(key) != value) {
					return false;
				}
			}else{
				for(Map.Entry<Character, Character> element:map.entrySet()) {
					if(element.getValue() == value) {
						return false;
					}
				}
				map.put(key, value);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String string1 = "ABBA";
		String string2 = "XYYX";
		
		boolean result = checkStrings(string1, string2);
		if(result) {
			System.out.println("Strings are isomorphic");
		}else {
			System.out.println("Strings are not isomorphic");
		}
	}
}
