package com.shanInfotech.collectionExtendedApp.DoctorAppointment;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DoctorAppointmentScheduler {
	    private Queue<DoctorAppointment> scheduledQueue = new LinkedList<>();
	    private Deque<DoctorAppointment> walkInDeque = new ArrayDeque<>();
	    private PriorityQueue<DoctorAppointment> urgentQueue = new PriorityQueue<>(
	        (a, b) -> Integer.compare(b.getUrgencyLevel(), a.getUrgencyLevel()) // Higher urgency first
	    );

	    public void scheduleAppointment(DoctorAppointment appointment) {
	        scheduledQueue.offer(appointment);
	        urgentQueue.offer(appointment);
	    }

	    public void addWalkIn(DoctorAppointment appointment) {
	        walkInDeque.addFirst(appointment); // Urgent walk-in at the front
	        scheduledQueue.add(appointment);
	    }

	    public void displaySchedule() {
	        System.out.println("Scheduled Appointments (FIFO):");
	        scheduledQueue.forEach(System.out::println);
	    }

	    public void displayWalkIns() {
	        System.out.println("Walk-in Appointments (Deque):");
	        walkInDeque.forEach(System.out::println);
	    }

	    public void displayUrgentCases(int threshold) {
	        System.out.println("Urgent Cases (Urgency > " + threshold + "):");
	        urgentQueue.stream()
	            .filter(a -> a.getUrgencyLevel() > threshold)
	            .sorted(Comparator.comparing(DoctorAppointment::getPatientName))
	            .forEach(System.out::println);
	    }
	}
	


