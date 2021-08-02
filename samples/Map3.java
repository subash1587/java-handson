package com.practise;

import java.util.LinkedList;

public class Map3 {

	LinkedList<Entry>[] listArray = new LinkedList[4];
	
	static class Entry{
		int key;
		Employee value;
		
		Entry(int id, Employee e) {
			this.key = id;
			this.value =e;
		}
	}
	
	public int hash(int id) {
		return id%4;
	}
	public void put(int key, Employee value) {
		int hashcode = hash(key);
		LinkedList<Entry> dataList = listArray[hashcode];
		if(dataList == null) {
			dataList = new LinkedList<>();
			dataList.add(new Entry(key, value));
			listArray[hashcode] = dataList;
		}else {
			int alreadyIndex = -1;
			for(Entry data : dataList) {
				if(data.key == key) {
					data.value = value;
					return;
				}
			}
			dataList.add(new Entry(key, value));
			
		}
	}
	
	public Employee get(int key) {
		LinkedList<Entry> dataList = listArray[hash(key)]; 
		if(dataList == null) {
			return null;
		}else {
			for(Entry e:dataList) {
				if(e.key == key) {
					return e.value;
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"A");
		Employee e2 = new Employee(2,"B");
		Employee e3 = new Employee(3,"C");
		Employee e4 = new Employee(4,"D");
		Employee e5 = new Employee(5,"E");
		Employee e6 = new Employee(6,"F");
		
		Map3 map2 = new Map3();
		
		map2.put(1,e1);
		map2.put(1,e2);
		
		Employee emp1 = map2.get(1);
		System.out.println(emp1.name);
	}
	
}
