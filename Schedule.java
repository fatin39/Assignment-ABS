package Booking_System;

import java.util.*;
public class Schedule extends Doctor{
	
	private int scheduleID;
	private int scheduleTime;
	private String scheduleDate;
	private String scheduleDesc;
	private Consultation consultation;
	private java.util.Date duration;
	
	public Schedule() {
		
	}
	
	public Schedule(int scheduleID, int scheduleTime, String scheduleDate, String scheduleDesc, Consultation consultation, java.util.Date duration) {
		this.scheduleID = scheduleID;
		this.scheduleTime = scheduleTime;
		this.scheduleDate = scheduleDate;
		this.scheduleDesc = scheduleDesc;
		this.consultation = consultation;
		this.duration = duration;
	}
	
	public int getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}
	public int getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(int scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getScheduleDesc() {
		return scheduleDesc;
	}
	public void setScheduleDesc(String scheduleDesc) {
		this.scheduleDesc = scheduleDesc;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public java.util.Date getDuration() {
		return duration;
	}
	public void setDuration(java.util.Date duration) {
		this.duration = duration;
	}
	public java.util.Date calcDuration() {
		
	}
	public String toString() {
		return "\nSchedule ID: " + scheduleID + "\nSchedule Time" + scheduleTime + "\nSchedule Date: " + scheduleDate + "\nSchedule Description: " + scheduleDesc + "\nConsultation: " + consultation + "\nDuration: " + duration;
	}

}
