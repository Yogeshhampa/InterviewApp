package com.shanInfotech.collectionExtendedApp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class InterviewScheduler {
	public Queue<Interview> shedulequeue=new LinkedList<>();
	public Deque<Interview> walkInDeque=new ArrayDeque<>();
	public PriorityQueue<Interview> topPerformanceQueue = new PriorityQueue<>(
		    (a, b) -> Integer.compare(a.getScore(), b.getScore())
		);
	
	public void ScheduleInterview(Interview i) {
		shedulequeue.offer(i);
		topPerformanceQueue.offer(i);
		
	}
	public void walkCandidate(Interview i) {
		walkInDeque.add(i);//urgent walk in
		shedulequeue.add(i);
	}
	public void displaySchedule() {
		System.out.println("Schedule interview (FIFO) :");
		walkInDeque.forEach(System.out::println);
	}
	public void displayWalkIns() {
		System.out.println("Walk in Candidate (Deque)");
		walkInDeque.forEach(System.out::println);
	}
	
	public void displayTopscores(int threhold) {
		System.out.println("Shorlisted Candidate (score >"+threhold+")");
		topPerformanceQueue.stream().filter(i->i.getScore() > threhold).sorted(Comparator.comparing(Interview::getCandidateName)).forEach(System.out::println);
		
		
	}
	
	
}
