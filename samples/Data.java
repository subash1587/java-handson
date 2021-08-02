package com.practise;

import java.util.HashMap;

public class Data {
	int a ;
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		Data newData1 = newData(1);
		Data newData2 = newData(2);
		
		String string1 = new String( "asd");
		map.put(string1, 1);
		String string2 = new String("asda");
		map.put(string2, 2);
		
		Data duplicate = newData(1);
		
		System.out.println(newData1.hashCode());
		System.out.println(newData2.hashCode());
		System.out.println(duplicate.hashCode());
		String string3 = new String("asd");
		map.get(string3);
	}
	private static Data newData(int a) {
		Data d = new Data();
		d.a = a;
		return d;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return a;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Data d = (Data) obj;
		return a == d.a;
	}
	
	
}
