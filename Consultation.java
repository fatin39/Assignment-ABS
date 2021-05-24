package Booking_System;

public class Consultation {
	private String findings;
	private double consultationFee;
	
	public Consultation() {
		
	}
	public Consultation(String findings, double consultationFee) {
		this.findings = findings;
		this.consultationFee = consultationFee;
	}
	public String getFindings() {
		return findings;
	}
	public void setFindings(String findings) {
		this.findings = findings;
	}
	public double getConsultationFee() {
		return consultationFee;
	}
	public void setConsultationFee(double consultationFee) {
		this.consultationFee =  consultationFee;
	}
	public String toString() {
		return "\nFindings: " + findings + "\nConsultation Fee: " + consultationFee;
	}
}
