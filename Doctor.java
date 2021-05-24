package Appointment_Booking_System_Class;

public class Doctor {
	private String specialty;
	private String doctorID;
	private String doctorName;
	private String phone;
	private Schedule schedule;
	private Consultation consultation;

  public Doctor() {}

  public Doctor(String specialty, String doctorName,String doctorID,String phone,Schedule schedule) {
	  this.doctorID = doctorID;
	  this.doctorName =doctorName;
	  this.phone = phone;
	  this.schedule = schedule;
	  this.specialty = specialty;
	  //this.consultation = consultation;
  }
public String getDoctorID() {
	return doctorID;
}
public void setDoctorID(String doctorID) {
	this.doctorID = doctorID;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName){
	this.doctorName = doctorName;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Schedule getSchedule() {
	return schedule;
}
public void setSchedule(Schedule schedule) {
	this.schedule = schedule;
}
public Consultation getConsultation() {
	return consultation;
}
public void setConsultation(Consultation consultation) {
	this.consultation = consultation;
}
public String getSpecialty() {
	return specialty;
}
public void setSpecialty(String specialty) {
	this.specialty = specialty;
}
@Override
public String toString() {
	return "\nDoctor: "+ doctorName + "\nDoctor's id: "+ doctorID + "\nDoctor's phone: " 
			+ schedule.toString() + consultation.toString();
}

public int size() {
	// TODO Auto-generated method stub
	return 0;
}

public char[] get(int i) {
	// TODO Auto-generated method stub
	return null;
}
  
}
