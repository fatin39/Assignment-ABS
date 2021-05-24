package Appointment_Booking_System_Class;

public class Patient {
	
	private int userID;
	private String name, email, DOB, password, phone, historyRecord;
	private Booking booking;
	
	Patient() {
		
	}
	
	
	Patient(int userID, String name, String email, String DOB, String password, String phone, String historyRecord, Booking booking) {
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.DOB = DOB;
		this.password = password;
		this.phone = phone;
		this.historyRecord = historyRecord;
		this.booking = booking;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDOB() {
		return DOB;
	}
	
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	
	public String getPass() {
		return password;
	}
	
	public void setPass(String password) {
		this.password = password;
	}
	
	public String getphone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getHistoryRecord() {
		return historyRecord;
	}
	
	public void setHistoryRecord(String historyRecord) {
		this.historyRecord = historyRecord;
	}
	
	public Booking getBooking() {
		return booking;
	}
	
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
}



