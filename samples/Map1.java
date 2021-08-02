package com.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class Map1<U,T> {
List<String> s = new ArrayList<>();
	LinkedList<T>[] value = new LinkedList[4];
	
	public static void main(String[] args) {

		Map1<Integer,String> map1 = new Map1<>();
		
		map1.put(1,"A");
		map1.put(2,"B");
		map1.put(3,"C");
		
		System.out.println(map1);
	}
	
	public int hash(U u) {
		return u.hashCode();
	}
	
	public void put(U id, T name) {
		LinkedList<T> data = value[hash(id)];
		
		if (data == null) {
			data = new LinkedList<>();
			data.add(name);
			value[hash(id)] = data;
		}else {
			data.add(name);
			value[hash(id)] = data;
		}
		System.out.println("Element added to map");
	}
	
	public T get(U index) {
		
		LinkedList<T> data = value[hash(index)];
		if(data == null) {
			return null;
		}
		for (T name:data) {
			if(name.equals(data)) {
				return name;
			}
		}
		return null;
	}
}
