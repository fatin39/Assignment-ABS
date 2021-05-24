package Appointment_Booking_System_Class;

public class Booking {

	private int bookingID;
	private String bookingDate, bookingTime;
	private Doctor doctor;
	private Hospital hospital;
	
	public Booking() {
		
	}
	
	public Booking(int bookingID, String bookingDate, String bookingTime, Doctor doctor, Hospital hospital) {
		this.bookingID = bookingID;
		this.bookingDate = bookingDate;
		this.bookingTime = bookingTime;
		this.doctor = doctor;
		this.hospital = hospital;
	}
	
	public int getBookingID() {
		return bookingID;
	}
	
	public String getBookingDate() {
		return bookingDate;
	}
	
	public String getBookingTime() {
		return bookingTime;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	
	public Hospital getHospital() {
		return hospital;
	}
	
	public String toString() {
		return "Booking ID: " + bookingID +
				"Booking Date: " + bookingDate +
				"Booking Time: " + bookingTime +
				"Doctor: " + doctor +
				"Hospital: " + hospital;
	}
}
