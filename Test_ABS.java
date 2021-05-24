package Appointment_Booking_System_TestClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import Appointment_Booking_System_Class.Doctor;
import Appointment_Booking_System_Class.Hospital;
import Appointment_Booking_System_Class.Patient;
import Appointment_Booking_System_Class.Schedule;

public class Test_ABS {

	public static void main(String[] args) {
		
		//file		
		File hosp = new File("C:\\Users\\naomi chan\\eclipse-workspace\\simple programme\\src\\Hosps.txt");	//info hosp
		File dr1 = new File("C:\\Users\\naomi chan\\eclipse-workspace\\simple programme\\src\\drHosp2.txt"); 
		File dr2 = new File("C:\\Users\\naomi chan\\eclipse-workspace\\simple programme\\src\\drHosp2.txt");	//hospital2,specialty,doc 

		/*if(!dr1.exists() || ! dr2.exists() ){
			System.out.println("The file does not exist!");
			System.exit(0);
      
		}*/
		
		//scanner
		Scanner inHosp = null;
		Scanner in1 = null;
		Scanner in2 = null;
		
		try {
			inHosp = new Scanner(hosp);
			//inHosp2 = new Scanner(hosp2);

			in1 = new Scanner(dr1);
			//in2 = new Scanner(dr2);
		}
		catch(FileNotFoundException e) {
				System.out.println("   file not found ");
				System.exit(0);
		}
		
		//arraylist
		ArrayList<Hospital> hospitals = new ArrayList();
		ArrayList<Doctor> doctor_list = new ArrayList();

		//read hospitalList 
		inHosp.useDelimiter(";");
		while(inHosp.hasNext()) {
			String hospName = inHosp.next();
			String hospWorkingHour = inHosp.next();
			String hospAddress = inHosp.next();
		
			hospitals.add(new Hospital(hospName,hospWorkingHour,null, hospAddress, 0, null)); //can add other argu
		}
		/**read the doctors along with its specialty in hospital 1*/
		in1.useDelimiter(";"); 
		while(in1.hasNext()){
			String specialty = in1.next(); //specialty is better to put in doctor class
			String drName = in1.next();
			String drId = in1.next();
			String drPhone = in1.next();
			int scheduleDate = Integer.parseInt(in1.next());
			int scheduleTime = Integer.parseInt(in1.next());
			///so Hospital class must have addDoctor(doctor: Doctor) method)
			///doctor_list.add(new Doctor(specialty,drName, drId, drPhone,new Schedule(scheduleDate,scheduleTime)));
			//hospitals.get(0).addDoctor(doctor_list.add(new Doctor(specialty,drName, drId, drPhone,new Schedule(scheduleDate,scheduleTime))));
			hospitals.get(0).addDoctor(new Doctor(specialty,drName, drId, drPhone,new Schedule(scheduleDate,scheduleTime, drPhone, drPhone, null, null)));
			///hospitals.get(0).addDoctor(doctor_list);
		}


		/**write the same code with atas punya code for hospital 2 to read the doctors in hospital 2
		but change the hospital.get(0) to hospital.get(1)*/
		//while(in2.hasNext()){
			//some codes
			//
			//
			// 
		
		ArrayList<Patient> patientlist = new ArrayList();
		Scanner input = new Scanner(System.in);		

		//prompt user enter patients details and booking time
		///*Patients details*/
		System.out.println("Enter user id: ");
		int userID = input.nextInt();
		input.nextLine();
		System.out.println("Enter name: ");
		String name = input.nextLine();
		System.out.println("Enter email: ");
		String email = input.next();
		System.out.println("Enter DOB: ");
		String DOB = input.nextLine();
		System.out.println("Enter password: ");
		String password = input.nextLine();
		System.out.println("Enter phone: ");
		String phone = input.nextLine();
		System.out.println("Enter historyRecord: ");	//maybe ask user enter file for input
		String historyRecord = input.nextLine();
		
		/*Booking details */
		for(int i = 0 ; i< hospitals.size(); i++) {
			System.out.println((i+1) + ")" + hospitals.get(i));
		}
		System.out.println("Enter hospital (0 - hosp1, 1 - hosp 2) :");
		int hos = input.nextInt();

		for (int i = 0; i < hospitals.get(hos).getDoctor().size();i++) {
			System.out.println(hospitals.get(hos).getDoctor().get(i));
		}

		input.nextLine();

		System.out.println("Enter specialty :");
		int specialty = input.nextInt();
		input.nextLine();

		System.out.println("enter doctor needed: ");
		String docName = input.nextLine();

		System.out.println("Enter booking ID: ");
		String s = input.next();
		int bookingID = Integer.parseInt(s);
  }
}