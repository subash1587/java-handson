package com.practise;

public class QueueSample {
	
	private int capacity;
	private int size;
	private int front;
	private int rear;
	private int array[];
	
	private QueueSample(int capacity) {
		this.capacity = capacity;
		size = 0;
		front = 0;
		rear = this.capacity - 1;
		array = new int[capacity];
	}
	
	boolean isFull(QueueSample queue) {
		return (queue.size == queue.capacity);
	}
	
	boolean isEmpty(QueueSample queue) {
		return(queue.size == 0);
	}
	
	private void enqueue(int data) {
		if(isFull(this)){
			return;
		}
		rear = (rear + 1)% capacity;
		size = size + 1;
		array[rear] = data;
		System.out.println(data + "added to queue");
	}
	
	private int dequeue() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		int item = array[front];
		front = (front + 1)%capacity;
		size = size - 1;
		return item;
	}
	
	private int front() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}else {
			return array[front];
		}
	}
	
	private int rear() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}else {
			return array[rear];
		}
	}
	
	public static void main(String[] args) {
		
		QueueSample queue = new QueueSample(1000);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(40);		
		queue.enqueue(30);
		
		System.out.println(queue.dequeue()+"removed from queue");
		System.out.println("Front : "+queue.front());
		System.out.println("Rear : "+queue.rear());
	}
}
