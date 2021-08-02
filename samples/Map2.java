package com.practise;

import java.util.LinkedList;

public class Map2 {

	LinkedList<Employee>[] listArray = new LinkedList[4];
	
	
	public int hash(int id) {
		return id%4;
	}
	public void put(Employee emp) {
		int id = hash(emp.getId());
		LinkedList<Employee> dataList = listArray[id];
		if(dataList == null) {
			dataList = new LinkedList<>();
			dataList.add(emp);
			listArray[id] = dataList;
		}else {
			dataList.add(emp);
			listArray[id] = dataList;
		}
	}
	
	public Employee get(int index) {
		LinkedList<Employee> dataList = listArray[hash(index)]; 
		if(dataList == null) {
			return null;
		}else {
			for(Employee e:dataList) {
				if(e.getId() == index) {
					return e;
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
		
		Map2 map2 = new Map2();
		
		map2.put(e1);
		map2.put(e2);
		map2.put(e3);
		map2.put(e4);
		map2.put(e5);
		map2.put(e6);
		
		Employee emp1 = map2.get(3);
		System.out.println(emp1.name);
	}
	
}
