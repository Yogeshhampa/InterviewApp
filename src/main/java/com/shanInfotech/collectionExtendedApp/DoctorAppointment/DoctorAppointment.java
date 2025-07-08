package com.shanInfotech.collectionExtendedApp.DoctorAppointment;

public class DoctorAppointment {
	private String appointmentId;
	private String patientName;
	private String doctorName;
	private String reason;
	private int urgencyLevel; // 1 to 10 scale
	private String timeSlot;
	public DoctorAppointment() {
		super();
	}
	public DoctorAppointment(String appointmentId, String patientName, String doctorName, String reason,
			int urgencyLevel, String timeSlot) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.reason = reason;
		this.urgencyLevel = urgencyLevel;
		this.timeSlot = timeSlot;
	}
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getUrgencyLevel() {
		return urgencyLevel;
	}
	public void setUrgencyLevel(int urgencyLevel) {
		this.urgencyLevel = urgencyLevel;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	@Override
	public String toString() {
		return "DoctorAppointment [appointmentId=" + appointmentId + ", patientName=" + patientName + ", doctorName="
				+ doctorName + ", reason=" + reason + ", urgencyLevel=" + urgencyLevel + ", timeSlot=" + timeSlot + "]";
	}
	
	

}
