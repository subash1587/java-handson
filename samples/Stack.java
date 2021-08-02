package com.practise;

public class Stack {
	static final int MAX = 1000;
	int a[] = new int[MAX];
	int top;
	
	boolean isEmpty() 
	{
		return (top < 0);
	}
	Stack()
	{
		top = -1;
	}
	
	boolean push(int x)
	{
		if(top >= MAX-1) {
			System.out.println("Stack overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x +" pushed into stack");
			return true;
		}
	}
	int pop() 
	{
		if(top < 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	int peek()
	{
		if(top < 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop()+" popped from the stack");
		System.out.println(s.peek()+ " peek");
		System.out.println(s.isEmpty());
	}

}