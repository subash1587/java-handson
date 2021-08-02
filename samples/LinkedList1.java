package com.practise;

public class LinkedList1 {
	
	Node head;
	static class Node{
		int data;
		Node next;
	}
	
	public static LinkedList1 insert(LinkedList1 list, int data) {
		Node new_node = new Node();
		new_node.data = data;
		new_node.next = null;
		if(list.head == null) {
			list.head = new_node;
		}else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	
	public static void printList(LinkedList1 list) {
		Node currNode = list.head;
		while(currNode.next != null) {
			System.out.println(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println(currNode.data);
	}
	
	public static LinkedList1 removeList(LinkedList1 list, int data) {
		Node currNode = list.head;
		Node prevNode = null;
		if(currNode != null && currNode.data == data) {
			list.head = currNode.next;
			Node nextNode = currNode.next;
		}
		while(currNode != null && currNode.data != data) {
			prevNode = currNode;
			currNode = currNode.next;
		}
		if(currNode != null) {
			prevNode.next = currNode.next;
		}
		return list;
	}

	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,4);
		list = insert(list,5);
		list = insert(list,6);
		
		printList(list);
		
		list = removeList(list,3);
		
		printList(list);
	}

}
