package com.practise;

public class StackAsLinkedList {
	StackNode head;
	static class StackNode {
		int data;
		StackNode next;
		StackNode(int data){
			this.data = data;
		}
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int data) {
		StackNode newNode = new StackNode(data);
		if(head == null) {
			head = newNode;
		}else {
			StackNode temp = head;
			head = newNode;
			newNode.next = temp;
		}
	}
	public int pop() {
		int popped = Integer.MIN_VALUE;
		if(head == null) {
			System.out.println("Stack is empty");
		}else {
			popped = head.data;
			head = head.next;
		}
		return popped;
	}
	public int peek(){
		if(head == null) {
			System.out.println("Empty stack");
			return Integer.MIN_VALUE;
		}else {
			return head.data;
		}
	}	
	public static void main(String[] args) {
		StackAsLinkedList s = new StackAsLinkedList();
		System.out.println("Pop : "+s.pop());
		System.out.println("Peek : "+s.peek());
		System.out.println("Is stack empty? : "+s.isEmpty());
		s.push(42);
		s.push(15);
		s.push(18);
		System.out.println("Pop : "+s.pop());
		System.out.println("Peek : "+s.peek());
		System.out.println("Is stack empty? : "+s.isEmpty());
		s.push(50);
	}
}
