import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestHospital {

	public static void main(String[] args) {
		
		//file		
		File hosp = new File("C:\\Users\\naomi chan\\eclipse-workspace\\simple programme\\src\\Hosps.txt");	//info hosp
		//File dr = new File("C:\\Users\\naomi chan\\eclipse-workspace\\simple programme\\src\\"+HosptalID+".txt"); 
		//File dr2 = new File("C:\\Users\\naomi chan\\eclipse-workspace\\simple programme\\src\\drHosp2.txt");	//hospital2,specialty,doc 

		/*if(!dr1.exists() || ! dr2.exists() ){
			System.out.println("The file does not exist!");
			System.exit(0);
      
		}*/
		
		//scanner
		Scanner inHosp = null;
		Scanner in1 = null;
		//Scanner dr = null;
    
		try {
			inHosp = new Scanner(hosp);
			//inHosp2 = new Scanner(hosp2);

			//in1 = new Scanner(dr);
			//in2 = new Scanner(dr2);
		}
		catch(FileNotFoundException e) {
				System.out.println("   file not found ");
				System.exit(0);
		}
		
		//arraylist
		ArrayList<Hospital> hospitals = new ArrayList();
		ArrayList<Doctor> doctor_list = new ArrayList();
		String hospID;
		//read hospitalList 
		inHosp.useDelimiter(";");
		while(inHosp.hasNext()) {
			String hospName = inHosp.next();
			String hospWorkingHour = inHosp.next();
			String hospAddress = inHosp.next();
			hospID = inHosp.next();
		
			hospitals.add(new Hospital(hospName,hospWorkingHour,hospAddress,hospID)); //can add other argu
		}

		/*read the doctors along with its specialty in hospital 1
		File dr = new File("C:\\Users\\naomi chan\\eclipse-workspace\\simple programme\\src\\"+hospID+".txt");
    	try {

			in1 = new Scanner(dr);
			//in2 = new Scanner(dr2);
		}
		catch(FileNotFoundException e) {
				System.out.println("   file not found ");
				System.exit(0);
		}
    	
		in1.useDelimiter(":"); 
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
			hospitals.get(0).addDoctor(new Doctor(specialty,drName, drId, drPhone,new Schedule(scheduleDate,scheduleTime)));
			///hospitals.get(0).addDoctor(doctor_list);
		}*/


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
		input.nextLine();
		System.out.println("Enter password: ");
		String password = input.nextLine();
		System.out.println("Enter phone: ");
		String phone = input.nextLine();
		System.out.println("Enter historyRecord: ");	//maybe ask user enter file for input
		String historyRecord = input.nextLine();
		
		/*Booking details */
		for(int i = 0 ; i< hospitals.size(); i++) {
			System.out.print("\n" +(i+1) + ")" + hospitals.get(i));
		}
		System.out.println("Enter hospital (0 - hosp1, 1 - hosp 2) :");
		int hos = input.nextInt();

		/*for (int i = 0; i < hospitals.get(hos).getDoctor().size();i++) {
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
		
		String bookDate = input.nextLine();	//   
		System.out.println("enter booking time(1 = 8-10am....): ");
		String bookTime = input.nextLine();	//

		for(int i = 0; i < hospitals.get(hos).getDoctor().size(); i++){
			if(hospitals.get(hos).getDoctor().get(i).getDoctorName().equals(docName)){
				Booking booking = new Booking(bookingID, bookDate, bookTime, hospitals.get(hos));
				patientlist.add(new Patient(userID,name,email,DOB,password,phone,historyRecord,booking,hospitals.get(hos),hospitals.get(hos).getDoctor().get(i)));//hospitals.get(hos).getDoctor().get(i), booking, hospitals.get(hos)));
				System.out.println(patientlist.get(i).toString(i));
			}
			else
				System.out.println("not matching");
				System.exit(0);
		}*/
		/*System.out.println("enter schedule to book: ");		//int or string, because its date
		int bookDate = Integer.parseInt(input.nextLine());
		System.out.println("enter booking time(1 = 8-10am....): ");
		int bookTime = Integer.parseInt(input.nextLine());
		Hospital hospital = null;
		if(hos ==1) {
			for(int i = 0 ; i< doctor_list.size(); i++) {
				if(docName.equals(doctor_list.get(i).getDoctorName())) {
					Doctor doc = new Doctor(doctor_list.get(i).getSpecialty(),doctor_list.get(i).getDoctorName(),doctor_list.get(i).getDoctorID(),doctor_list.get(i).getPhone(),new Schedule(bookDate,bookTime));
					//hospital = new Hospital(hospitals.get(0).getHospitalName(), hospitals.get(0).getHospitalWorkingHours(), hospitals.get(0).getAddress(),bookingID, 
						//	new Doctor(doctor_list.get(i).getSpecialty(),doctor_list.get(i).getDoctorName(),doctor_list.get(i).getDoctorID(),doctor_list.get(i).getPhone(),new Schedule(bookDate,bookTime)));
					System.out.println(doc.toString());
					//System.out.println(hospital.toString());

					//Doctor doctor = new Doctor(doctor_list.get(i).getSpecialty(),doctor_list.get(i).getDoctorName(),doctor_list.get(i).getDoctorID(),doctor_list.get(i).getPhone(),new Schedule(bookDate,bookTime));
				}
			}
			//Hospital hosp = new Hospital(hospitals.get(0).getHospitalName(), hospitals.get(0).getWorkingHour(), hospitals.get(0).getAddress(),doctor);
			//Booking booking = new Booking(bookingID, bookingDate, bookingTime, hosp1);
			//Patient patient = new Patient();
		}
		else if(hos ==2) {
			
		}
		*/
		
	}

  }
