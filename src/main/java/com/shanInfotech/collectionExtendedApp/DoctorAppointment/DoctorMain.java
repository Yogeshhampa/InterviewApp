package com.shanInfotech.collectionExtendedApp.DoctorAppointment;

public class DoctorMain {

	public static void main(String[] args) {
		DoctorAppointmentScheduler scheduler = new DoctorAppointmentScheduler();
				// Scheduled appointments
		        scheduler.scheduleAppointment(new DoctorAppointment("A001", "Anitha", "Dr. Rao", "General Checkup", 10, "10:00 AM"));
		        scheduler.scheduleAppointment(new DoctorAppointment("A002", "Yashu", "Dr. Mehta", "Flu Symptoms", 20, "10:30 AM"));
		        scheduler.scheduleAppointment(new DoctorAppointment("A003", "Subbu", "Dr. Khan", "Back Pain", 30, "11:00 AM"));

		        // Urgent walk-in
		        scheduler.addWalkIn(new DoctorAppointment("A004", "Yogesh", "Dr. Rao", "Chest Pain", 91, "NOW"));

		        // Display full schedule
		        System.out.println("\nFULL SCHEDULE");
		        scheduler.displaySchedule();

		        // Display walk-ins
		        System.out.println("\nWALK-IN APPOINTMENTS");
		        scheduler.displayWalkIns();

		        // Display urgent cases
		        System.out.println("\nTOP URGENCY CASES (Urgency > 90)");
		        scheduler.displayUrgentCases(90);
		    
		}
		
	}



//private String appointmentId;
//private String patientName;
//private String doctorName;
//private String reason;
//private int urgencyLevel; 
//private String timeSlot;