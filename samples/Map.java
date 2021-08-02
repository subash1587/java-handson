	package com.practise;

import java.util.HashMap;
import java.util.LinkedList;
public class Map {
	
	
	
	LinkedList<Employee>[] value = new LinkedList[4];

	public static void main(String[] args) {
		
		//HashMap<Integer, Employee> employeeMap = new HashMap<>();
		
		Employee e1 = new Employee(1, "Subash 1");	
		Employee e2 = new Employee(2, "Subash 2");
		Employee e3 = new Employee(3, "Subash 3");
		Employee e4 = new Employee(4, "Subash 4");
		Employee e5 = new Employee(5, "Subash 5");
		
		Map map = new Map();
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		map.put(4, e4);
		map.put(5, e5);
		
		System.out.println(map.get(4));
	}
	
	public void put(int id, Employee e) {
		
		LinkedList<Employee> data = value[hash(id)];
		if (data == null) {
			data = new LinkedList<>();
			data.add(e);
			 value[hash(id)]=data;
		}else {
			data.add(e);
			//value[hash(id)] = data;
		}
	}

	private int hash(int id) {
		return id%4;
	}
	
	public Employee get(int index) {
		LinkedList<Employee> data = value[hash(index)];
		if(data == null) return null;
		for(Employee emp:data) {
			if(emp.id == index) {
				return emp;
			}
		}
		return null;
	}

}
