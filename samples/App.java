package com.practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	static boolean areBracketsBalanced(String exp){
		Stack newStack = new Stack();
		for(int i=0;i<exp.length();i++) {
			char x = exp.charAt(i);
			if(x=='{' || x=='(' || x=='[') {
				newStack.push(x);
			}else {			
				if(newStack.isEmpty()) {
					return false;
				}
				char check = (char) newStack.pop();
				System.out.println(check);
				System.out.println(newStack.pop());
				System.out.println(newStack.peek());
				switch (x) {
				case '{':
					if(check =='}') {
						return true;
					}
					break;
				case '(':
					if(check ==')') {
						return true;
					}
					break;
				case '[':
					if(check ==']') {
						return true;
					}
					break;
				}
			}
		}
		return newStack.isEmpty();

	}
	public static void main(String[] args) {
		String data = "{[({)]}";
		if(areBracketsBalanced(data)) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not balanced");
		}
	}
}
