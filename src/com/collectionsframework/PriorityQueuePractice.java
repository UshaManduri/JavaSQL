package com.collectionsframework;

import java.util.PriorityQueue;

public class PriorityQueuePractice {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(1);
		pq.offer(11);
		pq.add(2);
		pq.add(3);
		pq.offer(3);
	
//		pq.add(1);
//		pq.offer(2);
//		pq.add(3);
//		pq.add(4);
//		pq.offer(4);
		
//		pq.add(5);
//		pq.offer(10);
//		pq.add(15);
//		pq.offer(20);
//		pq.add(25);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.contains(2));
		System.out.println(pq.isEmpty());
		pq.clear();
		System.out.println(pq);
	}

}
