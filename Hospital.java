package Appointment_Booking_System_Class;

import java.util.Date;

public class Hospital {

	private String hospitalName, hospitalSpecialty, address;
	private java.util.Date hospitalWorkingHours;
	private int bookingID;
	private Doctor doctor;
	
	public Hospital() {
		
	}
	
	public Hospital(String hospitalName, String hospitalSpecialty, Date hospitalWorkingHours, 
			String address, int bookingID,  Doctor doctor) {
		this.hospitalName = hospitalName;
		this.hospitalSpecialty = hospitalSpecialty;
		this.hospitalWorkingHours = hospitalWorkingHours;
		this.address = address;
		this.bookingID = bookingID;
		this.doctor = doctor;
	}
	
	public String getHospitalName() {
		return hospitalName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getHospitalSpecialty() {
		return hospitalSpecialty;
	}

	
	public java.util.Date getHospitalWorkingHours() {
		return hospitalWorkingHours;
	}

	public int getBookingID() {
		return bookingID;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public String toString() {
		return "Hospital name: " + hospitalName + 
				"Address: " + address +
				"Specialty: " + hospitalSpecialty +
				"Working hours: " + hospitalWorkingHours +
				"Booking ID: " + bookingID + 
				"Doctor: " + doctor;
				
				
	}

	public void addDoctor(Doctor doctor2) {
		// TODO Auto-generated method stub
		
	}
	
}
