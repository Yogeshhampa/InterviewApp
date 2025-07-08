package com.shanInfotech.collectionExtendedAppqueuePque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QPque {
	private static void queMethod() {
		Deque<String> eventQue=new LinkedList<String>();
		eventQue.add("Sammer");
		eventQue.add("Amit");
		eventQue.add("apollo");
		eventQue.add("Lalita");
		eventQue.add("Manju");
		eventQue.add("Raveena");
		System.out.println("Queu:"+eventQue);
		System.out.println("Remove from 1st uses Lifo   :"+eventQue.remove());
		System.out.println("Offering new Value for the que 1st:"+eventQue.offer("   Lama"));
		System.out.println(eventQue);
		System.out.println("Gets the peek elements "+eventQue.peek());
		System.out.println("Retrieve and removes the elements"+eventQue.poll());
		System.out.println(eventQue);
	}
	
	private static void arrayDequeMethod() {
		ArrayDeque<String> eventQue=new ArrayDeque<String>();
		eventQue.add("Sammer");
		eventQue.add("Amit");
		eventQue.add("apollo");
		eventQue.add("Lalita");
		eventQue.add("Manju");
		eventQue.add("Raveena");
		System.out.println("ArrayDeqQueu:"+eventQue);
		System.out.println("Remove from 1st uses Lifo Using RemovLast  :"+eventQue.removeLast());
		System.out.println("Offering new Value for the que 1st:"+eventQue.offerFirst("   Lama"));
		System.out.println(eventQue);
		System.out.println("Gets the peek elements from last"+eventQue.peek());
		System.out.println("Retrieve and removes the elements"+eventQue.pollFirst());
		System.out.println(eventQue);
	}
	
	private static void priorityqueMethod() {
		PriorityQueue<String> eventQue=new PriorityQueue<String>();
		eventQue.add("Sammer");
		eventQue.add("Amit");
		eventQue.add("apollo");
		eventQue.add("Laita");
		eventQue.add("Manju");
		eventQue.add("Raveena");
		System.out.println("ArrayDeqQueu:"+eventQue);
		System.out.println("Remove from 1st uses fifo Using RemoveLast  :"+eventQue.remove());
		System.out.println("Offering new Value for the que 1st:"+eventQue.offer("   Lama"));
		System.out.println(eventQue);
		System.out.println("Gets the peek elements from last"+eventQue.peek());
		System.out.println("Retrieve and removes the elements"+eventQue.poll());
		System.out.println(eventQue);
	}
	
	
	public  static void main(String[] args) {
	
//		queMethod();
//		arrayDequeMethod();
		priorityqueMethod();
	}

}
